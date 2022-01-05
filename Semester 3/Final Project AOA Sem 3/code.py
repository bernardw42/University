import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import math
import datetime


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


def sortAnimeNameAscend(type):
    start_time = datetime.datetime.now()
    df = pd.read_csv("anime.csv")
    df = df.sort_values(by='name', axis = 0, ascending = True, kind=type)
    df.to_csv("animeAscending.csv", encoding='utf-8', index=False)
    end_time = datetime.datetime.now()
    time_diff = (end_time - start_time)
    execution_time = time_diff.total_seconds() * 1000000
    print(f"exec time = {execution_time} nanoseconds")


def sortAnimeNameDescend(type):
    start_time = datetime.datetime.now()
    df = pd.read_csv("anime.csv")
    df = df.sort_values(by='name', axis=0, ascending=False, kind=type)
    df.to_csv("animeDescending.csv", encoding='utf-8', index=False)
    end_time = datetime.datetime.now()
    time_diff = (end_time - start_time)
    execution_time = time_diff.total_seconds() * 1000000
    print(f"exec time = {execution_time} nanoseconds")

def sortAnimeRatesAscend(type):
    start_time = datetime.datetime.now()
    df = pd.read_csv("anime.csv")
    df = df.sort_values(by='rating', axis=0, ascending=True, kind=type)
    df.to_csv("animeRateAscending.csv", encoding='utf-8', index=False)
    end_time = datetime.datetime.now()
    time_diff = (end_time - start_time)
    execution_time = time_diff.total_seconds() * 1000000
    print(f"exec time = {execution_time} nanoseconds")

def sortAnimeRatesDescend(type):
    start_time = datetime.datetime.now()
    df = pd.read_csv("anime.csv")
    df = df.sort_values(by='rating', axis=0, ascending=False, kind=type)
    df.to_csv("animeRateDescending.csv", encoding='utf-8', index=False)
    end_time = datetime.datetime.now()
    time_diff = (end_time - start_time)
    execution_time = time_diff.total_seconds() * 1000000
    print(f"exec time = {execution_time} nanoseconds")



if __name__ == '__main__':
    while True:

        print(f"\n\nAnalysis of Algorithms = ")
        print(f"1. Total Anime Name per Rating")
        print(f"2. Total Anime Name per Type")
        print(f"3. Total Anime name per genre")
        print(f"4. Average Rating per Type")
        print(f"5. Average Rating per Genre")
        print(f"6. Sort the database by Name")
        print(f"7. Sort the database by rating")
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
            print("in which order:")
            print("1. Ascending")
            print("2. Descending")
            Choice2 = int(input("Input a NUMBER to continue = "))
            if (Choice2 == 1):
                print("Your choice of sorting method are:")
                print("1. Quick Sort")
                print("2. Merge Sort")
                print("3. Heap Sort")
                print("4. Stable")
                Choice3 = int(input("Input a NUMBER to continue = "))
                if  (Choice3 == 1):
                    sortAnimeNameAscend('quicksort')
                elif (Choice3 == 2):
                    sortAnimeNameAscend('mergesort')
                elif (Choice3 == 3):
                    sortAnimeNameAscend('heapsort')
                elif (Choice3 == 4):
                    sortAnimeNameAscend('stable')
                print("The sorted database can be viewed from the created csv file under the name, animeAscending.csv")

            elif (Choice2 == 2):
                print("Your choice of sorting method are:")
                print("1. Quick Sort")
                print("2. Merge Sort")
                print("3. Heap Sort")
                print("4. Stable")
                Choice3 = int(input("Input a NUMBER to continue = "))
                if (Choice3 == 1):
                    sortAnimeNameDescend('quicksort')
                elif (Choice3 == 2):
                    sortAnimeNameDescend('mergesort')
                elif (Choice3 == 3):
                    sortAnimeNameDescend('heapsort')
                elif (Choice3 == 4):
                    sortAnimeNameDescend('stable')
                print("The sorted database can be viewed from the created csv file under the name, animeDescending.csv")

        elif Choice1 == 7:
            print("in which order:")
            print("1. Ascending")
            print("2. Descending")
            Choice2 = int(input("Input a NUMBER to continue = "))
            if (Choice2 == 1):
                print("Your choice of sorting method are:")
                print("1. Quick Sort")
                print("2. Merge Sort")
                print("3. Heap Sort")
                print("4. Stable")
                Choice3 = int(input("Input a NUMBER to continue = "))
                if (Choice3 == 1):
                    sortAnimeRatesAscend('quicksort')
                elif (Choice3 == 2):
                    sortAnimeRatesAscend('mergesort')
                elif (Choice3 == 3):
                    sortAnimeRatesAscend('heapsort')
                elif (Choice3 == 4):
                    sortAnimeRatesAscend('stable')
                print("The sorted database can be viewed from the created csv file under the name, animeRateAscending.csv")
            elif (Choice2 == 2):
                print("Your choice of sorting method are:")
                print("1. Quick Sort")
                print("2. Merge Sort")
                print("3. Heap Sort")
                print("4. Stable")
                Choice3 = int(input("Input a NUMBER to continue = "))
                if (Choice3 == 1):
                    sortAnimeRatesDescend('quicksort')
                elif (Choice3 == 2):
                    sortAnimeRatesDescend('mergesort')
                elif (Choice3 == 3):
                    sortAnimeRatesDescend('heapsort')
                elif (Choice3 == 4):
                    sortAnimeRatesDescend('stable')
                print("The sorted database can be viewed from the created file under the name, animeRateDescending.csv")

        elif Choice1 == 0: break