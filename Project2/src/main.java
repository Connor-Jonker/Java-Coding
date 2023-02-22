import java.util.*;
import java.io.*;

public class main {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int bid, qty;
		int flag1 = 0;
		while (flag != 5) {
			System.out.println("Choose One of the following");
			System.out.println("1. Read info from an external file");
			System.out.println("2. Merge Files");
			System.out.println("3. Sort Files");
			System.out.println("4. Filter Files");
			System.out.println("5. Quit");
			flag = sc.nextInt();

			if (flag == 1) {
				try {
					Scanner myObj2 = new Scanner(System.in);
					System.out.println("Enter a number between 1 & 3");
					String number = myObj2.nextLine();
					File myObj = new File("countries" + number + ".txt");

					Scanner myReader = new Scanner(myObj);
					while (myReader.hasNextLine()) {
						String data = myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();
				} catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();

				}
				flag = 1;
			}
			if (flag == 2) {
				PrintWriter pw = new PrintWriter("countriesmerge.txt");
				BufferedReader br = new BufferedReader(new FileReader("countries1.txt"));
				String line = br.readLine();
				while (line != null) {
					pw.println(line);
					line = br.readLine();
				}
				br = new BufferedReader(new FileReader("countries2.txt"));
				line = br.readLine();
				while (line != null) {
					pw.println(line);
					line = br.readLine();
				}
				br = new BufferedReader(new FileReader("countries3.txt"));
				line = br.readLine();
				while (line != null) {
					pw.println(line);
					line = br.readLine();
				}
				pw.flush();
				br.close();
				pw.close();
				System.out.println("A new merged file has been created named countriesmerge.txt in the source folder");
				flag = 1;
			}
			if (flag == 3) {
				BufferedReader reader = null;

				BufferedWriter writer = null;
				ArrayList<String> lines = new ArrayList<String>();
				try {
					reader = new BufferedReader(new FileReader("allcountry.txt"));
					String currentLine = reader.readLine();

					while (currentLine != null) {
						lines.add(currentLine);

						currentLine = reader.readLine();
					}
					Collections.sort(lines);
					writer = new BufferedWriter(new FileWriter("countrysorted.txt"));
					for (String line : lines) {
						writer.write(line);

						writer.newLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {

					try {
						if (reader != null) {
							reader.close();
						}

						if (writer != null) {
							writer.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("A new sorted file has been created in the source folder named countrysorted.txt");
					flag = 1;
				}
			}
			if (flag == 4) {
				Scanner letter= new Scanner(System.in);
				System.out.print("Enter an uppercase letter filter by");  
				String a= letter.nextLine();
				
				Scanner s = new Scanner(new File("allcountry2.txt"));
				ArrayList<String> list = new ArrayList<String>();
				while (s.hasNext()){
				    list.add(s.next());
				}
				s.close();
				list.stream()
					.filter(str -> str.startsWith(a))
					.forEach(System.out::println);
				flag = 1;
			} else if (flag == 5) {
				System.exit(0);
			}
		}
	}
}