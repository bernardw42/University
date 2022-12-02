import speech_recognition as s

#Audio Input ---------------

sound = s.Recognizer()

with s.Microphone() as source:
    print("Welcome to Speech Translation\n")
    print("Please Speak")
    sound.pause_threshold=2
    audio = sound.listen(source, timeout=1, phrase_time_limit=0)

    try:
        text = sound.recognize_google(audio)
        print('Converting audio transcripts into text ...')
        ori ='{}'.format(text)

    except:

        print('Sorry we could not recognize your voice')