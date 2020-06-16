git status

git rm -r --cached .idea
git rm -r --cached '*.iml'

echo '.idea' >> .gitignore
echo '*.iml' >> .gitignore

git commit -m "delete .idea and *.iml"

git push origin master

java -Xmx=514 -encoding=UTF-8

java -jar pack.jar -d=c:\project\job4j\ -e=java -o=project.zip