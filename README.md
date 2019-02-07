# Reagent/firebase Boilerplate project
Now I don't have to spend a day setting all this up every time I need a new project

## Setup
```
$ npm install
$ npm run dev
```

- search/replace all occurrences of `myproject` with your project name.

## Setup Firebase
I'm running firebase 4.6.2 because arch linux's GCC libraries are too new and there is a bug in more current firebase versions (oct 2018)

- create a new project at https://firebase.google.com
- install firebase-tools `yay firebase-tools`
- init firebase for your project `firebase init` select the default options and the options that make sense. You should see the project you created, if not try `firebase use --add`
- copy your firebase key from the firebase website for your project into `src/fb/init.cljs` [see docs](https://firebase.google.com/docs/web/setup?authuser=0)
- search/replace all occurrences of `my-firebase-project` with your project

## Deploy
```
$ npm run release
$ firebase deploy
```
