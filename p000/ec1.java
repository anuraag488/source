package p000;

import ads_mobile_sdk.C0313rh;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 {

    /* JADX INFO: renamed from: A */
    public static final byte[] f17960A;

    /* JADX INFO: renamed from: B */
    public static final String[] f17961B;

    /* JADX INFO: renamed from: C */
    public static final int[] f17962C;

    /* JADX INFO: renamed from: D */
    public static final byte[] f17963D;

    /* JADX INFO: renamed from: E */
    public static final bc1 f17964E;

    /* JADX INFO: renamed from: F */
    public static final bc1[][] f17965F;

    /* JADX INFO: renamed from: G */
    public static final bc1[] f17966G;

    /* JADX INFO: renamed from: H */
    public static final HashMap[] f17967H;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f17968I;

    /* JADX INFO: renamed from: J */
    public static final HashSet f17969J;

    /* JADX INFO: renamed from: K */
    public static final HashMap f17970K;

    /* JADX INFO: renamed from: L */
    public static final Charset f17971L;

    /* JADX INFO: renamed from: M */
    public static final byte[] f17972M;

    /* JADX INFO: renamed from: N */
    public static final byte[] f17973N;

    /* JADX INFO: renamed from: l */
    public static final boolean f17974l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final int[] f17975m;

    /* JADX INFO: renamed from: n */
    public static final int[] f17976n;

    /* JADX INFO: renamed from: o */
    public static final byte[] f17977o;

    /* JADX INFO: renamed from: p */
    public static final byte[] f17978p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f17979q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f17980r;

    /* JADX INFO: renamed from: s */
    public static final byte[] f17981s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f17982t;

    /* JADX INFO: renamed from: u */
    public static final byte[] f17983u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f17984v;

    /* JADX INFO: renamed from: w */
    public static final byte[] f17985w;

    /* JADX INFO: renamed from: x */
    public static final byte[] f17986x;

    /* JADX INFO: renamed from: y */
    public static final byte[] f17987y;

    /* JADX INFO: renamed from: z */
    public static final byte[] f17988z;

    /* JADX INFO: renamed from: a */
    public FileDescriptor f17989a;

    /* JADX INFO: renamed from: b */
    public AssetManager.AssetInputStream f17990b;

    /* JADX INFO: renamed from: c */
    public int f17991c;

    /* JADX INFO: renamed from: d */
    public HashMap[] f17992d;

    /* JADX INFO: renamed from: e */
    public HashSet f17993e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f17994f;

    /* JADX INFO: renamed from: g */
    public boolean f17995g;

    /* JADX INFO: renamed from: h */
    public int f17996h;

    /* JADX INFO: renamed from: i */
    public int f17997i;

    /* JADX INFO: renamed from: j */
    public int f17998j;

    /* JADX INFO: renamed from: k */
    public int f17999k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f17975m = new int[]{8, 8, 8};
        f17976n = new int[]{8};
        f17977o = new byte[]{-1, -40, -1};
        f17978p = new byte[]{102, 116, 121, 112};
        f17979q = new byte[]{109, 105, 102, 49};
        f17980r = new byte[]{104, 101, 105, 99};
        f17981s = new byte[]{79, 76, 89, 77, 80, 0};
        f17982t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f17983u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f17984v = new byte[]{101, 88, 73, 102};
        f17985w = new byte[]{73, 72, 68, 82};
        f17986x = new byte[]{73, 69, 78, 68};
        f17987y = new byte[]{82, 73, 70, 70};
        f17988z = new byte[]{87, 69, 66, 80};
        f17960A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f17961B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f17962C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f17963D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        bc1[] bc1VarArr = {new bc1(254, "NewSubfileType", 4), new bc1(255, "SubfileType", 4), new bc1(256, 3, 4, "ImageWidth"), new bc1(257, 3, 4, "ImageLength"), new bc1(258, "BitsPerSample", 3), new bc1(259, "Compression", 3), new bc1(262, "PhotometricInterpretation", 3), new bc1(270, "ImageDescription", 2), new bc1(271, "Make", 2), new bc1(272, "Model", 2), new bc1(273, 3, 4, "StripOffsets"), new bc1(274, "Orientation", 3), new bc1(277, "SamplesPerPixel", 3), new bc1(278, 3, 4, "RowsPerStrip"), new bc1(279, 3, 4, "StripByteCounts"), new bc1(282, "XResolution", 5), new bc1(283, "YResolution", 5), new bc1(284, "PlanarConfiguration", 3), new bc1(296, "ResolutionUnit", 3), new bc1(C0313rh.f10781e1, "TransferFunction", 3), new bc1(305, "Software", 2), new bc1(306, "DateTime", 2), new bc1(315, "Artist", 2), new bc1(318, "WhitePoint", 5), new bc1(319, "PrimaryChromaticities", 5), new bc1(330, "SubIFDPointer", 4), new bc1(513, "JPEGInterchangeFormat", 4), new bc1(514, "JPEGInterchangeFormatLength", 4), new bc1(529, "YCbCrCoefficients", 5), new bc1(530, "YCbCrSubSampling", 3), new bc1(531, "YCbCrPositioning", 3), new bc1(532, "ReferenceBlackWhite", 5), new bc1(33432, "Copyright", 2), new bc1(34665, "ExifIFDPointer", 4), new bc1(34853, "GPSInfoIFDPointer", 4), new bc1(4, "SensorTopBorder", 4), new bc1(5, "SensorLeftBorder", 4), new bc1(6, "SensorBottomBorder", 4), new bc1(7, "SensorRightBorder", 4), new bc1(23, "ISO", 3), new bc1(46, "JpgFromRaw", 7), new bc1(700, "Xmp", 1)};
        bc1[] bc1VarArr2 = {new bc1(33434, "ExposureTime", 5), new bc1(33437, "FNumber", 5), new bc1(34850, "ExposureProgram", 3), new bc1(34852, "SpectralSensitivity", 2), new bc1(34855, "PhotographicSensitivity", 3), new bc1(34856, "OECF", 7), new bc1(34864, "SensitivityType", 3), new bc1(34865, "StandardOutputSensitivity", 4), new bc1(34866, "RecommendedExposureIndex", 4), new bc1(34867, "ISOSpeed", 4), new bc1(34868, "ISOSpeedLatitudeyyy", 4), new bc1(34869, "ISOSpeedLatitudezzz", 4), new bc1(36864, "ExifVersion", 2), new bc1(36867, "DateTimeOriginal", 2), new bc1(36868, "DateTimeDigitized", 2), new bc1(36880, "OffsetTime", 2), new bc1(36881, "OffsetTimeOriginal", 2), new bc1(36882, "OffsetTimeDigitized", 2), new bc1(37121, "ComponentsConfiguration", 7), new bc1(37122, "CompressedBitsPerPixel", 5), new bc1(37377, "ShutterSpeedValue", 10), new bc1(37378, "ApertureValue", 5), new bc1(37379, "BrightnessValue", 10), new bc1(37380, "ExposureBiasValue", 10), new bc1(37381, "MaxApertureValue", 5), new bc1(37382, "SubjectDistance", 5), new bc1(37383, "MeteringMode", 3), new bc1(37384, "LightSource", 3), new bc1(37385, "Flash", 3), new bc1(37386, "FocalLength", 5), new bc1(37396, "SubjectArea", 3), new bc1(37500, "MakerNote", 7), new bc1(37510, "UserComment", 7), new bc1(37520, "SubSecTime", 2), new bc1(37521, "SubSecTimeOriginal", 2), new bc1(37522, "SubSecTimeDigitized", 2), new bc1(40960, "FlashpixVersion", 7), new bc1(40961, "ColorSpace", 3), new bc1(40962, 3, 4, "PixelXDimension"), new bc1(40963, 3, 4, "PixelYDimension"), new bc1(40964, "RelatedSoundFile", 2), new bc1(40965, "InteroperabilityIFDPointer", 4), new bc1(41483, "FlashEnergy", 5), new bc1(41484, "SpatialFrequencyResponse", 7), new bc1(41486, "FocalPlaneXResolution", 5), new bc1(41487, "FocalPlaneYResolution", 5), new bc1(41488, "FocalPlaneResolutionUnit", 3), new bc1(41492, "SubjectLocation", 3), new bc1(41493, "ExposureIndex", 5), new bc1(41495, "SensingMethod", 3), new bc1(41728, "FileSource", 7), new bc1(41729, "SceneType", 7), new bc1(41730, "CFAPattern", 7), new bc1(41985, "CustomRendered", 3), new bc1(41986, "ExposureMode", 3), new bc1(41987, "WhiteBalance", 3), new bc1(41988, "DigitalZoomRatio", 5), new bc1(41989, "FocalLengthIn35mmFilm", 3), new bc1(41990, "SceneCaptureType", 3), new bc1(41991, "GainControl", 3), new bc1(41992, "Contrast", 3), new bc1(41993, "Saturation", 3), new bc1(41994, "Sharpness", 3), new bc1(41995, "DeviceSettingDescription", 7), new bc1(41996, "SubjectDistanceRange", 3), new bc1(42016, "ImageUniqueID", 2), new bc1(42032, "CameraOwnerName", 2), new bc1(42033, "BodySerialNumber", 2), new bc1(42034, "LensSpecification", 5), new bc1(42035, "LensMake", 2), new bc1(42036, "LensModel", 2), new bc1(42240, "Gamma", 5), new bc1(50706, "DNGVersion", 1), new bc1(50720, 3, 4, "DefaultCropSize")};
        bc1[] bc1VarArr3 = {new bc1(0, "GPSVersionID", 1), new bc1(1, "GPSLatitudeRef", 2), new bc1(2, 5, 10, "GPSLatitude"), new bc1(3, "GPSLongitudeRef", 2), new bc1(4, 5, 10, "GPSLongitude"), new bc1(5, "GPSAltitudeRef", 1), new bc1(6, "GPSAltitude", 5), new bc1(7, "GPSTimeStamp", 5), new bc1(8, "GPSSatellites", 2), new bc1(9, "GPSStatus", 2), new bc1(10, "GPSMeasureMode", 2), new bc1(11, "GPSDOP", 5), new bc1(12, "GPSSpeedRef", 2), new bc1(13, "GPSSpeed", 5), new bc1(14, "GPSTrackRef", 2), new bc1(15, "GPSTrack", 5), new bc1(16, "GPSImgDirectionRef", 2), new bc1(17, "GPSImgDirection", 5), new bc1(18, "GPSMapDatum", 2), new bc1(19, "GPSDestLatitudeRef", 2), new bc1(20, "GPSDestLatitude", 5), new bc1(21, "GPSDestLongitudeRef", 2), new bc1(22, "GPSDestLongitude", 5), new bc1(23, "GPSDestBearingRef", 2), new bc1(24, "GPSDestBearing", 5), new bc1(25, "GPSDestDistanceRef", 2), new bc1(26, "GPSDestDistance", 5), new bc1(27, "GPSProcessingMethod", 7), new bc1(28, "GPSAreaInformation", 7), new bc1(29, "GPSDateStamp", 2), new bc1(30, "GPSDifferential", 3), new bc1(31, "GPSHPositioningError", 5)};
        bc1[] bc1VarArr4 = {new bc1(1, "InteroperabilityIndex", 2)};
        bc1[] bc1VarArr5 = {new bc1(254, "NewSubfileType", 4), new bc1(255, "SubfileType", 4), new bc1(256, 3, 4, "ThumbnailImageWidth"), new bc1(257, 3, 4, "ThumbnailImageLength"), new bc1(258, "BitsPerSample", 3), new bc1(259, "Compression", 3), new bc1(262, "PhotometricInterpretation", 3), new bc1(270, "ImageDescription", 2), new bc1(271, "Make", 2), new bc1(272, "Model", 2), new bc1(273, 3, 4, "StripOffsets"), new bc1(274, "ThumbnailOrientation", 3), new bc1(277, "SamplesPerPixel", 3), new bc1(278, 3, 4, "RowsPerStrip"), new bc1(279, 3, 4, "StripByteCounts"), new bc1(282, "XResolution", 5), new bc1(283, "YResolution", 5), new bc1(284, "PlanarConfiguration", 3), new bc1(296, "ResolutionUnit", 3), new bc1(C0313rh.f10781e1, "TransferFunction", 3), new bc1(305, "Software", 2), new bc1(306, "DateTime", 2), new bc1(315, "Artist", 2), new bc1(318, "WhitePoint", 5), new bc1(319, "PrimaryChromaticities", 5), new bc1(330, "SubIFDPointer", 4), new bc1(513, "JPEGInterchangeFormat", 4), new bc1(514, "JPEGInterchangeFormatLength", 4), new bc1(529, "YCbCrCoefficients", 5), new bc1(530, "YCbCrSubSampling", 3), new bc1(531, "YCbCrPositioning", 3), new bc1(532, "ReferenceBlackWhite", 5), new bc1(33432, "Copyright", 2), new bc1(34665, "ExifIFDPointer", 4), new bc1(34853, "GPSInfoIFDPointer", 4), new bc1(50706, "DNGVersion", 1), new bc1(50720, 3, 4, "DefaultCropSize")};
        f17964E = new bc1(273, "StripOffsets", 3);
        f17965F = new bc1[][]{bc1VarArr, bc1VarArr2, bc1VarArr3, bc1VarArr4, bc1VarArr5, bc1VarArr, new bc1[]{new bc1(256, "ThumbnailImage", 7), new bc1(8224, "CameraSettingsIFDPointer", 4), new bc1(8256, "ImageProcessingIFDPointer", 4)}, new bc1[]{new bc1(257, "PreviewImageStart", 4), new bc1(258, "PreviewImageLength", 4)}, new bc1[]{new bc1(4371, "AspectFrame", 3)}, new bc1[]{new bc1(55, "ColorSpace", 3)}};
        f17966G = new bc1[]{new bc1(330, "SubIFDPointer", 4), new bc1(34665, "ExifIFDPointer", 4), new bc1(34853, "GPSInfoIFDPointer", 4), new bc1(40965, "InteroperabilityIFDPointer", 4), new bc1(8224, "CameraSettingsIFDPointer", 1), new bc1(8256, "ImageProcessingIFDPointer", 1)};
        f17967H = new HashMap[10];
        f17968I = new HashMap[10];
        f17969J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f17970K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f17971L = charsetForName;
        f17972M = "Exif\u0000\u0000".getBytes(charsetForName);
        f17973N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            bc1[][] bc1VarArr6 = f17965F;
            if (i >= bc1VarArr6.length) {
                HashMap map = f17970K;
                bc1[] bc1VarArr7 = f17966G;
                map.put(Integer.valueOf(bc1VarArr7[0].f15201a), 5);
                map.put(Integer.valueOf(bc1VarArr7[1].f15201a), 1);
                map.put(Integer.valueOf(bc1VarArr7[2].f15201a), 2);
                map.put(Integer.valueOf(bc1VarArr7[3].f15201a), 3);
                map.put(Integer.valueOf(bc1VarArr7[4].f15201a), 7);
                map.put(Integer.valueOf(bc1VarArr7[5].f15201a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f17967H[i] = new HashMap();
            f17968I[i] = new HashMap();
            for (bc1 bc1Var : bc1VarArr6[i]) {
                f17967H[i].put(Integer.valueOf(bc1Var.f15201a), bc1Var);
                f17968I[i].put(bc1Var.f15202b, bc1Var);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m5056q(zb1 zb1Var) throws IOException {
        short s = zb1Var.readShort();
        boolean z = f17974l;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            wb1.m12190h(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public final void m5057a() {
        HashMap[] mapArr = this.f17992d;
        String strM5058b = m5058b("DateTimeOriginal");
        if (strM5058b != null && m5058b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM5058b.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f17971L);
            map.put("DateTime", new ac1(bytes, 2, bytes.length));
        }
        if (m5058b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", ac1.m184a(0L, this.f17994f));
        }
        if (m5058b("ImageLength") == null) {
            mapArr[0].put("ImageLength", ac1.m184a(0L, this.f17994f));
        }
        if (m5058b("Orientation") == null) {
            mapArr[0].put("Orientation", ac1.m184a(0L, this.f17994f));
        }
        if (m5058b("LightSource") == null) {
            mapArr[1].put("LightSource", ac1.m184a(0L, this.f17994f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m5058b(String str) {
        ac1 ac1VarM5059c = m5059c(str);
        if (ac1VarM5059c != null) {
            int i = ac1VarM5059c.f242a;
            if (!f17969J.contains(str)) {
                return ac1VarM5059c.m189f(this.f17994f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                cc1[] cc1VarArr = (cc1[]) ac1VarM5059c.m190g(this.f17994f);
                if (cc1VarArr == null || cc1VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(cc1VarArr));
                    return null;
                }
                cc1 cc1Var = cc1VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (cc1Var.f15922a / cc1Var.f15923b));
                cc1 cc1Var2 = cc1VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (cc1Var2.f15922a / cc1Var2.f15923b));
                cc1 cc1Var3 = cc1VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (cc1Var3.f15922a / cc1Var3.f15923b)));
            }
            try {
                return Double.toString(ac1VarM5059c.m187d(this.f17994f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final ac1 m5059c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f17974l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f17965F.length; i++) {
            ac1 ac1Var = (ac1) this.f17992d[i].get(str);
            if (ac1Var != null) {
                return ac1Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m5060d(dc1 dc1Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        HashMap[] mapArr = this.f17992d;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                hc1.m6332a(mediaMetadataRetriever, new yb1(dc1Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", ac1.m186c(Integer.parseInt(strExtractMetadata), this.f17994f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", ac1.m186c(Integer.parseInt(strExtractMetadata2), this.f17994f));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", ac1.m186c(i, this.f17994f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    dc1Var.m4429b(i3);
                    byte[] bArr = new byte[6];
                    dc1Var.readFully(bArr);
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f17972M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    dc1Var.readFully(bArr2);
                    this.f17996h = i5;
                    m5073r(0, bArr2);
                }
                if (f17974l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143 A[LOOP:2: B:66:0x0136->B:71:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194 A[LOOP:0: B:10:0x0036->B:79:0x0194, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0146 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m5061e(zb1 zb1Var, int i, int i2) throws Throwable {
        byte[] bArr;
        int i3;
        int length;
        byte[] bArrCopyOfRange;
        HashMap[] mapArr = this.f17992d;
        String str = "ExifInterface";
        boolean z = f17974l;
        if (z) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + zb1Var);
        }
        zb1Var.f35916c = ByteOrder.BIG_ENDIAN;
        byte b = zb1Var.readByte();
        byte b2 = -1;
        if (b != -1) {
            wb1.m12190h(Integer.toHexString(b & 255), "Invalid marker: ");
            return;
        }
        if (zb1Var.readByte() != -40) {
            wb1.m12190h(Integer.toHexString(b & 255), "Invalid marker: ");
            return;
        }
        int i4 = 2;
        int i5 = 2;
        while (true) {
            byte b3 = zb1Var.readByte();
            if (b3 != b2) {
                wb1.m12190h(Integer.toHexString(b3 & 255), "Invalid marker:");
                return;
            }
            byte b4 = zb1Var.readByte();
            if (z) {
                Log.d(str, "Found JPEG segment indicator: " + Integer.toHexString(b4 & 255));
            }
            if (b4 == -39 || b4 == -38) {
                zb1Var.f35916c = this.f17994f;
                return;
            }
            int unsignedShort = zb1Var.readUnsignedShort();
            int i6 = unsignedShort - 2;
            int i7 = i5 + 4;
            if (z) {
                Log.d(str, "JPEG segment: " + Integer.toHexString(b4 & 255) + " (length: " + unsignedShort + ")");
            }
            if (i6 < 0) {
                wb1.m12191j("Invalid length");
                return;
            }
            if (b4 != -31) {
                if (b4 != -2) {
                    switch (b4) {
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                        default:
                            switch (b4) {
                                case -59:
                                case -58:
                                case -57:
                                    break;
                                default:
                                    switch (b4) {
                                        case -55:
                                        case -54:
                                        case -53:
                                            break;
                                        default:
                                            switch (b4) {
                                                case -51:
                                                case -50:
                                                case -49:
                                                    break;
                                                default:
                                                    mapArr = mapArr;
                                                    str = str;
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    zb1Var.m13465a(1);
                    mapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", ac1.m184a(zb1Var.readUnsignedShort(), this.f17994f));
                    mapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", ac1.m184a(zb1Var.readUnsignedShort(), this.f17994f));
                    i6 = unsignedShort - 7;
                    mapArr = mapArr;
                    str = str;
                } else {
                    byte[] bArr2 = new byte[i6];
                    zb1Var.readFully(bArr2);
                    if (m5058b("UserComment") == null) {
                        HashMap map = mapArr[1];
                        Charset charset = f17971L;
                        byte[] bytes = new String(bArr2, charset).concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(charset);
                        map.put("UserComment", new ac1(bytes, i4, bytes.length));
                    }
                    mapArr = mapArr;
                    str = str;
                }
                if (i6 >= 0) {
                    wb1.m12191j("Invalid length");
                    return;
                }
                zb1Var.m13465a(i6);
                i5 = i7 + i6;
                mapArr = mapArr;
                str = str;
                i4 = 2;
                b2 = -1;
            } else {
                byte[] bArr3 = new byte[i6];
                zb1Var.readFully(bArr3);
                int i8 = i7 + i6;
                byte[] bArr4 = f17972M;
                if (bArr4 != null && i6 >= bArr4.length) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= bArr4.length) {
                            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, bArr4.length, i6);
                            this.f17996h = i + i7 + bArr4.length;
                            m5073r(i2, bArrCopyOfRange2);
                            m5076u(new zb1(bArrCopyOfRange2));
                        } else if (bArr3[i9] != bArr4[i9]) {
                            bArr = f17973N;
                            if (bArr != null && i6 >= bArr.length) {
                                i3 = 0;
                                while (true) {
                                    if (i3 < bArr.length) {
                                        length = i7 + bArr.length;
                                        bArrCopyOfRange = Arrays.copyOfRange(bArr3, bArr.length, i6);
                                        if (m5058b("Xmp") == null) {
                                            mapArr[0].put("Xmp", new ac1(length, bArrCopyOfRange, 1, bArrCopyOfRange.length));
                                        }
                                    } else if (bArr3[i3] != bArr[i3]) {
                                        i3++;
                                    }
                                }
                            }
                        } else {
                            i9++;
                        }
                    }
                } else {
                    bArr = f17973N;
                    if (bArr != null) {
                        i3 = 0;
                        while (true) {
                            if (i3 < bArr.length) {
                                length = i7 + bArr.length;
                                bArrCopyOfRange = Arrays.copyOfRange(bArr3, bArr.length, i6);
                                if (m5058b("Xmp") == null) {
                                    mapArr[0].put("Xmp", new ac1(length, bArrCopyOfRange, 1, bArrCopyOfRange.length));
                                }
                            } else if (bArr3[i3] != bArr[i3]) {
                                i3++;
                            }
                        }
                    }
                }
                i7 = i8;
            }
            i6 = 0;
            if (i6 >= 0) {
                wb1.m12191j("Invalid length");
                return;
            }
            zb1Var.m13465a(i6);
            i5 = i7 + i6;
            mapArr = mapArr;
            str = str;
            i4 = 2;
            b2 = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:121:0x015b A[LOOP:3: B:116:0x014f->B:121:0x015b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x016f A[LOOP:4: B:123:0x0160->B:128:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0175 A[LOOP:2: B:111:0x0142->B:131:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x017d  */
    /* JADX WARN: Code duplicated, block: B:154:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x016e A[EDGE_INSN: B:168:0x016e->B:127:0x016e BREAK  A[LOOP:3: B:116:0x014f->B:121:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x016e A[EDGE_INSN: B:170:0x016e->B:127:0x016e BREAK  A[LOOP:3: B:116:0x014f->B:121:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX INFO: renamed from: f */
    public final int m5062f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        zb1 zb1Var;
        zb1 zb1Var2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        zb1 zb1Var3;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = f17977o;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    byte b = bArr4[i8];
                    ?? r7 = bytes[i8];
                    if (b != r7) {
                        ?? r4 = 0;
                        zb1 zb1Var4 = null;
                        zb1 zb1Var5 = null;
                        zb1 zb1Var6 = null;
                        try {
                            try {
                                try {
                                    try {
                                        zb1Var = new zb1(bArr4);
                                        try {
                                            long j2 = zb1Var.readInt();
                                            byte[] bArr6 = new byte[4];
                                            zb1Var.readFully(bArr6);
                                            if (Arrays.equals(bArr6, f17978p)) {
                                                if (j2 == 1) {
                                                    j2 = zb1Var.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    boolean z = false;
                                                    boolean z2 = false;
                                                    for (long j4 = 0; j4 < j3 / 4; j4++) {
                                                        try {
                                                            zb1Var.readFully(bArr7);
                                                            if (j4 != 1) {
                                                                i = 0;
                                                                try {
                                                                    if (Arrays.equals(bArr7, f17979q)) {
                                                                        z = true;
                                                                    } else if (Arrays.equals(bArr7, f17980r)) {
                                                                        z2 = true;
                                                                    }
                                                                    if (z && z2) {
                                                                        zb1Var.close();
                                                                        return 12;
                                                                    }
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                }
                                                            }
                                                        } catch (EOFException unused) {
                                                        }
                                                    }
                                                    i = 0;
                                                    zb1Var.close();
                                                    zb1Var2 = new zb1(bArr4);
                                                    ByteOrder byteOrderM5056q = m5056q(zb1Var2);
                                                    this.f17994f = byteOrderM5056q;
                                                    zb1Var2.f35916c = byteOrderM5056q;
                                                    s = zb1Var2.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    zb1Var2.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        zb1Var3 = new zb1(bArr4);
                                                        try {
                                                            ByteOrder byteOrderM5056q2 = m5056q(zb1Var3);
                                                            this.f17994f = byteOrderM5056q2;
                                                            zb1Var3.f35916c = byteOrderM5056q2;
                                                            i3 = zb1Var3.readShort() != 85 ? i : 1;
                                                            zb1Var3.close();
                                                        } catch (Exception unused2) {
                                                            zb1Var4 = zb1Var3;
                                                            if (zb1Var4 != null) {
                                                                zb1Var4.close();
                                                            }
                                                            i3 = i;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            zb1Var5 = zb1Var3;
                                                            if (zb1Var5 != null) {
                                                                zb1Var5.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused3) {
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = f17983u;
                                                        if (i4 >= bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            while (true) {
                                                                bArr2 = f17987y;
                                                                if (i5 >= bArr2.length) {
                                                                    i6 = i;
                                                                    while (true) {
                                                                        bArr3 = f17988z;
                                                                        if (i6 >= bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i5] != bArr2[i5]) {
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                            }
                                                            return i;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                                if (f17974l) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (zb1Var != null) {
                                                    zb1Var.close();
                                                }
                                                zb1Var2 = new zb1(bArr4);
                                                ByteOrder byteOrderM5056q3 = m5056q(zb1Var2);
                                                this.f17994f = byteOrderM5056q3;
                                                zb1Var2.f35916c = byteOrderM5056q3;
                                                s = zb1Var2.readShort();
                                                if (s != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                zb1Var2.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                zb1Var3 = new zb1(bArr4);
                                                ByteOrder byteOrderM5056q4 = m5056q(zb1Var3);
                                                this.f17994f = byteOrderM5056q4;
                                                zb1Var3.f35916c = byteOrderM5056q4;
                                                if (zb1Var3.readShort() != 85) {
                                                }
                                                zb1Var3.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = f17983u;
                                                    if (i4 >= bArr.length) {
                                                        return 13;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        i5 = i;
                                                        while (true) {
                                                            bArr2 = f17987y;
                                                            if (i5 >= bArr2.length) {
                                                                i6 = i;
                                                                while (true) {
                                                                    bArr3 = f17988z;
                                                                    if (i6 >= bArr3.length) {
                                                                        return 14;
                                                                    }
                                                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            } else {
                                                                if (bArr4[i5] != bArr2[i5]) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i5++;
                                                            }
                                                        }
                                                        return i;
                                                    }
                                                    i4++;
                                                }
                                            }
                                            zb1Var.close();
                                            i = 0;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i = 0;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        i = 0;
                                        zb1Var = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (r4 != 0) {
                                            r4.close();
                                        }
                                        throw th;
                                    }
                                    ByteOrder byteOrderM5056q5 = m5056q(zb1Var2);
                                    this.f17994f = byteOrderM5056q5;
                                    zb1Var2.f35916c = byteOrderM5056q5;
                                    s = zb1Var2.readShort();
                                    if (s != 20306) {
                                        i2 = 1;
                                    } else {
                                        i2 = 1;
                                    }
                                    zb1Var2.close();
                                } catch (Exception unused4) {
                                    if (zb1Var2 != null) {
                                        zb1Var2.close();
                                    }
                                    i2 = i;
                                } catch (Throwable th4) {
                                    th = th4;
                                    zb1Var6 = zb1Var2;
                                    if (zb1Var6 != null) {
                                        zb1Var6.close();
                                    }
                                    throw th;
                                }
                                zb1Var2 = new zb1(bArr4);
                            } catch (Exception unused5) {
                                zb1Var2 = null;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            if (i2 != 0) {
                                return 7;
                            }
                            zb1Var3 = new zb1(bArr4);
                            ByteOrder byteOrderM5056q6 = m5056q(zb1Var3);
                            this.f17994f = byteOrderM5056q6;
                            zb1Var3.f35916c = byteOrderM5056q6;
                            if (zb1Var3.readShort() != 85) {
                            }
                            zb1Var3.close();
                            if (i3 != 0) {
                                return 10;
                            }
                            i4 = i;
                            while (true) {
                                bArr = f17983u;
                                if (i4 >= bArr.length) {
                                    return 13;
                                }
                                if (bArr4[i4] != bArr[i4]) {
                                    i5 = i;
                                    while (true) {
                                        bArr2 = f17987y;
                                        if (i5 >= bArr2.length) {
                                            i6 = i;
                                            while (true) {
                                                bArr3 = f17988z;
                                                if (i6 >= bArr3.length) {
                                                    return 14;
                                                }
                                                if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                    break;
                                                    break;
                                                }
                                                i6++;
                                            }
                                        } else {
                                            if (bArr4[i5] != bArr2[i5]) {
                                                break;
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    return i;
                                }
                                i4++;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            r4 = r7;
                            if (r4 != 0) {
                                r4.close();
                            }
                            throw th;
                        }
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5063g(dc1 dc1Var) throws Throwable {
        int i;
        int i2;
        m5066j(dc1Var);
        HashMap[] mapArr = this.f17992d;
        ac1 ac1Var = (ac1) mapArr[1].get("MakerNote");
        if (ac1Var != null) {
            dc1 dc1Var2 = new dc1(ac1Var.f245d);
            dc1Var2.f35916c = this.f17994f;
            byte[] bArr = f17981s;
            byte[] bArr2 = new byte[bArr.length];
            dc1Var2.readFully(bArr2);
            dc1Var2.m4429b(0L);
            byte[] bArr3 = f17982t;
            byte[] bArr4 = new byte[bArr3.length];
            dc1Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                dc1Var2.m4429b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                dc1Var2.m4429b(12L);
            }
            m5074s(dc1Var2, 6);
            ac1 ac1Var2 = (ac1) mapArr[7].get("PreviewImageStart");
            ac1 ac1Var3 = (ac1) mapArr[7].get("PreviewImageLength");
            if (ac1Var2 != null && ac1Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", ac1Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", ac1Var3);
            }
            ac1 ac1Var4 = (ac1) mapArr[8].get("AspectFrame");
            if (ac1Var4 != null) {
                int[] iArr = (int[]) ac1Var4.m190g(this.f17994f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                ac1 ac1VarM186c = ac1.m186c(i5, this.f17994f);
                ac1 ac1VarM186c2 = ac1.m186c(i6, this.f17994f);
                mapArr[0].put("ImageWidth", ac1VarM186c);
                mapArr[0].put("ImageLength", ac1VarM186c2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5064h(zb1 zb1Var) throws Throwable {
        if (f17974l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + zb1Var);
        }
        zb1Var.f35916c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f17983u;
        zb1Var.m13465a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = zb1Var.readInt();
                byte[] bArr2 = new byte[4];
                zb1Var.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f17985w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f17986x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f17984v)) {
                    byte[] bArr3 = new byte[i];
                    zb1Var.readFully(bArr3);
                    int i3 = zb1Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f17996h = i2;
                        m5073r(0, bArr3);
                        m5079x();
                        m5076u(new zb1(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                zb1Var.m13465a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                wb1.m12191j("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5065i(zb1 zb1Var) throws Throwable {
        HashMap[] mapArr = this.f17992d;
        boolean z = f17974l;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + zb1Var);
        }
        zb1Var.m13465a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        zb1Var.readFully(bArr);
        zb1Var.readFully(bArr2);
        zb1Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        zb1Var.m13465a(i - zb1Var.f35915b);
        zb1Var.readFully(bArr4);
        m5061e(new zb1(bArr4), i, 5);
        zb1Var.m13465a(i3 - zb1Var.f35915b);
        zb1Var.f35916c = ByteOrder.BIG_ENDIAN;
        int i4 = zb1Var.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = zb1Var.readUnsignedShort();
            int unsignedShort2 = zb1Var.readUnsignedShort();
            if (unsignedShort == f17964E.f15201a) {
                short s = zb1Var.readShort();
                short s2 = zb1Var.readShort();
                ac1 ac1VarM186c = ac1.m186c(s, this.f17994f);
                ac1 ac1VarM186c2 = ac1.m186c(s2, this.f17994f);
                mapArr[0].put("ImageLength", ac1VarM186c);
                mapArr[0].put("ImageWidth", ac1VarM186c2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            zb1Var.m13465a(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5066j(dc1 dc1Var) throws Throwable {
        ac1 ac1Var;
        HashMap[] mapArr = this.f17992d;
        m5071o(dc1Var);
        m5074s(dc1Var, 0);
        m5078w(dc1Var, 0);
        m5078w(dc1Var, 5);
        m5078w(dc1Var, 4);
        m5079x();
        if (this.f17991c != 8 || (ac1Var = (ac1) mapArr[1].get("MakerNote")) == null) {
            return;
        }
        dc1 dc1Var2 = new dc1(ac1Var.f245d);
        dc1Var2.f35916c = this.f17994f;
        dc1Var2.m13465a(6);
        m5074s(dc1Var2, 9);
        ac1 ac1Var2 = (ac1) mapArr[9].get("ColorSpace");
        if (ac1Var2 != null) {
            mapArr[1].put("ColorSpace", ac1Var2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5067k(dc1 dc1Var) throws Throwable {
        HashMap[] mapArr = this.f17992d;
        if (f17974l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + dc1Var);
        }
        m5066j(dc1Var);
        ac1 ac1Var = (ac1) mapArr[0].get("JpgFromRaw");
        if (ac1Var != null) {
            m5061e(new zb1(ac1Var.f245d), (int) ac1Var.f244c, 5);
        }
        ac1 ac1Var2 = (ac1) mapArr[0].get("ISO");
        ac1 ac1Var3 = (ac1) mapArr[1].get("PhotographicSensitivity");
        if (ac1Var2 == null || ac1Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", ac1Var2);
    }

    /* JADX INFO: renamed from: l */
    public final void m5068l(zb1 zb1Var) throws Throwable {
        if (f17974l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + zb1Var);
        }
        zb1Var.f35916c = ByteOrder.LITTLE_ENDIAN;
        zb1Var.m13465a(f17987y.length);
        int i = zb1Var.readInt() + 8;
        byte[] bArr = f17988z;
        zb1Var.m13465a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                zb1Var.readFully(bArr2);
                int i2 = zb1Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f17960A, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    zb1Var.readFully(bArr3);
                    this.f17996h = i3;
                    m5073r(0, bArr3);
                    m5076u(new zb1(bArr3));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                zb1Var.m13465a(i2);
            } catch (EOFException unused) {
                wb1.m12191j("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5069m(zb1 zb1Var, HashMap map) throws Throwable {
        ac1 ac1Var = (ac1) map.get("JPEGInterchangeFormat");
        ac1 ac1Var2 = (ac1) map.get("JPEGInterchangeFormatLength");
        if (ac1Var == null || ac1Var2 == null) {
            return;
        }
        int iM188e = ac1Var.m188e(this.f17994f);
        int iM188e2 = ac1Var2.m188e(this.f17994f);
        if (this.f17991c == 7) {
            iM188e += this.f17997i;
        }
        if (iM188e > 0 && iM188e2 > 0 && this.f17990b == null && this.f17989a == null) {
            zb1Var.m13465a(iM188e);
            zb1Var.readFully(new byte[iM188e2]);
        }
        if (f17974l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM188e + ", length: " + iM188e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5070n(HashMap map) {
        ac1 ac1Var = (ac1) map.get("ImageLength");
        ac1 ac1Var2 = (ac1) map.get("ImageWidth");
        if (ac1Var == null || ac1Var2 == null) {
            return false;
        }
        return ac1Var.m188e(this.f17994f) <= 512 && ac1Var2.m188e(this.f17994f) <= 512;
    }

    /* JADX INFO: renamed from: o */
    public final void m5071o(dc1 dc1Var) throws IOException {
        ByteOrder byteOrderM5056q = m5056q(dc1Var);
        this.f17994f = byteOrderM5056q;
        dc1Var.f35916c = byteOrderM5056q;
        int unsignedShort = dc1Var.readUnsignedShort();
        int i = this.f17991c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            wb1.m12190h(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = dc1Var.readInt();
        if (i2 < 8) {
            wb1.m12191j(c75.m3877i(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            dc1Var.m13465a(i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5072p() {
        HashMap[] mapArr = this.f17992d;
        for (int i = 0; i < mapArr.length; i++) {
            StringBuilder sbM3883o = c75.m3883o("The size of tag group[", i, "]: ");
            sbM3883o.append(mapArr[i].size());
            Log.d("ExifInterface", sbM3883o.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                ac1 ac1Var = (ac1) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + ac1Var.toString() + ", tagValue: '" + ac1Var.m189f(this.f17994f) + "'");
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5073r(int i, byte[] bArr) throws IOException {
        dc1 dc1Var = new dc1(bArr);
        m5071o(dc1Var);
        m5074s(dc1Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0211  */
    /* JADX WARN: Code duplicated, block: B:107:0x021e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0223  */
    /* JADX WARN: Code duplicated, block: B:109:0x022f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0236  */
    /* JADX WARN: Code duplicated, block: B:114:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0258  */
    /* JADX WARN: Code duplicated, block: B:126:0x0296  */
    /* JADX WARN: Code duplicated, block: B:128:0x029e  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x0325  */
    /* JADX WARN: Code duplicated, block: B:174:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:73:0x015a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0174  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:94:0x0203  */
    /* JADX WARN: Code duplicated, block: B:96:0x0206  */
    /* JADX WARN: Code duplicated, block: B:98:0x0209  */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x029e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0160, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01e8, please report this as an issue */
    /* JADX INFO: renamed from: s */
    public final void m5074s(dc1 dc1Var, int i) throws IOException {
        int i2;
        long j;
        boolean z;
        int i3;
        Integer num;
        HashSet hashSet;
        long j2;
        String str;
        int unsignedShort;
        long j3;
        String strM13619s;
        int i4;
        HashMap[] mapArr = this.f17992d;
        HashSet hashSet2 = this.f17993e;
        int i5 = dc1Var.f35915b;
        int i6 = dc1Var.f35918e;
        hashSet2.add(Integer.valueOf(i5));
        short s = dc1Var.readShort();
        boolean z2 = f17974l;
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        for (short s2 = 0; s2 < s; s2 = (short) (s2 + 1)) {
            int unsignedShort2 = dc1Var.readUnsignedShort();
            int unsignedShort3 = dc1Var.readUnsignedShort();
            int i7 = dc1Var.readInt();
            long j4 = ((long) dc1Var.f35915b) + 4;
            HashMap[] mapArr2 = mapArr;
            bc1 bc1Var = (bc1) f17967H[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), bc1Var != null ? bc1Var.f15202b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i7)));
            }
            if (bc1Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f17962C;
                    if (unsignedShort3 < iArr.length) {
                        byte b = bc1Var.f15203c;
                        if (b == 7 || unsignedShort3 == 7 || b == unsignedShort3 || (i3 = bc1Var.f15204d) == unsignedShort3 || (((b == 4 || i3 == 4) && unsignedShort3 == 3) || (((b == 9 || i3 == 9) && unsignedShort3 == 8) || ((b == 12 || i3 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = b;
                            }
                            i2 = i7;
                            j = ((long) i7) * ((long) iArr[unsignedShort3]);
                            if (j < 0 || j > 2147483647L) {
                                if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i2);
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f17961B[unsignedShort3] + ") is unexpected for tag: " + bc1Var.f15202b);
                        }
                    }
                    if (z) {
                        if (j > 4) {
                            i4 = dc1Var.readInt();
                            if (z2 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.f17991c == 7) {
                                if ("MakerNote".equals(bc1Var.f15202b)) {
                                    this.f17997i = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(bc1Var.f15202b)) {
                                    this.f17998j = i4;
                                    this.f17999k = i2;
                                    ac1 ac1VarM186c = ac1.m186c(6, this.f17994f);
                                    ac1 ac1VarM184a = ac1.m184a(this.f17998j, this.f17994f);
                                    ac1 ac1VarM184a2 = ac1.m184a(this.f17999k, this.f17994f);
                                    mapArr2[4].put("Compression", ac1VarM186c);
                                    mapArr2[4].put("JPEGInterchangeFormat", ac1VarM184a);
                                    mapArr2[4].put("JPEGInterchangeFormatLength", ac1VarM184a2);
                                }
                            }
                            dc1Var.m4429b(i4);
                        } else {
                            j4 = j4;
                            i2 = i2;
                            unsignedShort2 = unsignedShort2;
                        }
                        num = (Integer) f17970K.get(Integer.valueOf(unsignedShort2));
                        if (z2 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j3 = ((long) dc1Var.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = dc1Var.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = dc1Var.readInt();
                                } else {
                                    j3 = -1;
                                }
                                if (z2 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), bc1Var.f15202b));
                                }
                                if (j3 > 0 || (i6 != -1 && j3 >= i6)) {
                                    hashSet = hashSet2;
                                    if (z2 != 0) {
                                        strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                        if (i6 != -1) {
                                            strM13619s = strM13619s + " (total length: " + i6 + ")";
                                        }
                                        Log.d("ExifInterface", strM13619s);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j3))) {
                                        dc1Var.m4429b(j3);
                                        m5074s(dc1Var, num.intValue());
                                    } else if (z2 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                                    }
                                }
                                dc1Var.m4429b(j4);
                            } else {
                                unsignedShort = dc1Var.readUnsignedShort();
                            }
                            j3 = unsignedShort;
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), bc1Var.f15202b));
                            }
                            if (j3 > 0) {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                    if (i6 != -1) {
                                        strM13619s = strM13619s + " (total length: " + i6 + ")";
                                    }
                                    Log.d("ExifInterface", strM13619s);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                    if (i6 != -1) {
                                        strM13619s = strM13619s + " (total length: " + i6 + ")";
                                    }
                                    Log.d("ExifInterface", strM13619s);
                                }
                            }
                            dc1Var.m4429b(j4);
                        } else {
                            hashSet = hashSet2;
                            j2 = j4;
                            int i8 = dc1Var.f35915b + this.f17996h;
                            byte[] bArr = new byte[(int) j];
                            dc1Var.readFully(bArr);
                            ac1 ac1Var = new ac1(i8, bArr, unsignedShort3, i2);
                            HashMap map = mapArr2[i];
                            str = bc1Var.f15202b;
                            map.put(str, ac1Var);
                            if ("DNGVersion".equals(str)) {
                                this.f17991c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && ac1Var.m189f(this.f17994f).contains("PENTAX")) || ("Compression".equals(str) && ac1Var.m188e(this.f17994f) == 65535)) {
                                this.f17991c = 8;
                            }
                            if (dc1Var.f35915b != j2) {
                                dc1Var.m4429b(j2);
                            }
                        }
                    } else {
                        dc1Var.m4429b(j4);
                        hashSet = hashSet2;
                    }
                    hashSet2 = hashSet;
                    mapArr = mapArr2;
                    s = s;
                    z2 = z2;
                }
                i2 = i7;
                if (z2 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j = 0;
                z = false;
                if (z) {
                    dc1Var.m4429b(j4);
                    hashSet = hashSet2;
                } else {
                    if (j > 4) {
                        i4 = dc1Var.readInt();
                        if (z2 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.f17991c == 7) {
                            if ("MakerNote".equals(bc1Var.f15202b)) {
                                this.f17997i = i4;
                            } else if (i != 6) {
                            }
                        }
                        dc1Var.m4429b(i4);
                    } else {
                        j4 = j4;
                        i2 = i2;
                        unsignedShort2 = unsignedShort2;
                    }
                    num = (Integer) f17970K.get(Integer.valueOf(unsignedShort2));
                    if (z2 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j3 = ((long) dc1Var.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = dc1Var.readInt();
                            } else {
                                unsignedShort = dc1Var.readShort();
                            }
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), bc1Var.f15202b));
                            }
                            if (j3 > 0) {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                    if (i6 != -1) {
                                        strM13619s = strM13619s + " (total length: " + i6 + ")";
                                    }
                                    Log.d("ExifInterface", strM13619s);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z2 != 0) {
                                    strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                    if (i6 != -1) {
                                        strM13619s = strM13619s + " (total length: " + i6 + ")";
                                    }
                                    Log.d("ExifInterface", strM13619s);
                                }
                            }
                            dc1Var.m4429b(j4);
                        } else {
                            unsignedShort = dc1Var.readUnsignedShort();
                        }
                        j3 = unsignedShort;
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), bc1Var.f15202b));
                        }
                        if (j3 > 0) {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                if (i6 != -1) {
                                    strM13619s = strM13619s + " (total length: " + i6 + ")";
                                }
                                Log.d("ExifInterface", strM13619s);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                if (i6 != -1) {
                                    strM13619s = strM13619s + " (total length: " + i6 + ")";
                                }
                                Log.d("ExifInterface", strM13619s);
                            }
                        }
                        dc1Var.m4429b(j4);
                    } else {
                        hashSet = hashSet2;
                        j2 = j4;
                        int i9 = dc1Var.f35915b + this.f17996h;
                        byte[] bArr2 = new byte[(int) j];
                        dc1Var.readFully(bArr2);
                        ac1 ac1Var2 = new ac1(i9, bArr2, unsignedShort3, i2);
                        HashMap map2 = mapArr2[i];
                        str = bc1Var.f15202b;
                        map2.put(str, ac1Var2);
                        if ("DNGVersion".equals(str)) {
                            this.f17991c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f17991c = 8;
                        if (dc1Var.f35915b != j2) {
                            dc1Var.m4429b(j2);
                        }
                    }
                }
                hashSet2 = hashSet;
                mapArr = mapArr2;
                s = s;
                z2 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            i2 = i7;
            j = 0;
            z = false;
            if (z) {
                dc1Var.m4429b(j4);
                hashSet = hashSet2;
            } else {
                if (j > 4) {
                    i4 = dc1Var.readInt();
                    if (z2 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.f17991c == 7) {
                        if ("MakerNote".equals(bc1Var.f15202b)) {
                            this.f17997i = i4;
                        } else if (i != 6) {
                        }
                    }
                    dc1Var.m4429b(i4);
                } else {
                    j4 = j4;
                    i2 = i2;
                    unsignedShort2 = unsignedShort2;
                }
                num = (Integer) f17970K.get(Integer.valueOf(unsignedShort2));
                if (z2 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j3 = ((long) dc1Var.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = dc1Var.readInt();
                        } else {
                            unsignedShort = dc1Var.readShort();
                        }
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), bc1Var.f15202b));
                        }
                        if (j3 > 0) {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                if (i6 != -1) {
                                    strM13619s = strM13619s + " (total length: " + i6 + ")";
                                }
                                Log.d("ExifInterface", strM13619s);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z2 != 0) {
                                strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                                if (i6 != -1) {
                                    strM13619s = strM13619s + " (total length: " + i6 + ")";
                                }
                                Log.d("ExifInterface", strM13619s);
                            }
                        }
                        dc1Var.m4429b(j4);
                    } else {
                        unsignedShort = dc1Var.readUnsignedShort();
                    }
                    j3 = unsignedShort;
                    if (z2 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), bc1Var.f15202b));
                    }
                    if (j3 > 0) {
                        hashSet = hashSet2;
                        if (z2 != 0) {
                            strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                            if (i6 != -1) {
                                strM13619s = strM13619s + " (total length: " + i6 + ")";
                            }
                            Log.d("ExifInterface", strM13619s);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z2 != 0) {
                            strM13619s = zi4.m13619s("Skip jump into the IFD since its offset is invalid: ", j3);
                            if (i6 != -1) {
                                strM13619s = strM13619s + " (total length: " + i6 + ")";
                            }
                            Log.d("ExifInterface", strM13619s);
                        }
                    }
                    dc1Var.m4429b(j4);
                } else {
                    hashSet = hashSet2;
                    j2 = j4;
                    int i10 = dc1Var.f35915b + this.f17996h;
                    byte[] bArr3 = new byte[(int) j];
                    dc1Var.readFully(bArr3);
                    ac1 ac1Var3 = new ac1(i10, bArr3, unsignedShort3, i2);
                    HashMap map3 = mapArr2[i];
                    str = bc1Var.f15202b;
                    map3.put(str, ac1Var3);
                    if ("DNGVersion".equals(str)) {
                        this.f17991c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f17991c = 8;
                    if (dc1Var.f35915b != j2) {
                        dc1Var.m4429b(j2);
                    }
                }
            }
            hashSet2 = hashSet;
            mapArr = mapArr2;
            s = s;
            z2 = z2;
        }
        HashMap[] mapArr3 = mapArr;
        HashSet hashSet3 = hashSet2;
        boolean z3 = z2;
        int i11 = dc1Var.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j5 = i11;
        if (j5 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i11))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        dc1Var.m4429b(j5);
        if (mapArr3[4].isEmpty()) {
            m5074s(dc1Var, 4);
        } else if (mapArr3[5].isEmpty()) {
            m5074s(dc1Var, 5);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5075t(String str, int i, String str2) {
        HashMap[] mapArr = this.f17992d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m5076u(zb1 zb1Var) throws Throwable {
        ac1 ac1Var;
        int iM188e;
        HashMap map = this.f17992d[4];
        ac1 ac1Var2 = (ac1) map.get("Compression");
        if (ac1Var2 == null) {
            m5069m(zb1Var, map);
            return;
        }
        int iM188e2 = ac1Var2.m188e(this.f17994f);
        if (iM188e2 != 1) {
            if (iM188e2 == 6) {
                m5069m(zb1Var, map);
                return;
            } else if (iM188e2 != 7) {
                return;
            }
        }
        ac1 ac1Var3 = (ac1) map.get("BitsPerSample");
        if (ac1Var3 != null) {
            int[] iArr = (int[]) ac1Var3.m190g(this.f17994f);
            int[] iArr2 = f17975m;
            if (Arrays.equals(iArr2, iArr) || (this.f17991c == 3 && (ac1Var = (ac1) map.get("PhotometricInterpretation")) != null && (((iM188e = ac1Var.m188e(this.f17994f)) == 1 && Arrays.equals(iArr, f17976n)) || (iM188e == 6 && Arrays.equals(iArr, iArr2))))) {
                ac1 ac1Var4 = (ac1) map.get("StripOffsets");
                ac1 ac1Var5 = (ac1) map.get("StripByteCounts");
                if (ac1Var4 == null || ac1Var5 == null) {
                    return;
                }
                long[] jArrM12925s = AbstractC1356y5.m12925s(ac1Var4.m190g(this.f17994f));
                long[] jArrM12925s2 = AbstractC1356y5.m12925s(ac1Var5.m190g(this.f17994f));
                if (jArrM12925s == null || jArrM12925s.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM12925s2 == null || jArrM12925s2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM12925s.length != jArrM12925s2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM12925s2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f17995g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM12925s.length; i3++) {
                    int i4 = (int) jArrM12925s[i3];
                    int i5 = (int) jArrM12925s2[i3];
                    if (i3 < jArrM12925s.length - 1 && i4 + i5 != jArrM12925s[i3 + 1]) {
                        this.f17995g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        zb1Var.m13465a(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            zb1Var.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.f17995g) {
                    long j3 = jArrM12925s[0];
                    return;
                }
                return;
            }
        }
        if (f17974l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5077v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f17992d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f17974l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ac1 ac1Var = (ac1) mapArr[i].get("ImageLength");
        ac1 ac1Var2 = (ac1) mapArr[i].get("ImageWidth");
        ac1 ac1Var3 = (ac1) mapArr[i2].get("ImageLength");
        ac1 ac1Var4 = (ac1) mapArr[i2].get("ImageWidth");
        if (ac1Var == null || ac1Var2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (ac1Var3 == null || ac1Var4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM188e = ac1Var.m188e(this.f17994f);
        int iM188e2 = ac1Var2.m188e(this.f17994f);
        int iM188e3 = ac1Var3.m188e(this.f17994f);
        int iM188e4 = ac1Var4.m188e(this.f17994f);
        if (iM188e >= iM188e3 || iM188e2 >= iM188e4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: w */
    public final void m5078w(dc1 dc1Var, int i) throws Throwable {
        ac1 ac1VarM186c;
        ac1 ac1VarM186c2;
        HashMap[] mapArr = this.f17992d;
        ac1 ac1Var = (ac1) mapArr[i].get("DefaultCropSize");
        ac1 ac1Var2 = (ac1) mapArr[i].get("SensorTopBorder");
        ac1 ac1Var3 = (ac1) mapArr[i].get("SensorLeftBorder");
        ac1 ac1Var4 = (ac1) mapArr[i].get("SensorBottomBorder");
        ac1 ac1Var5 = (ac1) mapArr[i].get("SensorRightBorder");
        if (ac1Var != null) {
            int i2 = ac1Var.f242a;
            ByteOrder byteOrder = this.f17994f;
            if (i2 == 5) {
                cc1[] cc1VarArr = (cc1[]) ac1Var.m190g(byteOrder);
                if (cc1VarArr == null || cc1VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(cc1VarArr));
                    return;
                }
                ac1VarM186c = ac1.m185b(cc1VarArr[0], this.f17994f);
                ac1VarM186c2 = ac1.m185b(cc1VarArr[1], this.f17994f);
            } else {
                int[] iArr = (int[]) ac1Var.m190g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                ac1VarM186c = ac1.m186c(iArr[0], this.f17994f);
                ac1VarM186c2 = ac1.m186c(iArr[1], this.f17994f);
            }
            mapArr[i].put("ImageWidth", ac1VarM186c);
            mapArr[i].put("ImageLength", ac1VarM186c2);
            return;
        }
        if (ac1Var2 != null && ac1Var3 != null && ac1Var4 != null && ac1Var5 != null) {
            int iM188e = ac1Var2.m188e(this.f17994f);
            int iM188e2 = ac1Var4.m188e(this.f17994f);
            int iM188e3 = ac1Var5.m188e(this.f17994f);
            int iM188e4 = ac1Var3.m188e(this.f17994f);
            if (iM188e2 <= iM188e || iM188e3 <= iM188e4) {
                return;
            }
            ac1 ac1VarM186c3 = ac1.m186c(iM188e2 - iM188e, this.f17994f);
            ac1 ac1VarM186c4 = ac1.m186c(iM188e3 - iM188e4, this.f17994f);
            mapArr[i].put("ImageLength", ac1VarM186c3);
            mapArr[i].put("ImageWidth", ac1VarM186c4);
            return;
        }
        ac1 ac1Var6 = (ac1) mapArr[i].get("ImageLength");
        ac1 ac1Var7 = (ac1) mapArr[i].get("ImageWidth");
        if (ac1Var6 == null || ac1Var7 == null) {
            ac1 ac1Var8 = (ac1) mapArr[i].get("JPEGInterchangeFormat");
            ac1 ac1Var9 = (ac1) mapArr[i].get("JPEGInterchangeFormatLength");
            if (ac1Var8 == null || ac1Var9 == null) {
                return;
            }
            int iM188e5 = ac1Var8.m188e(this.f17994f);
            int iM188e6 = ac1Var8.m188e(this.f17994f);
            dc1Var.m4429b(iM188e5);
            byte[] bArr = new byte[iM188e6];
            dc1Var.readFully(bArr);
            m5061e(new zb1(bArr), iM188e5, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5079x() throws Throwable {
        m5077v(0, 5);
        m5077v(0, 4);
        m5077v(5, 4);
        HashMap[] mapArr = this.f17992d;
        ac1 ac1Var = (ac1) mapArr[1].get("PixelXDimension");
        ac1 ac1Var2 = (ac1) mapArr[1].get("PixelYDimension");
        if (ac1Var != null && ac1Var2 != null) {
            mapArr[0].put("ImageWidth", ac1Var);
            mapArr[0].put("ImageLength", ac1Var2);
        }
        if (mapArr[4].isEmpty() && m5070n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m5070n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m5075t("ThumbnailOrientation", 0, "Orientation");
        m5075t("ThumbnailImageLength", 0, "ImageLength");
        m5075t("ThumbnailImageWidth", 0, "ImageWidth");
        m5075t("ThumbnailOrientation", 5, "Orientation");
        m5075t("ThumbnailImageLength", 5, "ImageLength");
        m5075t("ThumbnailImageWidth", 5, "ImageWidth");
        m5075t("Orientation", 4, "ThumbnailOrientation");
        m5075t("ImageLength", 4, "ThumbnailImageLength");
        m5075t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
