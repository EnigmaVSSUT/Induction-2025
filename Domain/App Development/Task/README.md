<p align="center">
  <img src="https://media.giphy.com/media/xUA7bdpLxQhsSQdyog/giphy.gif" width="60%">
</p>

<h1 align="center"> App Development Induction Task 2025</h1>

Welcome to the **App Development Domain** of **Enigma – The Web & Coding Club**!  
This is your first step into building amazing mobile applications using Android Studio. Let's begin by creating your **Portfolio App**!

---

## Before proceeding to the task

Now, anytime any changes take place in the main repository, your forked repository must pull those changes from the main repository before it can push other changes to the main repository.

1) Go to the [Enigma repository](https://github.com/EnigmaVSSUT/Induction-2025) and copy the repo address just like you copied your forked repo's address in task 1.

2) Open gitbash in your cloned repo and type:
```
git remote add upstream <copied repo address>
```
This adds a reference to the main repository from which we can pull the updates.

3) Now enter:
```
git pull upstream main
```
This should now pull all the changes that have been made to the main repo from merging the pull requests.

4) Now add, commit and push the changes just like you did in task 1 and create a pull request.

---

## Task Objective

Create a **Portfolio App** using **only XML (no Java/Kotlin)**.  
The app should display your profile with scrollable content and must include your personal details, hobbies, and contact links.

---

## Task Requirements

Your app must include the following sections:

### ✅ 1. **ScrollView Layout**
- Use `ScrollView` to make the entire layout scrollable.
- Place your views inside a `LinearLayout` (or similar) to make sure they stack properly.
  
>  A `ScrollView` allows vertical scrolling when the content height is more than the screen.

### ✅ 2. **Profile Image**
- Add a photo of yourself (or an avatar) using `ImageView`.
- You can style it as circular using XML attributes or background shapes.

### ✅ 3. **About Me**
- Write a small paragraph about yourself – who you are, what you do, etc.

### ✅ 4. **Hobbies Section**
- Add 3–5 hobbies using `TextViews`, `CardViews`, or styled sections.

### ✅ 5. **Contact Links**
Include clickable links using `Intent` to open:
- GitHub
- LinkedIn
- Gmail (use email intent to launch mail app)

> 🔗 You don't need Java/Kotlin. Just design buttons or text views for now.

### ✅ 6. **Attractive Background (Mandatory)**
Choose **any one**:
- Solid color (`android:background="#HEXCODE"`)
- Gradient background using a `drawable`
- A background image

Make sure all text remains **readable** over your background.

---

## Bonus (Optional)
- Use custom fonts
- Add animations (if you're feeling adventurous)
- Design your hobby section with icons or cards
- Use rounded corners and shadows for elements

---

## Submission Guidelines

- Create a new GitHub repository named `portfolio-app-enigma`
- Upload your complete Android Studio project to this repository
- Share your repository link with us in the designated group or form
- Inside the 'App Development>Task' folder create a folder of your name. Inside the folder add your source code and a folder named `screenshots` containing screenshots of your app .

> Note: Make sure your repository is public so we can access and evaluate your work.

---

## Final Note

This task focuses on UI design using XML layouts in Android. Don't worry about functionality—we'll cover that later! Focus on creating an attractive, well-organized portfolio that showcases your design skills.

> "Start where you are. Use what you have. Do what you can." – Team Enigma 💚

📱 Happy Coding & Good Luck!
