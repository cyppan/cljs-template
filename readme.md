# Clojure Script Intellij (Cursive) template

<img width="467" alt="Capture d’écran 2021-06-19 à 09 44 49" src="https://user-images.githubusercontent.com/1446201/122635239-95651180-d097-11eb-9228-e0626ea6e867.png">

What's used in this template:
- tools.deps (the Clojure default package manager)
- shadow-cljs (easy ClojureScript compilation - the browser is targeted in this template)
- Reagent (the popular cljs React wrapper)
- Intellij (IDE): the configuration is versioned so you don't have to setup everything by yourself (including the run configurations)

## Cursive development flow

### Setup project first
In order to use the project with Cursive, you have to first generate the maven deps file and import / reload it into Intellij.
```
npx shadow-cljs pom
```

### Get started

Two run configurations are available:
- watch app (which runs a shadow-cljs watch app): should be started continuously
- REPL (starts a remote REPL connected to your app): should also be started continuously, you can "send forms" from the opened files as usual with the Cursive REPL.

**Note**: once in the Cursive REPL, type `(shadow/repl :app)` to launch the shadow cljs REPL.

## Chrome console setup

You'll probably need to enable custom console formatters to see the Clojure data structures nicely formatted by the devtools, click the settings icon (upper right) and enable it:

<img width="438" alt="Capture d’écran 2021-06-19 à 09 38 38" src="https://user-images.githubusercontent.com/1446201/122635277-ccd3be00-d097-11eb-9fe5-8bcd30b08578.png">

<img width="900" alt="Capture d’écran 2021-06-19 à 09 52 45" src="https://user-images.githubusercontent.com/1446201/122635419-ad896080-d098-11eb-9593-2be712c062b7.png">

