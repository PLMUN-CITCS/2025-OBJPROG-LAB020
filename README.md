# **2025-OBJPROG-LAB016**
Week 05 - Methods in Java

Laboratory # 16 - Guided Coding Exercise 5: Method Overloading

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 16 - Guided Coding Exercise 5: Method Overloading**

   **Objective:**
   - Define and use method overloading to write cleaner and more modular code.
   - Understand that methods with the same name can coexist if they have different parameter lists.

   **File Naming Convention:**
   - `MethodOverloading.java`

   **Desired Output:**
   ```txt
   Integer value: 10
   Double value: 3.14
   String value: Hello!
   ```

   **Notable Observations (to be discussed after completing the exercise):**
   - You have defined three methods with the same name (printValue) but with different parameter lists. This is method overloading.
   - The Java compiler determines which method to call based on the type of the argument you provide.

   **Java Programming Best Practices:**
   - Use method overloading when you have methods that perform similar tasks but operate on different data types or a different number of inputs.
   - Ensure that the overloaded methods have distinct parameter lists so the compiler can differentiate between them.
      
   **Step-by-Step Instructions:**

   1. Setup Class and Main Method
      - Create a file named `MethodOverloading.java`.
      - Define the class `MethodOverloading` and the `main` method.
      ```Java      
      public class MethodOverloading {
          public static void main(String[] args) {
      
          }
      }
      ```
            
   2. Create the First printValue Method
      - After the closing brace of main, type public static void printValue(int number) {}
      - Inside this method, add: System.out.println("Integer value: " + number);
      ```Java
      public class MethodOverloading {
          //... (main method)...
          public static void printValue(int number) {
              System.out.println("Integer value: " + number);
          }
      }
      ```

   3. Create the Second printValue Method
      - After the first printValue method, type public static void printValue(double number) {}
      - Inside this method, add: System.out.println("Double value: " + number);
      ```Java
      public class MethodOverloading {
          //... (main and first printValue methods)...
          public static void printValue(double number) {
              System.out.println("Double value: " + number);
          }
      }
      ```

   4. Create the Third printValue Method
      - After the second printValue method, type public static void printValue(String text) {}
      - Inside this method, add: System.out.println("String value: " + text);
      ```Java
      public class MethodOverloading {
          //... (main and other printValue methods)...
          public static void printValue(String text) {
              System.out.println("String value: " + text);
          }
      }
      ```

   5. Call the printValue Methods
      - In main, add these lines:
         - printValue(10);
         - printValue(3.14);
         - printValue("Hello!");
      ```Java
      public class MethodOverloading {
          public static void main(String args) {
              printValue(10);
              printValue(3.14);
              printValue("Hello!");
          }
          //... (printValue methods)...
      }
      ```

   6. Compile and Run
       - Save the file as `MethodOverloading.java`.
       - Compile the code using `javac MethodOverloading.java` in your terminal or command prompt.
       - Run the compiled code using `java MethodOverloading`.

   **Conclusion**
   This exercise demonstrated the concept of method overloading in Java. Method overloading allows you to create multiple methods with the same name, as long as they have different parameter lists. This can make your code more concise, readable, and organized, especially when dealing with similar operations on different data types.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 16"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
