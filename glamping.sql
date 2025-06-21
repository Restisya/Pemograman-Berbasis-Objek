-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 21, 2025 at 08:10 AM
-- Server version: 8.4.3
-- PHP Version: 8.3.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `glamping`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `Id_Barang` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nama_barang` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`Id_Barang`, `nama_barang`) VALUES
('1001', 'Kopi Instan Sachet'),
('1002', 'Teh Celup'),
('1003', 'Gula Pasir '),
('1004', 'Air Galon '),
('1005', 'Kopi Capsule'),
('2001', 'Deterjen Bubuk '),
('2002', 'Pewangi Pakaian '),
('3001', 'Sabun Cair '),
('3002', 'Shampo Sachet '),
('3003', 'Tissue Roll'),
('3004', 'Handuk');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `IdBooking` int NOT NULL,
  `IdKamar` int DEFAULT NULL,
  `TanggalBooking` date DEFAULT NULL,
  `TanggalCheckin` date DEFAULT NULL,
  `TanggalCheckout` date DEFAULT NULL,
  `IdPelanggan` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`IdBooking`, `IdKamar`, `TanggalBooking`, `TanggalCheckin`, `TanggalCheckout`, `IdPelanggan`) VALUES
(106, 9, '2025-06-04', '2025-06-06', '2025-06-10', 206),
(201, 8, '2025-06-02', '2025-06-04', '2025-06-07', 101),
(202, 10, '2025-06-04', '2025-06-05', '2025-06-11', 102),
(203, 9, '2025-06-03', '2025-06-05', '2025-06-08', 103),
(204, 8, '2025-06-02', '2025-06-03', '2025-06-09', 104),
(205, 9, '2025-06-12', '2025-06-13', '2025-06-16', 105),
(207, 8, '2025-06-04', '2025-06-06', '2025-06-10', 206);

-- --------------------------------------------------------

--
-- Table structure for table `checkin`
--

CREATE TABLE `checkin` (
  `IdCheckIn` int NOT NULL,
  `IdPelanggan` int NOT NULL,
  `TanggalCheckin` date NOT NULL,
  `TanggalCheckout` date NOT NULL,
  `Payment` varchar(250) NOT NULL,
  `IdBooking` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `checkin`
--

INSERT INTO `checkin` (`IdCheckIn`, `IdPelanggan`, `TanggalCheckin`, `TanggalCheckout`, `Payment`, `IdBooking`) VALUES
(1, 101, '2025-06-04', '2025-06-07', 'Lunas', 201),
(2, 102, '2025-06-05', '2025-06-11', 'DP', 202),
(3, 103, '2025-06-05', '2025-06-08', 'Lunas', 203),
(4, 104, '2025-06-03', '2025-06-09', 'Lunas', 204),
(5, 105, '2025-06-13', '2025-06-16', 'Lunas', 205),
(6, 206, '2025-06-06', '2025-06-10', 'Lunas', 207);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `idcustomer` int NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `No. Hp` varchar(15) NOT NULL,
  `Alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `IdKamar` int NOT NULL,
  `JenisKamar` varchar(50) DEFAULT NULL,
  `StatusKamar` varchar(20) DEFAULT NULL,
  `Harga` decimal(10,2) DEFAULT NULL,
  `Kapasitas` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`IdKamar`, `JenisKamar`, `StatusKamar`, `Harga`, `Kapasitas`) VALUES
(8, 'ROMANTIC', 'available', 1000000.00, '2 Orang'),
(9, 'FAMILY', 'available', 900000.00, '4 Orang'),
(10, 'FRIENDS', 'available', 800000.00, '3 Orang'),
(12, 'Large', 'available', 700000.00, '5 orang'),
(13, 'Large', 'available', 700000.00, '4 orang');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `IdPayment` int NOT NULL,
  `IdBooking` int DEFAULT NULL,
  `NamaPelanggan` varchar(100) DEFAULT NULL,
  `CheckinTime` time DEFAULT NULL,
  `CheckoutTime` time DEFAULT NULL,
  `Denda` decimal(10,2) DEFAULT NULL,
  `StatusPembayaran` varchar(50) DEFAULT NULL,
  `TotalPembayaran` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `IdPelanggan` int NOT NULL,
  `NamaPelanggan` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `NoHp` varchar(20) DEFAULT NULL,
  `Alamat` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`IdPelanggan`, `NamaPelanggan`, `Email`, `NoHp`, `Alamat`) VALUES
(101, 'Marselino', 'marselino@gmail.com', '0876543218934', 'Jln.Merdeka, Kab.Merdeka'),
(102, 'Ivar Jenner', 'jenner@gmail.com', '08976543', 'Jln.Majapahit, Kab.Bangli'),
(103, 'Kendall Jenner', 'kendalje@gmail.com', '0856781234', 'Jln.Supratman, Kab.Denpasar'),
(104, 'Ayu Gani', 'Agani@gmail.com', '08765432', 'Jln.Raya Campuhan, Kec.Ubud'),
(105, 'Nadya Hutagalung', 'nad56@gmail.com', '085413256', 'Jln.Pantai Batu Bolong,Kec.Kuta Utara'),
(206, 'juju', 'juju@gmail.com', '09873526', 'jln. sukasuka, Kab. sukahati');

-- --------------------------------------------------------

