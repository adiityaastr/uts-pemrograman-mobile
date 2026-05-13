# UTS Pemrograman Mobile

Aplikasi Android untuk Ujian Tengah Semester Pemrograman Mobile Ganjil 2024.

## Informasi Mahasiswa

| Field | Detail |
|-------|--------|
| Nama | Muhamad Aditya Saputra |
| NIM | 411231139 |
| Mata Kuliah | Pemrograman Mobile |
| Semester | Ganjil 2024 |

## Deskripsi Aplikasi

Aplikasi multi-activity Android yang mendemonstrasikan navigasi antar halaman, penggunaan Intent, dan pengelolaan UI menggunakan ConstraintLayout.

## Fitur

- **Login** — Form login dengan validasi input, icon field, dan fitur show/hide password
- **Menu Utama** — Profil mahasiswa, navigasi ke semua activity dan gallery
- **Activity A, B, C** — Halaman navigasi dengan tombol perpindahan antar activity
- **Activity D** — Halaman dengan placeholder image dan navigasi ke Gallery
- **Gallery** — Menampilkan 9 gambar dalam grid 3 kolom yang scrollable

## Struktur Activity

```
LoginActivity → SecondActivity (Menu Utama)
                    ├── ActivityA ↔ ActivityB ↔ ActivityC ↔ ActivityD
                    │                                          ↓
                    └── GalleryActivity ←─────────────────────┘
```

## Screenshot

| Login | Menu Utama | Activity | Gallery |
|-------|-----------|----------|---------|
| Form login dengan show password | Profil + grid navigasi | Huruf besar + tombol nav | Grid 3x3 gambar |

## Tech Stack

- **Language:** Java
- **Min SDK:** 24 (Android 7.0)
- **Target SDK:** 36
- **Layout:** ConstraintLayout
- **Build Tool:** Gradle (Kotlin DSL)

## Cara Menjalankan

1. Clone repository:
   ```bash
   git clone https://github.com/adiityaastr/uts-pemrograman-mobile.git
   ```
2. Buka project di Android Studio
3. Sync Gradle
4. Run di emulator atau device fisik

## Struktur Project

```
app/src/main/
├── java/com/example/uts_pemrogramanmobile/
│   ├── LoginActivity.java
│   ├── SecondActivity.java
│   ├── ActivityA.java
│   ├── ActivityB.java
│   ├── ActivityC.java
│   ├── ActivityD.java
│   └── GalleryActivity.java
├── res/
│   ├── layout/          (7 layout XML)
│   ├── drawable/        (background shapes, icons)
│   ├── drawable-nodpi/  (gallery images)
│   └── values/          (colors, strings, themes)
└── AndroidManifest.xml
```

## Lisensi

Project ini dibuat untuk keperluan akademik UTS Pemrograman Mobile.
