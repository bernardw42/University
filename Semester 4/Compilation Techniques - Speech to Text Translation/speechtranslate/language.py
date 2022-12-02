from translate import Translator

#Language Option ------------
def indonesian(ori):
    to_lang = "id"
    res = Translator(to_lang).translate(ori)
    print("\nTranslated Language: ",res)

def mandarin(ori):
    to_lang = "zh"
    res = Translator(to_lang).translate(ori)
    print("\nTranslated Language: ",res)

def japanese(ori):
    to_lang = "ja"
    res = Translator(to_lang).translate(ori)
    print("\nTranslated Language: ",res)

def espanyol(ori):
    to_lang = "es"
    res = Translator(to_lang).translate(ori)
    print("\nTranslated Language: ",res)

def korean(ori):
    to_lang = "ko"
    res = Translator(to_lang).translate(ori)
    print("\nTranslated Language: ",res)