--
-- Table structure for table `pemakaianbarang`
--

CREATE TABLE `pemakaianbarang` (
  `IdPemakaian` int NOT NULL,
  `NamaBarang` varchar(100) DEFAULT NULL,
  `TanggalPemakaian` date DEFAULT NULL,
  `Jumlah` int DEFAULT NULL,
  `DigunakanOleh` varchar(100) DEFAULT NULL,
  `Id_Barang` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pemakaianbarang`
--

INSERT INTO `pemakaianbarang` (`IdPemakaian`, `NamaBarang`, `TanggalPemakaian`, `Jumlah`, `DigunakanOleh`, `Id_Barang`) VALUES
(6, 'Deterjen Bubuk ', '2025-06-17', 30, 'laundry', '2001'),
(7, 'Kopi Capsule', '2025-06-02', 9, 'kitchen', '1005'),
(8, 'Kopi Capsule', '2025-06-03', 9, 'kitchen', '1005');

-- --------------------------------------------------------

--
-- Table structure for table `po`
--

CREATE TABLE `po` (
  `IdPo` int NOT NULL,
  `IdSupplier` int DEFAULT NULL,
  `IdBarang` int DEFAULT NULL,
  `TanggalPemesanan` date DEFAULT NULL,
  `JenisTransaksi` varchar(50) DEFAULT NULL,
  `JumlahBeli` decimal(10,2) DEFAULT NULL,
  `TotalHarga` decimal(10,2) DEFAULT NULL,
  `StatusPo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `po`
--

INSERT INTO `po` (`IdPo`, `IdSupplier`, `IdBarang`, `TanggalPemesanan`, `JenisTransaksi`, `JumlahBeli`, `TotalHarga`, `StatusPo`) VALUES
(1, 2, 1004, '2025-06-05', 'Pembelian Barang', 10.00, 200000.00, 'Dikirim'),
(2, 1, 3004, '2025-06-09', 'Pembelian Barang', 10.00, 100000.00, 'Dikirim');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `IdSupplier` int NOT NULL,
  `NamaSupplier` varchar(100) DEFAULT NULL,
  `NoHp` varchar(20) DEFAULT NULL,
  `Alamat` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`IdSupplier`, `NamaSupplier`, `NoHp`, `Alamat`) VALUES
(1, 'PT.Harum Jaya Abadi', '089765432110', 'Jln.Suka Ria, Kec.SukaCita, Kab.SukaHati'),
(2, 'PT.Mekar Sari', '0876241536', 'Jln.melati,Kec.Kembang,Kab.Bunga'),
(3, 'PT.Cleaner', '08312456', 'Jln.Tonya, Kab. Denpasar'),
(4, 'PT.Cahaya Abadi', '098765', 'Jln Majapahit,Kab.Bangli');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `IDusers` int NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`IDusers`, `Nama`, `Email`, `Password`) VALUES
(1, 'relia', 'reliaya@gmail.com', 'c4ca4238a0b923820dcc509a6f75849b');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`Id_Barang`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`IdBooking`),
  ADD KEY `IdKamar` (`IdKamar`),
  ADD KEY `fk_booking_pelanggan` (`IdPelanggan`);

--
-- Indexes for table `checkin`
--
ALTER TABLE `checkin`
  ADD PRIMARY KEY (`IdCheckIn`),
  ADD KEY `IdBooking` (`IdBooking`);

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`IdKamar`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`IdPayment`),
  ADD KEY `IdBooking` (`IdBooking`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`IdPelanggan`);

--
-- Indexes for table `pemakaianbarang`
--
ALTER TABLE `pemakaianbarang`
  ADD PRIMARY KEY (`IdPemakaian`),
  ADD KEY `fk_id_barang` (`Id_Barang`);

--
-- Indexes for table `po`
--
ALTER TABLE `po`
  ADD PRIMARY KEY (`IdPo`),
  ADD KEY `IdSupplier` (`IdSupplier`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`IdSupplier`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`IDusers`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `checkin`
--
ALTER TABLE `checkin`
  MODIFY `IdCheckIn` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `kamar`
--
ALTER TABLE `kamar`
  MODIFY `IdKamar` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `IdPelanggan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12568;

--
-- AUTO_INCREMENT for table `pemakaianbarang`
--
ALTER TABLE `pemakaianbarang`
  MODIFY `IdPemakaian` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `IDusers` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`IdKamar`) REFERENCES `kamar` (`IdKamar`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `fk_booking_pelanggan` FOREIGN KEY (`IdPelanggan`) REFERENCES `pelanggan` (`IdPelanggan`);

--
-- Constraints for table `checkin`
--
ALTER TABLE `checkin`
  ADD CONSTRAINT `checkin_ibfk_1` FOREIGN KEY (`IdBooking`) REFERENCES `booking` (`IdBooking`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`IdBooking`) REFERENCES `booking` (`IdBooking`);

--
-- Constraints for table `pemakaianbarang`
--
ALTER TABLE `pemakaianbarang`
  ADD CONSTRAINT `fk_id_barang` FOREIGN KEY (`Id_Barang`) REFERENCES `barang` (`Id_Barang`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Constraints for table `po`
--
ALTER TABLE `po`
  ADD CONSTRAINT `po_ibfk_1` FOREIGN KEY (`IdSupplier`) REFERENCES `supplier` (`IdSupplier`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
