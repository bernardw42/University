import PySimpleGUI as sg
import language
import main

#Audio MSG -------------------
ori = main.ori

#Windows ---------------------
windowName = "Translater"

windowSizeX=400
windowSizeY=300
windowSize=(windowSizeX,windowSizeY)

values = ["Indonesian","Chinese","Japanese","Spanish","Korean"]

windowLayout = \
[
    [sg.Multiline(default_text="Original un-translated text",size=(50,10),no_scrollbar=True,enter_submits=False)],
    [sg.Multiline(default_text="Translated text will show here",size=(50,10),no_scrollbar=True,enter_submits=False)],
    [sg.Button("Translate"),sg.Listbox(values,default_values="Indonesian",size=(20,3),no_scrollbar=True)]
]

window = sg.Window(windowName, windowLayout)

#Main ------------------------
if __name__ == "__main__":

    print("Original Line: ",ori)
    print("\nChoose a number for language translation:\n1.Indonesian\n2.Chinese\n3.Japanese\n4.Spanish\n5.Korean")

    choice = int(input("Input the number: "))
    if choice == 1:
        language.indonesian(ori)
    elif choice == 2:
        language.mandarin(ori)
    elif choice == 3:
        language.japanese(ori)
    elif choice == 4:
        language.espanyol(ori)
    else:
        language.korean(ori)

 #   print(ori)
#
 #   while True:
  #      event, values = window.read()
   #     if event == sg.WIN_CLOSED:
    #        break
#
 #       if event == "Translate":
  #          values[0] = ori
   #         print(values[1])
#
#    window.close()