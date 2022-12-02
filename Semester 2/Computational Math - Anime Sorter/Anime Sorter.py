#!/usr/bin/env python
# coding: utf-8

# In[1]:


# Importing necessary libraries
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import math


# In[2]:


sns.set_style("darkgrid")

def totalAnime_type():
    print("Total Anime Name per Type\n")
    df = pd.read_csv("anime.csv", usecols=['type', 'name'])
    df2 = df.groupby(['type'], as_index=False).count()
    print(df2)
    df2.plot.bar(x='type', y='name')


def totalAnime_rating():
    print("Total Anime Name per Rating\n")
    df = pd.read_csv("anime.csv", usecols=['rating', 'name'])
    df2 = df['rating'].apply(np.ceil)
    df3 = df2.groupby(df2).count()
    print(df3)
    df3.plot.bar(x='rating', y='name')


def totalAnime_genre():
    df = pd.read_csv("anime.csv")
    GenreDict = {}
    X = []
    Y = []
    print("Total Animes per Genre\n")
    print("Disclaimer: Animes with multiple genres will be counted for each genre")
    for i in df.index:
        if type(df['genre'][i]) is str:
            genreList = df['genre'][i].split(", ")
            for n in genreList:
                if n in GenreDict:
                    GenreDict[n] = GenreDict[n] + 1
                else:
                    GenreDict[n] = 1

    for i in GenreDict:
        print(f"{i} = {GenreDict[i]}")
        X.append(i)
        Y.append(GenreDict[i])

    plt.bar(X, Y)

def avgRating_Type():
    print("Average Rating per Anime Type\n")
    df = pd.read_csv("anime.csv")
    df1 = df.fillna(df['rating'].mean())
    df.sort_values('type')
    df_price = df.groupby('type').mean()['rating']

    plt.style.use('grayscale')
    plt.plot(df_price, marker='o')
    plt.title('Average Rating per Anime Type')
    plt.xlabel('type')
    plt.ylabel('rating')
    plt.tight_layout()
    print(df_price)

def avgRating_Genre():
    df = pd.read_csv("anime.csv")
    GenreDict = {}
    genreDicttotal = {}
    avgrating = {}
    X = []
    Y = []
    print("Total Animes per Genre\n")
    print("Disclaimer: Animes with multiple genres will be counted for each genre")
    df2 = df['rating'].apply(np.ceil)
    print(df2[12285])
    for i in df.index:
        if type(df['genre'][i]) is str:
            genreList = df['genre'][i].split(", ")
            for n in genreList:
                if n in GenreDict:
                    if math.isnan(df2[i]):
                        genreDicttotal[n] = genreDicttotal[n] + 0
                        GenreDict[n] = GenreDict[n] + 1
                    else:
                        genreDicttotal[n] = genreDicttotal[n] + df2[i]
                        GenreDict[n] = GenreDict[n] + 1
                else:
                    GenreDict[n] = 1
                    genreDicttotal[n] = df2[i]
    for i in genreDicttotal:
        if i in avgrating:
            avgrating[i] = avgrating[i] + (genreDicttotal[i]/GenreDict[i])
        else:
            avgrating[i] = (genreDicttotal[i]/GenreDict[i])
    for i in avgrating:
        print(f"{i} = {avgrating[i]}")
        X.append(i)
        Y.append(avgrating[i])
    plt.bar(X, Y)


def hypoAnimeRating_Type(userinput):
    df = pd.read_csv("anime.csv")
    df1 = df.fillna(df['rating'].mean())
    df.sort_values('type')
    df_price = df.groupby('type').mean()['rating']

    print(f"based on our findings the predicted rating of new anime with type {userinput} will be {df_price[userinput]} stars")

