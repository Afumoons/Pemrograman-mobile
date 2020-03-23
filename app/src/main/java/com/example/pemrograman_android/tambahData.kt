package com.example.pemrograman_android


//Membuat List FakultasData
fun tambahData(): List<FakultasData> {
    val partList = ArrayList<FakultasData>()
    partList.add(
        FakultasData(
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur. Yang terdiri dari program studi:",
            "1. Prodi S1 Ekonomi Pembangunan\n" +
                    "2. Prodi S1 Akuntansi\n" +
                    "3. Prodi S1 Manajemen",
            R.drawable.logoupn,
            "feb@upnjatim.ac.id",
            "http://febis.upnjatim.ac.id/"
        )
    )
    partList.add(
        FakultasData(
            "Fakultas Pertanian",
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur. Yang terdiri dari program studi:",
            "1. Prodi S1 Agroteknologi\n" +
                    "2. Prodi S1 Agribisnis",
            R.drawable.logoupn,
            "",
            "http://faperta.upnjatim.ac.id/"
        )
    )
    partList.add(
        FakultasData(
            "Fakultas Teknik",
            "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur. Yang terdiri dari program studi:",
            "1. Prodi S1 Teknik Kimia\n" +
                    "2. Prodi S1 Teknik Industri\n" +
                    "3. Prodi S1 Teknik Sipil\n" +
                    "4. Prodi S1 Teknik Lingkungan\n" +
                    "5. Prodi S1 Teknologi Pangan",
            R.drawable.logoupn,
            "",
            "http://ft.upnjatim.ac.id/"
        )
    )
    partList.add(
        FakultasData(
            "Fakultas Ilmu Sosial dan Ilmu Politik",
            "Fakultas Ilmu Sosial dan Ilmu Politik merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur. Yang terdiri dari program studi:",
            "1. Prodi S1 Ilmu Komunikasi\n" +
                    "2. Prodi S1 Ilmu Administrasi Bisnis\n" +
                    "3. Prodi S1 Ilmu Administrasi Negara\n" +
                    "4. Prodi S1 Hubungan Internasional",
            R.drawable.logoupn,
            "",
            "http://fisip.upnjatim.ac.id/"
        )
    )
    partList.add(
        FakultasData(
            "Fakultas Ilmu Komputer",
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur. Yang terdiri dari program studi:",
            "1. Prodi S1 Teknik Informatika\n" +
                    "2. Prodi S1 Sistem Informasi\n" +
                    "3. Prodi S1 Data Sains",
            R.drawable.logoupn,
            "",
            "https://fik.upnjatim.ac.id/"
        )
    )
    partList.add(
        FakultasData(
            "Fakultas Arsitektur dan Desain",
            "Fakultas Arsitektur dan Desain merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur. Yang terdiri dari program studi:",
            "1. Prodi S1 Teknik Arsitektur\n" +
                    "2. Prodi S1 Desain Komunikasi Visual",
            R.drawable.logoupn,
            "fad@upnjatim.ac.id",
            "http://fad.upnjatim.ac.id/"
        )
    )
    partList.add(
        FakultasData(
            "Fakultas Hukum",
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur. Yang terdiri dari program studi:",
            "1. Prodi S1 Hukum",
            R.drawable.logoupn,
            "",
            "http://fhukum.upnjatim.ac.id/"
        )
    )
    partList.add(
        FakultasData(
            "Pengembang Aplikasi",
            "Mahasiswa UPN “Veteran” Jawa Timur Fakultas Ilmu Komputer Prodi Sistem Informasi",
            "Nama \t: Afu Sidhi Pamekas\n" +
                    "TTL\t: Bangkalan, 12 Agustus 1998\n" +
                    "Alamat \t: Jl. Trunojoyo Asri Blok G No. 2 Burneh Bangkalan\n" +
                    "No. HP \t: 087742212442\n" +
                    "URL Profile\t: afumoons.github.io\n",
            R.drawable.logo_afumoons_svg,
            "afumoons@gmail.com",
            "https://github.com/afumoons/"
        )
    )
    return partList
}
