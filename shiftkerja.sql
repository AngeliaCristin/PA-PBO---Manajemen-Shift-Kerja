-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2023 at 02:33 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shiftkerja`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `Username` char(5) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Gender` varchar(12) NOT NULL,
  `Jabatan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`Username`, `Password`, `Nama`, `Gender`, `Jabatan`) VALUES
('111', '111', 'Angel', 'Perempuan', 'Karyawan'),
('123', '123', 'Adam', 'Laki-Laki', 'Manajer'),
('222', '222', 'Adam', 'Laki-Laki', 'Karyawan');

-- --------------------------------------------------------

--
-- Table structure for table `hadir`
--

CREATE TABLE `hadir` (
  `Absensi` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hadir`
--

INSERT INTO `hadir` (`Absensi`) VALUES
('hadir');

-- --------------------------------------------------------

--
-- Table structure for table `izin`
--

CREATE TABLE `izin` (
  `Lama_Izin` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_shift`
--

CREATE TABLE `jadwal_shift` (
  `ID_Jadwal` char(3) NOT NULL,
  `Nama_Karyawan` varchar(20) NOT NULL,
  `Tanggal` varchar(10) NOT NULL,
  `Jam_Masuk` varchar(10) NOT NULL,
  `Jam_Keluar` varchar(10) NOT NULL,
  `AKUN_Username` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jadwal_shift`
--

INSERT INTO `jadwal_shift` (`ID_Jadwal`, `Nama_Karyawan`, `Tanggal`, `Jam_Masuk`, `Jam_Keluar`, `AKUN_Username`) VALUES
('1', 'Angel', '04-11-2023', '09:00', '12:00', '123');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `Username` char(5) NOT NULL,
  `Posisi` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`Username`, `Posisi`) VALUES
('111', 'Pelayan'),
('222', 'Pelayan');

-- --------------------------------------------------------

--
-- Table structure for table `laporan_kehadiran`
--

CREATE TABLE `laporan_kehadiran` (
  `ID_Laporan` char(3) NOT NULL,
  `Nama_Karyawan` varchar(20) NOT NULL,
  `Tanggal` varchar(10) NOT NULL,
  `Status_Kehadiran` varchar(20) NOT NULL,
  `AKUN_Username` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `laporan_kehadiran`
--

INSERT INTO `laporan_kehadiran` (`ID_Laporan`, `Nama_Karyawan`, `Tanggal`, `Status_Kehadiran`, `AKUN_Username`) VALUES
('1', 'Angel', '04-11-2023', 'Hadir', '123'),
('2', 'Adam', '10-10-2023', 'Hadir', '222');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `Username` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`Username`) VALUES
('123');

-- --------------------------------------------------------

--
-- Table structure for table `tanpa_keterangan`
--

CREATE TABLE `tanpa_keterangan` (
  `Pesan_Peringatan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `hadir`
--
ALTER TABLE `hadir`
  ADD PRIMARY KEY (`Absensi`);

--
-- Indexes for table `izin`
--
ALTER TABLE `izin`
  ADD PRIMARY KEY (`Lama_Izin`);

--
-- Indexes for table `jadwal_shift`
--
ALTER TABLE `jadwal_shift`
  ADD PRIMARY KEY (`ID_Jadwal`),
  ADD KEY `JADWAL_SHIFT_AKUN_FK` (`AKUN_Username`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `laporan_kehadiran`
--
ALTER TABLE `laporan_kehadiran`
  ADD PRIMARY KEY (`ID_Laporan`),
  ADD KEY `LAPORAN_KEHADIRAN_AKUN_FK` (`AKUN_Username`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `tanpa_keterangan`
--
ALTER TABLE `tanpa_keterangan`
  ADD PRIMARY KEY (`Pesan_Peringatan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal_shift`
--
ALTER TABLE `jadwal_shift`
  ADD CONSTRAINT `JADWAL_SHIFT_AKUN_FK` FOREIGN KEY (`AKUN_Username`) REFERENCES `akun` (`Username`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD CONSTRAINT `KARYAWAN_AKUN_FK` FOREIGN KEY (`Username`) REFERENCES `akun` (`Username`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `laporan_kehadiran`
--
ALTER TABLE `laporan_kehadiran`
  ADD CONSTRAINT `LAPORAN_KEHADIRAN_AKUN_FK` FOREIGN KEY (`AKUN_Username`) REFERENCES `akun` (`Username`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
  ADD CONSTRAINT `MANAGER_AKUN_FK` FOREIGN KEY (`Username`) REFERENCES `akun` (`Username`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