def hypoAnimeRating_Genre(userinput):
    df = pd.read_csv("anime.csv")
    GenreDict = {}
    genreDicttotal = {}
    avgrating = {}
    userAvgRatingtotal = 0
    userAvgRatingitems = 0
    print("Hypothesis average rating of new Anime based on Genre(s)\n")
    print("Disclaimer: Animes with multiple genres will be counted for each genre")
    df2 = df['rating'].apply(np.ceil)
    for i in df.index:
        if type(df['genre'][i]) is str:
            genreList = df['genre'][i].split(", ")
            for n in genreList:
                if n in GenreDict:
                    if math.isnan(df2[i]):
                        genreDicttotal[n] = genreDicttotal[n] + 0
                        GenreDict[n] = GenreDict[n] + 1
                    else:
                        genreDicttotal[n] = genreDicttotal[n] + df2[i]
                        GenreDict[n] = GenreDict[n] + 1
                else:
                    GenreDict[n] = 1
                    genreDicttotal[n] = df2[i]
    for i in genreDicttotal:
        if i in avgrating:
            avgrating[i] = avgrating[i] + (genreDicttotal[i] / GenreDict[i])
        else:
            avgrating[i] = (genreDicttotal[i] / GenreDict[i])

    for item in userinput:
        if item in avgrating:
            userAvgRatingtotal += avgrating[item]
            userAvgRatingitems += 1
    print(f"Based on out findings, the predicted rating of the anime is {userAvgRatingtotal/userAvgRatingitems}")


# In[ ]:


if __name__ == '__main__':
    while True:

        print(f"\n\nDescriptive statistics = ")
        print(f"1. Total Anime Name per Rating")
        print(f"2. Total Anime Name per Type")
        print(f"3. Total Anime name per genre")
        print(f"4. Average Rating per Type")
        print(f"5. Average Rating per Genre")
        print(f"Inferential stastistics = ")
        print(f"6. Hypothesize New Anime Rating by Genre") #take all the genre's avg rating and average that to make the answer
        print(f"7. Hypothesize New Anime Rating by Type") #just take the avg rating.
        print("------------------------------------------")
        print("0. Exit")

        Choice1 = int(input("Input a NUMBER to continue = "))
        print(f"\n")
        if (Choice1 == 1):
            totalAnime_rating()
            plt.show()
        elif Choice1 == 2:
            totalAnime_type()
            plt.show()
        elif Choice1 == 3:
            totalAnime_genre()
            plt.show()
        elif Choice1 == 4:
            avgRating_Type()
            plt.show()
        elif Choice1 == 5:
            avgRating_Genre()
            plt.show()
        elif Choice1 == 6:
            animeGenre = {"Drama", "Romance", "School", "Supernatural" , "Action", "Adventure", "Fantasy", "Magic",
                               "Military", "Shounen", "Comedy", "Historical", "Parody", "Samurai", "Sci-Fi", "Thriller",
                               "Sports", "Super Power", "Space", "Slice of Life", "Mecha", "Music", "Mystery", "Seinen",
                               "Martial Arts", "Vampire", "Shoujo", "Horror", "Police", "Psychological", "Demons", "Ecchi",
                               "Josei", "Shounen Ai", "Game", "Dementia", "Harem", "Cars", "Kids", "Shoujo Ai","Hentai",
                               "Yaoi", "Yuri"}
            print("What type will the new Anime be ?")
            print("Drama || Romance || School || Supernatural || Action || Adventure || Fantasy || Magic || Military \n"
                  "Shounen || Comedy || Historical || Parody || Samurai || Sci-Fi || Thriller || Sports || Super Power \n"
                  "Space || Slice of Life || Mecha || Music || Mystery || Seinen || Martial Arts || Vampire || Shoujo \n"
                  "Horror || Police || Psychological || Demons || Ecchi || Josei || Shounen Ai || Game || Dementia || Harem \n"
                  "Cars || Kids || Shoujo Ai || Hentai || Yaoi || Yuri")
            print("Please input EXACTLY as shown above")
            print("Input 'done' when finished")
            hypoChoiceArray = []
            while True:
                hypoChoice = input()
                if hypoChoice == "done": break
                elif hypoChoice in animeGenre:
                    hypoChoiceArray.append(hypoChoice)
                else:
                    print("Error input")
            hypoAnimeRating_Genre(hypoChoiceArray)

        elif Choice1 == 7:
            animetypes = {"Movie", "Music", "OVA", "ONA", "Specials", "TV Anime"}
            print("What type will the new Anime be ?")
            print("Movie || Music || OVA || ONA || Specials || TV Anime")
            print("Please input EXACTLY as shown above")
            hypoChoice2 = input()
            if hypoChoice2 in animetypes:
                hypoAnimeRating_Type(hypoChoice2)
            else: print("Error input")

        elif Choice1 == 0: break

        else: print("Error input")


# In[ ]:




