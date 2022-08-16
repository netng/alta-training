# DAY 1 - VERSION CONTROL

## CREATE NEW GIT REPO
Untuk membuat repository baru di github yaitu dengan cara klik `New Repository`, setelah itu akan terbentuk new empty repository yang mana perlu di initialisasi pada local komputer. Jika tahapan initialization sudah selesai maka kurang lebih tampilan repository seperti dibawah ini:
![new repo](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/git-repo.png)

## BRANCHING
Untuk membuat branch baru pada existing repository, bisa dengan beberapa cara yaitu melalui command line dan melalui github web page:

- Create New Branch via Commandline
```$ git branch nama-branch-baru
$ git checkout nama-branch-baru
$ git push origin nama-branch-baru
```

- Create New Branch via github web
Dengan cara mengklik pada dropdown menu Branch pada repository terkait > lalu klik `View all branch` > klik tombol `New branch` > tentukan nama branch nya dan pilih Branch Source nya.

hasil akhir nya untuk kedua cara diatas kurang lebih seperti gambar dibawah ini:
![git branch](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/new-branch.png)
![git branch github web](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/git-branch-on-github-web.png)

## IMPLEMENTASI GIT PUSH, PULL, STASH, MERGE
### PUSH
![git push](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/git-push.png)GI

### PULL
![git pull](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/git-pull.png)


### STASH
![git stash](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/git-stash.png)

### MERGE
![git merge](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/merging.png)


## GIT CONFLICT HANDLING
Dibawah ini adalah gambar simulasi penangan conflict pada git.
![git conflict handling-a](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/conflict-a.png)
![git conflict handling-b](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/conflict-b.png)
![git conflict handling-c](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/conflict-c.png)

## GIT NO FAST-FORWARD / --no-ff
![git no ff](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/git-merge-no-ff.png)

## GIT NETWORK
Untuk task ini saya kurang mengerti maksud git network, mungkin yang dimaksud adalah git log dengan tampilan graph, jika ya maka tampilannya seperti dibawah ini:
![git network](https://github.com/netng/alta-training/blob/development/day-1/version-control/assets/day%201%20-%20git/git-network-graph.png)


