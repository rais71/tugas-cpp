//TUGAS C++
//MUHAMMAD RAIS AUFYDIN MARAYA . INFORMATIKA A . 20181302090

#include <iostream>
#include <string>
#include <windows.h>
using namespace std;

int pilihan;
int urutan = 0;
char kembali = 'y';

void rais() {
	cout << endl;
	cout << " -----------------------------------------------------------------" << endl;
	cout << " ----------------------------- TUGAS C++ -------------------------" << endl;
	cout << "                     MUHAMMAD RAIS AUFYDIN MARAYA " << endl;
	cout << "                         TEKNIK INFORMATIKA A " << endl;
	cout << "                               20181302090" << endl;
	cout << " -----------------------------------------------------------------" << endl;
	cout << endl;
	cout << " Memuat Program ... " << endl;
	cout << endl;
	Sleep(3000);
}

int main()
{
	rais();
	system("cls");

	cout << endl;
	cout << " -----------------------------------------------------------------" << endl;
	cout << " ------------------- MENGHITUNG LUAS BANGUN DATAR ----------------" << endl;
	cout << " -----------------------------------------------------------------" << endl;
	cout << endl;
	cout << "               ------- PILIH BANGUN DATAR --------" << endl;
	cout << endl;
	cout << "                |    1. Persegi			|" << endl;
	cout << "                |    2. Persegi Panjang		|" << endl;
	cout << "                |    3. Segitiga		|" << endl;
	cout << "                |    4. Jajar Genjang		|" << endl;
	cout << "                |    5. Layang layang		|" << endl;
	cout << "                |    6. Belah Ketupat		|" << endl;
	cout << "                |    7. Trapesium		|" << endl;
	cout << "                |    8. Lingkaran		|" << endl;
	cout << endl;
	cout << "                   Pilih bangun datar : ";
	cin >> pilihan;

	switch (pilihan)
	{
	//Persegi
	case 1:
		system("cls");
		
		int sisi, luasPersegi;
		cout << endl;
		cout << " ------------------- MENGHITUNG LUAS PERSEGI -----------------" << endl;
		cout << endl;
		cout << "		 |  Rumus Luas : Sisi x Sisi   |";
		cout << endl;
		cout << endl;

		//Input Variable
		cout << "		     Masukkan sisi = ";
		cin >> sisi;

		//Hitung luas persegi
		luasPersegi = sisi * sisi;
		cout << endl;
		cout << "		     Luas Persegi = "<< luasPersegi << " cm";
		
		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;
	
	//Persegi Panjang
	case 2:
		system("cls");

		int p, l, luasPersegiPanjang;
		cout << endl;
		cout << " ---------------- MENGHITUNG LUAS PERSEGI PANJANG --------------" << endl;
		cout << endl;
		cout << "		 |  Rumus Luas : Panjang x Lebar   |";
		cout << endl;
		cout << endl;

		//Input Variable
		cout << "		     Masukkan panjang = ";
		cin >> p;
		cout << "		     Masukkan lebar = ";
		cin >> l;

		//Hitung luas persegi panjang
		luasPersegiPanjang = p * l;
		cout << endl;
		cout << "		     Luas Persegi Panjang = " << luasPersegiPanjang << " cm";

		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;

	//Segitiga
	case 3:
		system("cls");

		float aS, tS, luasSegitiga;
		cout << endl;
		cout << " ------------------- MENGHITUNG LUAS SEGITIGA -----------------" << endl;
		cout << endl;
		cout << "		 |  Rumus Luas : 1/2 x Alas x Tinggi  |";
		cout << endl;
		cout << endl;

		//Input Variable
		cout << "		     Masukkan alas = ";
		cin >> aS;
		cout << "		     Masukkan tinggi = ";
		cin >> tS;

		//Hitung luas segitiga
		luasSegitiga = (0.5) * aS * tS;
		cout << endl;
		cout << "		     Luas Segitiga = " << luasSegitiga << " cm";

		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;

	//Jajar Genjang
	case 4:
		system("cls");

		float aJG, tJG, luasJajarGenjang;
		cout << endl;
		cout << " ---------------- MENGHITUNG LUAS JAJANG GENJANG --------------" << endl;
		cout << endl;
		cout << "		 |  Rumus Luas : Alas x Tinggi  |";
		cout << endl;
		cout << endl;

		//Input Variable
		cout << "		     Masukkan alas = ";
		cin >> aJG;
		cout << "		     Masukkan tinggi = ";
		cin >> tJG;

		//Hitung luas jajar genjang
		luasJajarGenjang = aJG * tJG;
		cout << endl;
		cout << "		     Luas Jajar Genjang = " << luasJajarGenjang << " cm";

		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;

	//Layang-layang
	case 5:
		system("cls");

		float d1LL, d2LL, luasLayangLayang;
		cout << endl;
		cout << " ------------ MENGHITUNG LUAS LAYANG-LAYANG -----------" << endl;
		cout << endl;
		cout << "     |  Rumus Luas : 1/2 x Diagonal 1 x Diagonal 2  |";
		cout << endl;
		cout << endl;

		//Input Variable
		cout << "		 Masukkan diagonal 1 = ";
		cin >> d1LL;
		cout << "		 Masukkan diagonal 2 = ";
		cin >> d2LL;

		//Hitung luas layang-layang
		luasLayangLayang = (0.5) * d1LL * d2LL;
		cout << endl;
		cout << "		 Luas Layang-Layang = " << luasLayangLayang << " cm";

		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;

	//Belah Ketupat
	case 6:
		system("cls");

		float d1BK, d2BK, luasBelahKetupat;
		cout << endl;
		cout << " ---------------- MENGHITUNG LUAS BELAH KETUPAT --------------" << endl;
		cout << endl;
		cout << "	|  Rumus Luas : 1/2 x Diagonal 1 x Diagonal 2  |";
		cout << endl;
		cout << endl;

		//Input Variable
		cout << "		  Masukkan diagonal 1 = ";
		cin >> d1BK;
		cout << "		  Masukkan diagonal 2 = ";
		cin >> d2BK;

		//Hitung luas jajar genjang
		luasBelahKetupat = (0.5) * d1BK * d2BK;
		cout << endl;
		cout << "		  Luas Belah Ketupat = " << luasBelahKetupat << " cm";

		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;

	//Trapesium
	case 7:
		system("cls");

		float aT, cT, tT, ApA, luasTrapesium;
		cout << endl;
		cout << " -------------- MENGHITUNG LUAS TRAPESIUM ------------" << endl;
		cout << endl;
		cout << "	|  Rumus Luas : 1/2 x (Alas + Atap) x Tinggi  |";
		cout << endl;
		cout << "	|	Atap : Sisi sejajar dengan alas       |";
		cout << endl;
		cout << endl;

		//Input Variable
		cout << "		  Masukkan Alas = ";
		cin >> aT;
		cout << "		  Masukkan Atap = ";
		cin >> cT;
		cout << "		  Masukkan Tinggi = ";
		cin >> tT;

		//Alas + Atap
		ApA = aT + cT;

		//Hitung trapesium
		luasTrapesium = (0.5) * ApA * tT;
		cout << endl;
		cout << "		  Luas Trapesium = " << luasTrapesium << " cm";

		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;

	//Lingkaran
	case 8:
		system("cls");

		float r, luasLingkaran;
		cout << endl;
		cout << " -------------- MENGHITUNG LUAS Lingkaran ------------" << endl;
		cout << endl;
		cout << "  |  Rumus Luas : Pi (3,14) x Jari-jari x Jari-jari  |";
		cout << endl;
		cout << endl;

		//Input Variable
		cout << "		  Masukkan Jari-jari = ";
		cin >> r;

		//Hitung luas lingkaran
		luasLingkaran = (3.14) * r * r;
		cout << endl;
		cout << "		  Luas Lingkaran = " << luasLingkaran << " cm";

		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;

	default:
		system("cls");

		cout << endl;
		cout << endl;
		cout << "        Mohon hanya memilih 1 sampai dengan 8";
		
		//Menu akhir
		cout << endl;
		cout << endl;
		cout << "Kembali ke menu awal (y / n) ? ";
		cin >> kembali;
		if (kembali == 'y') {
			return main();
		}
		else {
			exit(0);
		}
		break;
	}

	cout << endl;
	cout << endl;
	cout << endl;
	system("pause");
	return 0;
}
