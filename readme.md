# Clojure Script Intellij (Cursive) template

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
