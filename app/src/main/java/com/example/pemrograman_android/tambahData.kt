package com.example.pemrograman_android


//Membuat List ResepData
fun tambahData(): List<ResepData> {
    val partList = ArrayList<ResepData>()
    partList.add(
        ResepData(
            "Lontong Kari",
            "Makanan khas Jawa Barat yang terdiri dari lontong, bumbu kacang, daging sapi, bawang goreng, bumbu kari, telur, dan menciptakan cita rasa gurih yang lezat!!!",
            "- 250 gr daging sapi, rebus hingga empuk, potong sesuai selera" +
                    "\n- 5 lbr daun jeruk" +
                    "\n- 3 lbr daun salam" +
                    "\n- 1 btg sereh" +
                    "\n- 3 bh cengkeh" +
                    "\n- Secukupnya air" +
                    "\n- 1 santan instan" +
                    "\n- Garam" +
                    "\n- Gula" +
                    "\n- Merica" +
                    "\n" +
                    "\nBumbu halus :" +
                    "\n- 3 bh cabe merah, buang bijinya" +
                    "\n- 3 siung bawang putih" +
                    "\n- 7 bh bawang merah" +
                    "\n- 1 ruas lengkuas" +
                    "\n- 1 ruas jahe" +
                    "\n- 1 ruas kunyit" +
                    "\n- 5 butir kemiri" +
                    "\n" +
                    "\nPelengkap dan taburan :" +
                    "\n- Lontong/ketupat" +
                    "\n- Bawang goreng" +
                    "\n- Seledri, dirajang" +
                    "\n- Kacang tanah goreng" +
                    "\n- Engping" +
                    "\n- Telur rebus" +
                    "\n- Sambel" +
                    "\n- Jeruk limau",
            "1. Didihkan air.. Masukkan daging rebus yg sudah d potong potong" +
                    "\n2. Tumis bumbu halus hingga harum.. Masukkan daun salam, daun jeruk, sereh, cengkeh.. Matangkan bumbu tuang ke dalam rebusan daging" +
                    "\n3. Tambahkan garam gula merica.. Tes rasa.. Tuangkan santan.. Matikan api" +
                    "\n4. Susun lontong di piring.. Tuangi dengan kuah kari.. Tambahkan bahan pelengkap.. Taaraaa.. Siap d sajikan..selamat mencoba yaa \uD83D\uDE0D",
            R.drawable.lontong_kari
        )
    )
    partList.add(
        ResepData(
            "Nasi Gandul",
            "Nasi yang biasanya di sajikan di daun pisang yang memberikan aroma sedap sehingga menggoda siapapun saat mencium aromanya, terdiri dari nasi putih, telur, daging sapi, dan kuah santan bumbu kuning.",
            "- 500 gr daging sapi, iris kotak tipis" +
                    "\n- 350 gr jerohan (babat, usus, paru)" +
                    "\n- 2 batang serai, memarkan" +
                    "\n- 2 cm kayumanis" +
                    "\n- 3 lembar daun salam" +
                    "\n- 5 lembar daun jeruk" +
                    "\n- 4 sdm kecap manis" +
                    "\n- 1/2 sdt pala bubuk" +
                    "\n- 1 liter santan" +
                    "\n- Secukupnya garam, gula merah & lada bubuk" +
                    "\n" +
                    "\nBumbu halus :" +
                    "\n- 10 butir bawang merah" +
                    "\n- 5 siung bawang putih" +
                    "\n- 4 butir kemiri (sangrai)" +
                    "\n- 3 buah cabai merah besar, rebus dulu" +
                    "\n- 1 ruas kencur" +
                    "\n- 2 cm jahe" +
                    "\n- 1/2 sdt terasi matang" +
                    "\n- 1/2 sdt jinten (sangrai)" +
                    "\n- 1 sdm ketumbar (sangrai" +
                    "\n" +
                    "\nPelengkap :" +
                    "\nSesuai selera Sambal, tempe goreng, telur bacem, sate paru, dll",
            "1. Didihkan air, masukkan jerohan, rebus 10 menit, angkat lalu buang airnya tidak bau amis, ganti air baru lalu rebus lagi sampai jerohan empuk, angkat, lalu potong2." +
                    "\n2.Tumis bumbu halus sampai wangi, masukkan serai, daun jeruk, daun salam dan kayumanis, aduk sampai bumbu matang, masukkan daging, aduk sampai berubah warna, tuangi air, masak sampai terus dengan api kecil." +
                    "\n3. Masukkan jeroan kedalam rebusan daging, tuangi santan, bumbui garam, gula, pala bubuk, kecap manis dah lada bubuk, masak sampai bumbu meresap dan daging empuk, koreksi rasa, bila sudah pas matikan api." +
                    "\n4. Penyajian, siapkan piring yang sudah dialasi daun, tata nasi diatasnya, beri daging lalu siram kuah, taburi bawang goreng, sajikan dengan pelengkap.",
            R.drawable.nasi_gandul
        )
    )
    partList.add(
        ResepData(
            "Nasi Pecel",
            "Nasi pecel makanan khas jawa timur yang banyak ditemukan di surabaya, malang, dan jember.",
            "Bumbu pecel :" +
                    "\n1. 500 gr kacang tanah" +
                    "\n2. 250 gr gula merah sisir halus. Uleg hingga lembut dan mencair" +
                    "\n3. 10 lembar daun jeruk (buang tulangnya)" +
                    "\n4. 2 ruas kencur" +
                    "\n5. 3 buah cabe merah ukuran besar" +
                    "\n6. 6 buah cabe rawit (sesuai selera)" +
                    "\n7. 2 sdm air asam jawa" +
                    "\n8. 5 siung bawang putih" +
                    "\n9. 1 sdm garam (kalau kurang asin tambahkan pada saat di seduh" +
                    "\n" +
                    "\nPelengkap" +
                    "\nSesuai selera : sayur",
            "1. Goreng kacang tanah hingga matang, angkat sebelum kecoklatan. Biar nggak gosong. biarkan dingin." +
                    "\n2. Haluskan bawang putih, cabe, daun jeruk dan Kencur." +
                    "\n3. Blender/chopper kacang hingga halus (tingkat kehalusan sesuai selera). Tambahkan bumbu halus, air asam jawa dan gula merah. Aduk menggunakan blender /chopper hingga tercampur rata." +
                    "\n4. Simpan dalam wadah tertutup." +
                    "\nBisa tahan selama kurang lebih 2 bulan di dalam kulkas..",
            R.drawable.nasi_pecel
        )
    )
    partList.add(
        ResepData(
            "Tahu Tek",
            "Tahu tek terdiri dari tahu goreng, lontong, tauge, kerupuk, kentang goreng, timun, telur, dan pastinya bumbu tahu tek yang terdiri dari bawang purih, petis, kecap, kacang goreng, cabai yang menciptakan 1 porsi tahu tek yang wenak banget!!!",
            "1. 1 buah tahu putih, potong kotak kecil, goreng setengah matang" +
                    "2. 1 buah kentang kupas, potong kotak, goreng matang" +
                    "3.2 butir telur, kocok lepas" +
                    "4. Lontong secukupnya" +
                    "\n" +
                    "Bumbu Tahu Telur (utk 2 porsi)" +
                    "1. 2 sdm petis udang" +
                    "2. 2 sdm kacang goreng tanpa kulit" +
                    "3. 2 sdm kecap manis" +
                    "4. 1 sdt garam" +
                    "5. 2 siung bawang putih" +
                    "6. 10 cabe rawit (opsional)." +
                    "7. Air hangat" +
                    "\n" +
                    "Bahan Pelengkap " +
                    "1. Taoge" +
                    "2. Bawang Goreng" +
                    "3. Kerupuk Udang",
            "1. Siapkan bahan, goreng kacang tanpa kulit sampai matang kecoklatan, angkat dan tiriskan (maaf agak kelamaan angkatnya \uD83D\uDE05)" +
                    "\n2. Potong tahu dan kentang, goreng smua dulu." +
                    "\n3. Goreng bawang putih dan cabe rawit. Lalu ulek lembut smua bahan bumbu, tambahkan air hangat, jgn lupa koreksi rasa dan tambah2in aja klo berasa kurang yah." +
                    "\n4. Goreng telur kocok bersama tahu goreng, dengan minyak agak banyak supaya telur agak mekar." +
                    "\n5. Sekarang waktunya jualan emm \uD83D\uDC4C\uD83C\uDFFB potong lontong dan kentang goreng, taruh telur tahu di atasnya potong2 klo mau, sirami dengan bumbunya, beri tauge dan bawang goreng. Makan dgn kerupuk udang \uD83D\uDE0D\uD83D\uDE0D uhhh mantullll",
            R.drawable.tahu_tek
        )
    )
    partList.add(
        ResepData(
            "Rujak Cingur",
            "Rujak cingur itu terdiri dari potongan buah-buahan yang di beri Cingur (mulut sapi), sayur-sayuran, tahu, dan bumbu rujak cingur yang terdiri dari cabe, petis, gula merah, bawang putih, kacang goreng, di ulek lalu dicampur dengan seporsi rujak cingur yang merupakan kombinasi yang sempurna.",
            "1. 1/4 cingur sapi" +
                    "\n2. 3 buah tahu" +
                    "\n3. 1 tempe ukuran besar" +
                    "\n4. 4 ikat kangkung" +
                    "\n5. 1/2 ons gr taoge" +
                    "\n6. 1 buah timun" +
                    "\n7. 1 bengkoang" +
                    "\n8. Nanas" +
                    "\n9. Kerupuk" +
                    "\n10. Kacang kupas" +
                    "\n11. Air asam jawa" +
                    "\n12. Gula jawa" +
                    "\n13. Petis",
            "1. Rebus cingur sapi sampai matang." +
                    "\n2. Potong potong kecil sesuai selera" +
                    "\n3. Rebus kangkung serta taoge sampai matang" +
                    "\n4. Goreng tahu dan tempe, setelah matang potong dadu" +
                    "\n5. Cuci bersih nanas dan bengkoang lalu potong tipis" +
                    "\n6. Lombok rawit merah, kacang, bawang yg sudah digoreng, gula jawa, dihaluskan lalu masukkan petis udang dan air asam.jawa." +
                    "\n7. Siapkan piring taruh kangkung, taoge, tahu tempe goreng, nanas, timun, bengkoang daa siram dengan sambal petis tadi. Siap untjk dimakan.",
            R.drawable.rujak_cingur
        )
    )
    partList.add(
        ResepData(
            "Lontong Balap",
            "Lontong balap terdiri dari lontong, touge, tahu goreng, lenthok, kecap, bawang goreng, sambal, dan siraman kuahnya yang khas rasanya, asin, manis, gurih, akan lebih nikmat jika dimakan saat hangat.",
            "1. 2 buah lontong" +
                    "\n2. 1 bungkus toge / kecambah (2rb.an)" +
                    "\n3. 2 buah tahu" +
                    "\n4. 1 batang bawang pre" +
                    "\n5. 1 batang seledri" +
                    "\n6. 3 siung bawang merah" +
                    "\n7. 5 siung bawang putih" +
                    "\n8. 1 sdm kecap manis" +
                    "\n9. Secukupnya merica bubuk dan kaldu bubuk" +
                    "\n10. Secukupnya gula" +
                    "\n11. Secukupnya garam" +
                    "\n" +
                    "\nSambal Petis :" +
                    "\n1. 3 siung bawang merah" +
                    "\n2. 2 siung bawang putih" +
                    "\n3. 3 buah cabe rawit" +
                    "\n4. Secukupnya Merica bubuk" +
                    "\n5. Secukupnya gula" +
                    "\n6. Secukupnya garam" +
                    "\n7. 100 ml air" +
                    "\n8. 1 bungkus petis (2rb.an)",
            "1. Masak dulu sambal petis. Bersihkan bawang merah, bawang putih dan cabai. Haluskan, beri gula garam secukupnya dan merica bubuk. Setelah halus tumis bumbu sampai harum masukkan air. Aduk rata, setelah muncul gelembung mendidih masukkan petisnya. Aduk rata sampai air menyusut dan petis seperti sebelum di campur air. *Benar-benar menyusut airnya" +
                    "\n2. Bersihkan bawang merah, bawang putih, bawang pre dan seledri. Kemudian iris tipis semuanya." +
                    "\n3. Panaskan minyak sedikit di panci. Kemudian masukkan bawang putih tumis sampai harum. Tambahkan bawang merah lanjut tumis sampai benar-benar wangi. Kemudian masukkan air, tambahkan kecap, gula dan garam. Biarkan mendidih. Tambahkan merica bubuk dan kaldu bubuk. Kemudian masukkan kecambah/ toge. Terakhir susulkan bawang pre dan seledri." +
                    "\n4. Tunggu sampai matang. Dan siap di sajikan. \uD83D\uDE0A",
            R.drawable.lontong_balap
        )
    )
    return partList
}
