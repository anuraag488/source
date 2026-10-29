package p000;

import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.pt0;
import ads_mobile_sdk.ys0;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.Uri;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.chromium.net.DnsStatus;

/* JADX INFO: renamed from: y5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1356y5 implements as2 {

    /* JADX INFO: renamed from: a */
    public static final wm0[] f34878a = new wm0[0];

    /* JADX INFO: renamed from: b */
    public static final pg0 f34879b = new pg0(1230036130, false, new qg0(22));

    /* JADX INFO: renamed from: c */
    public static final pg0 f34880c = new pg0(-1887668098, false, new fh0(15));

    /* JADX INFO: renamed from: d */
    public static final pg0 f34881d = new pg0(770529379, false, new ah0(28));

    /* JADX INFO: renamed from: e */
    public static final pg0 f34882e = new pg0(-1313497533, false, new ah0(29));

    /* JADX INFO: renamed from: f */
    public static final pg0 f34883f = new pg0(1106156659, false, new jh0(0));

    /* JADX INFO: renamed from: g */
    public static final pg0 f34884g = new pg0(-681713163, false, new jh0(1));

    /* JADX INFO: renamed from: h */
    public static final pg0 f34885h = new pg0(-1415906600, false, new jh0(2));

    /* JADX INFO: renamed from: i */
    public static final double[][] f34886i = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: j */
    public static final double[][] f34887j = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: k */
    public static final double[] f34888k = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: l */
    public static final double[] f34889l = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    /* JADX INFO: renamed from: m */
    public static final StackTraceElement[] f34890m = new StackTraceElement[0];

    /* JADX INFO: renamed from: n */
    public static final z45 f34891n = new z45(24);

    /* JADX INFO: renamed from: o */
    public static Boolean f34892o = null;

    /* JADX INFO: renamed from: p */
    public static final int f34893p = 9;

    /* JADX INFO: renamed from: q */
    public static final int f34894q = 10;

    /* JADX INFO: renamed from: r */
    public static final int f34895r = 12;

    /* JADX INFO: renamed from: A */
    public static double m12892A(double[] dArr) {
        double[] dArrM4683L = dt0.m4683L(dArr, f34886i);
        double dM12924r = m12924r(dArrM4683L[0]);
        double dM12924r2 = m12924r(dArrM4683L[1]);
        double dM12924r3 = m12924r(dArrM4683L[2]);
        return Math.atan2(d55.m4361f(dM12924r3, 2.0d, dM12924r + dM12924r2, 9.0d), ((((-12.0d) * dM12924r2) + (dM12924r * 11.0d)) + dM12924r3) / 11.0d);
    }

    /* JADX INFO: renamed from: B */
    public static double m12893B(double d) {
        int i;
        double dAbs = Math.abs(d);
        double dMax = Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs));
        if (d < 0.0d) {
            i = -1;
        } else {
            i = d == 0.0d ? 0 : 1;
        }
        return Math.pow(dMax, 2.380952380952381d) * ((double) i);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m12894C(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m12895D(lc3 lc3Var, long j, long j2) {
        int i = lc3Var.f23943i == 1 ? 1 : 0;
        long j3 = lc3Var.f23937c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: E */
    public static ro0 m12896E(po0 po0Var, qo0 qo0Var) {
        return z62.m13387o(po0Var.getKey(), qo0Var) ? r71.f29063a : po0Var;
    }

    /* JADX INFO: renamed from: F */
    public static final void m12897F(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            q32.m9719a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            System.arraycopy(fArr4[i9], 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr8 = fArr5[i10];
                float fM12926t = m12926t(fArr7, fArr8);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr8[i11] * fM12926t);
                }
            }
            float fSqrt = (float) Math.sqrt(m12926t(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr9 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr9[i13] = i13 < i9 ? 0.0f : m12926t(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM12926t2 = m12926t(fArr5[i14], fArr2);
            float[] fArr10 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM12926t2 -= fArr10[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM12926t2 / fArr10[i14];
        }
    }

    /* JADX INFO: renamed from: G */
    public static final long m12898G(lc3 lc3Var, boolean z) {
        long jM3429g = b33.m3429g(lc3Var.f23937c, lc3Var.f23941g);
        if (z || !lc3Var.m7954c()) {
            return jM3429g;
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0302  */
    /* JADX WARN: Code duplicated, block: B:106:0x030e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0312  */
    /* JADX WARN: Code duplicated, block: B:110:0x0329  */
    /* JADX WARN: Code duplicated, block: B:118:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x0209  */
    /* JADX WARN: Code duplicated, block: B:59:0x0217  */
    /* JADX WARN: Code duplicated, block: B:60:0x021a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0220  */
    /* JADX WARN: Code duplicated, block: B:65:0x0224  */
    /* JADX WARN: Code duplicated, block: B:67:0x0229  */
    /* JADX WARN: Code duplicated, block: B:69:0x0239  */
    /* JADX WARN: Code duplicated, block: B:70:0x0245  */
    /* JADX WARN: Code duplicated, block: B:71:0x0251  */
    /* JADX WARN: Code duplicated, block: B:73:0x0256  */
    /* JADX WARN: Code duplicated, block: B:75:0x026c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0275  */
    /* JADX WARN: Code duplicated, block: B:77:0x027e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0290  */
    /* JADX WARN: Code duplicated, block: B:80:0x0299  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b3 A[PHI: r0 r1 r6 r10 r12
  0x02b3: PHI (r0v32 double[]) = (r0v20 double[]), (r0v20 double[]), (r0v36 double[]) binds: [B:82:0x02a5, B:90:0x02c3, B:86:0x02ae] A[DONT_GENERATE, DONT_INLINE]
  0x02b3: PHI (r1v10 double[]) = (r1v1 double[]), (r1v1 double[]), (r1v14 double[]) binds: [B:82:0x02a5, B:90:0x02c3, B:86:0x02ae] A[DONT_GENERATE, DONT_INLINE]
  0x02b3: PHI (r6v13 boolean) = (r6v8 boolean), (r6v8 boolean), (r6v15 boolean) binds: [B:82:0x02a5, B:90:0x02c3, B:86:0x02ae] A[DONT_GENERATE, DONT_INLINE]
  0x02b3: PHI (r10v15 double) = (r10v6 double), (r10v6 double), (r10v20 double) binds: [B:82:0x02a5, B:90:0x02c3, B:86:0x02ae] A[DONT_GENERATE, DONT_INLINE]
  0x02b3: PHI (r12v11 double) = (r12v5 double), (r12v5 double), (r12v15 double) binds: [B:82:0x02a5, B:90:0x02c3, B:86:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:96:0x02db  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e1  */
    /* JADX INFO: renamed from: H */
    public static int m12899H(double d, double d2, double d3) {
        double d4;
        int i;
        int iM10666g;
        double[] dArr;
        double d5;
        double[] dArr2;
        double d6;
        double d7;
        boolean z;
        int i2;
        int i3;
        double d8;
        double[] dArr3;
        double dM12892A;
        double[] dArr4;
        int i4;
        double d9;
        double d10;
        int iCeil;
        double dFloor;
        int i5;
        int i6;
        int iFloor;
        double[] dArr5;
        double dM12892A2;
        boolean zM12916j;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double dM4361f;
        double[] dArr6;
        double dM4361f2;
        double d19;
        double d20;
        double dM12892A3;
        double d21;
        double d22;
        double d23;
        double d24;
        double dM4361f3;
        double d25 = d % 360.0d;
        if (d25 < 0.0d) {
            d25 += 360.0d;
        }
        if (d2 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
            int iM10684y = sc6.m10684y(sc6.m10664e0(d3));
            return sc6.m10666g(iM10684y, iM10684y, iM10684y);
        }
        double d26 = (d25 / 180.0d) * 3.141592653589793d;
        double d27 = (d3 + 16.0d) / 116.0d;
        double d28 = d27 * d27 * d27;
        if (d28 <= 0.008856451679035631d) {
            d28 = ((116.0d * d27) - 16.0d) / 903.2962962962963d;
        }
        double d29 = d28 * 100.0d;
        double dSqrt = Math.sqrt(d29) * 11.0d;
        sy4 sy4Var = sy4.f30661k;
        double d30 = 100.0d;
        double d31 = 1.0d;
        double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, sy4Var.f30662a), 0.73d);
        double dCos = (Math.cos(d26 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * sy4Var.f30667f * sy4Var.f30665d;
        double dSin = Math.sin(d26);
        double dCos2 = Math.cos(d26);
        int i7 = 0;
        while (true) {
            double d32 = d31;
            double[] dArr7 = f34888k;
            double d33 = d30;
            if (i7 < 5) {
                i = 1;
                double d34 = dSqrt / d33;
                d4 = d29;
                double dPow2 = Math.pow(((d2 == 0.0d || dSqrt == 0.0d) ? 0.0d : d2 / Math.sqrt(d34)) * dPow, 1.1111111111111112d);
                double d35 = dPow;
                sy4 sy4Var2 = sy4Var;
                double dPow3 = (Math.pow(d34, (d32 / sy4Var.f30666e) / sy4Var.f30671j) * sy4Var.f30663b) / sy4Var2.f30664c;
                double d36 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((dPow2 * 108.0d) * dSin) + (((11.0d * dPow2) * dCos2) + (23.0d * dCos)));
                double d37 = d36 * dCos2;
                double d38 = d36 * dSin;
                double d39 = dPow3 * 460.0d;
                double[] dArrM4683L = dt0.m4683L(new double[]{m12893B(((288.0d * d38) + ((451.0d * d37) + d39)) / 1403.0d), m12893B(d55.m4361f(d38, 261.0d, d39 - (891.0d * d37), 1403.0d)), m12893B(d55.m4361f(d38, 6300.0d, d39 - (d37 * 220.0d), 1403.0d))}, f34887j);
                double d40 = dArrM4683L[0];
                if (d40 >= 0.0d) {
                    double d41 = dArrM4683L[1];
                    if (d41 >= 0.0d) {
                        double d42 = dArrM4683L[2];
                        if (d42 >= 0.0d) {
                            double d43 = (dArr7[2] * d42) + (dArr7[1] * d41) + (dArr7[0] * d40);
                            if (d43 > 0.0d) {
                                if (i7 != 4) {
                                    double d44 = d43 - d4;
                                    if (Math.abs(d44) >= 0.002d) {
                                        dSqrt -= (d44 * dSqrt) / (d43 * 2.0d);
                                        i7++;
                                        d31 = d32;
                                        sy4Var = sy4Var2;
                                        d30 = d33;
                                        d29 = d4;
                                        dPow = d35;
                                    }
                                }
                                double d45 = dArrM4683L[0];
                                if (d45 <= 100.01d && dArrM4683L[1] <= 100.01d && dArrM4683L[2] <= 100.01d) {
                                    iM10666g = sc6.m10666g(sc6.m10684y(d45), sc6.m10684y(dArrM4683L[1]), sc6.m10684y(dArrM4683L[2]));
                                }
                                if (iM10666g != 0) {
                                    return iM10666g;
                                }
                                dArr = new double[3];
                                d5 = -1.0d;
                                dArr[0] = -1.0d;
                                dArr[i] = -1.0d;
                                dArr[2] = -1.0d;
                                dArr2 = dArr;
                                d6 = 0.0d;
                                d7 = 0.0d;
                                z = false;
                                i2 = 0;
                                i3 = i;
                                while (i2 < 12) {
                                    d12 = dArr7[0];
                                    d13 = dArr7[i];
                                    d14 = dArr7[2];
                                    d15 = d5;
                                    if (i2 % 4 <= i) {
                                        d16 = 0.0d;
                                    } else {
                                        d16 = d33;
                                    }
                                    if (i2 % 2 == 0) {
                                        d17 = 0.0d;
                                    } else {
                                        d17 = d33;
                                    }
                                    if (i2 < 4) {
                                        dM4361f3 = d55.m4361f(d17, d14, d4 - (d13 * d16), d12);
                                        if (m12894C(dM4361f3)) {
                                            dArr6 = new double[]{dM4361f3, d16, d17};
                                        } else {
                                            dArr6 = new double[]{d15, d15, d15};
                                        }
                                    } else if (i2 < 8) {
                                        dM4361f2 = d55.m4361f(d16, d14, d4 - (d17 * d12), d13);
                                        d19 = d16;
                                        if (m12894C(dM4361f2)) {
                                            dArr6 = new double[]{d17, dM4361f2, d19};
                                        } else {
                                            dArr6 = new double[]{d15, d15, d15};
                                        }
                                    } else {
                                        d18 = d16;
                                        dM4361f = d55.m4361f(d17, d13, d4 - (d18 * d12), d14);
                                        if (m12894C(dM4361f)) {
                                            dArr6 = new double[]{d18, d17, dM4361f};
                                        } else {
                                            dArr6 = new double[]{d15, d15, d15};
                                        }
                                    }
                                    if (dArr6[0] < 0.0d) {
                                        d20 = d26;
                                    } else {
                                        dM12892A3 = m12892A(dArr6);
                                        if (!z) {
                                            d6 = dM12892A3;
                                            d7 = d6;
                                            dArr = dArr6;
                                            dArr2 = dArr;
                                            z = true;
                                        } else if (i3 == 0 || m12916j(d6, dM12892A3, d7)) {
                                            d22 = d26;
                                            d23 = d6;
                                            d6 = d23;
                                            d20 = d22;
                                            d24 = d21;
                                            if (m12916j(d23, d22, d21)) {
                                                dArr2 = dArr6;
                                                d7 = d24;
                                            } else {
                                                dArr = dArr6;
                                                d6 = d24;
                                            }
                                            i3 = 0;
                                        }
                                        d20 = d26;
                                    }
                                    i2++;
                                    d26 = d20;
                                    d5 = d15;
                                    i = 1;
                                }
                                d8 = d26;
                                double[][] dArr8 = {dArr, dArr2};
                                dArr3 = dArr8[0];
                                dM12892A = m12892A(dArr3);
                                dArr4 = dArr8[1];
                                i4 = 0;
                                while (i4 < 3) {
                                    d9 = dArr3[i4];
                                    d10 = dArr4[i4];
                                    if (d9 != d10) {
                                        if (d9 < d10) {
                                            iCeil = (int) Math.floor(m12904M(d9) - 0.5d);
                                            dFloor = Math.ceil(m12904M(dArr4[i4]) - 0.5d);
                                        } else {
                                            iCeil = (int) Math.ceil(m12904M(d9) - 0.5d);
                                            dFloor = Math.floor(m12904M(dArr4[i4]) - 0.5d);
                                        }
                                        i5 = (int) dFloor;
                                        i6 = 0;
                                        while (i6 < 8 && Math.abs(i5 - iCeil) > 1) {
                                            iFloor = (int) Math.floor(((double) (iCeil + i5)) / 2.0d);
                                            double d46 = f34889l[iFloor];
                                            double d47 = dArr3[i4];
                                            double d48 = (d46 - d47) / (dArr4[i4] - d47);
                                            double d49 = dArr3[0];
                                            double d50 = ((dArr4[0] - d49) * d48) + d49;
                                            double d51 = dArr3[1];
                                            double d52 = ((dArr4[1] - d51) * d48) + d51;
                                            double d53 = dArr3[2];
                                            dArr5 = new double[]{d50, d52, ((dArr4[2] - d53) * d48) + d53};
                                            dM12892A2 = m12892A(dArr5);
                                            double d54 = d8;
                                            double d55 = dM12892A;
                                            zM12916j = m12916j(d55, d54, dM12892A2);
                                            d11 = d55;
                                            if (zM12916j) {
                                                i5 = iFloor;
                                                dArr4 = dArr5;
                                            } else {
                                                iCeil = iFloor;
                                                dArr3 = dArr5;
                                                d11 = dM12892A2;
                                            }
                                            i6++;
                                            d8 = d54;
                                            dM12892A = d11;
                                        }
                                    }
                                    i4++;
                                    d8 = d8;
                                    dM12892A = dM12892A;
                                }
                                double[] dArr9 = {(dArr3[0] + dArr4[0]) / 2.0d, (dArr3[1] + dArr4[1]) / 2.0d, (dArr3[2] + dArr4[2]) / 2.0d};
                                return sc6.m10666g(sc6.m10684y(dArr9[0]), sc6.m10684y(dArr9[1]), sc6.m10684y(dArr9[2]));
                            }
                        }
                    }
                }
            } else {
                d4 = d29;
                i = 1;
            }
            iM10666g = 0;
            if (iM10666g != 0) {
                return iM10666g;
            }
            dArr = new double[3];
            d5 = -1.0d;
            dArr[0] = -1.0d;
            dArr[i] = -1.0d;
            dArr[2] = -1.0d;
            dArr2 = dArr;
            d6 = 0.0d;
            d7 = 0.0d;
            z = false;
            i2 = 0;
            i3 = i;
            while (i2 < 12) {
                d12 = dArr7[0];
                d13 = dArr7[i];
                d14 = dArr7[2];
                d15 = d5;
                if (i2 % 4 <= i) {
                    d16 = 0.0d;
                } else {
                    d16 = d33;
                }
                if (i2 % 2 == 0) {
                    d17 = 0.0d;
                } else {
                    d17 = d33;
                }
                if (i2 < 4) {
                    dM4361f3 = d55.m4361f(d17, d14, d4 - (d13 * d16), d12);
                    if (m12894C(dM4361f3)) {
                        dArr6 = new double[]{dM4361f3, d16, d17};
                    } else {
                        dArr6 = new double[]{d15, d15, d15};
                    }
                } else if (i2 < 8) {
                    dM4361f2 = d55.m4361f(d16, d14, d4 - (d17 * d12), d13);
                    d19 = d16;
                    if (m12894C(dM4361f2)) {
                        dArr6 = new double[]{d17, dM4361f2, d19};
                    } else {
                        dArr6 = new double[]{d15, d15, d15};
                    }
                } else {
                    d18 = d16;
                    dM4361f = d55.m4361f(d17, d13, d4 - (d18 * d12), d14);
                    if (m12894C(dM4361f)) {
                        dArr6 = new double[]{d18, d17, dM4361f};
                    } else {
                        dArr6 = new double[]{d15, d15, d15};
                    }
                }
                if (dArr6[0] < 0.0d) {
                    d20 = d26;
                } else {
                    dM12892A3 = m12892A(dArr6);
                    if (!z) {
                        d6 = dM12892A3;
                        d7 = d6;
                        dArr = dArr6;
                        dArr2 = dArr;
                        z = true;
                    } else {
                        d21 = i3 == 0 ? dM12892A3 : dM12892A3;
                        d22 = d26;
                        d23 = d6;
                        d6 = d23;
                        d20 = d22;
                        d24 = d21;
                        if (m12916j(d23, d22, d21)) {
                            dArr2 = dArr6;
                            d7 = d24;
                        } else {
                            dArr = dArr6;
                            d6 = d24;
                        }
                        i3 = 0;
                    }
                    d20 = d26;
                }
                i2++;
                d26 = d20;
                d5 = d15;
                i = 1;
            }
            d8 = d26;
            double[][] dArr10 = {dArr, dArr2};
            dArr3 = dArr10[0];
            dM12892A = m12892A(dArr3);
            dArr4 = dArr10[1];
            i4 = 0;
            while (i4 < 3) {
                d9 = dArr3[i4];
                d10 = dArr4[i4];
                if (d9 != d10) {
                    if (d9 < d10) {
                        iCeil = (int) Math.floor(m12904M(d9) - 0.5d);
                        dFloor = Math.ceil(m12904M(dArr4[i4]) - 0.5d);
                    } else {
                        iCeil = (int) Math.ceil(m12904M(d9) - 0.5d);
                        dFloor = Math.floor(m12904M(dArr4[i4]) - 0.5d);
                    }
                    i5 = (int) dFloor;
                    i6 = 0;
                    while (i6 < 8) {
                        iFloor = (int) Math.floor(((double) (iCeil + i5)) / 2.0d);
                        double d410 = f34889l[iFloor];
                        double d411 = dArr3[i4];
                        double d412 = (d410 - d411) / (dArr4[i4] - d411);
                        double d413 = dArr3[0];
                        double d56 = ((dArr4[0] - d413) * d412) + d413;
                        double d57 = dArr3[1];
                        double d58 = ((dArr4[1] - d57) * d412) + d57;
                        double d59 = dArr3[2];
                        dArr5 = new double[]{d56, d58, ((dArr4[2] - d59) * d412) + d59};
                        dM12892A2 = m12892A(dArr5);
                        double d510 = d8;
                        double d511 = dM12892A;
                        zM12916j = m12916j(d511, d510, dM12892A2);
                        d11 = d511;
                        if (zM12916j) {
                            i5 = iFloor;
                            dArr4 = dArr5;
                        } else {
                            iCeil = iFloor;
                            dArr3 = dArr5;
                            d11 = dM12892A2;
                        }
                        i6++;
                        d8 = d510;
                        dM12892A = d11;
                    }
                }
                i4++;
                d8 = d8;
                dM12892A = dM12892A;
            }
            double[] dArr11 = {(dArr3[0] + dArr4[0]) / 2.0d, (dArr3[1] + dArr4[1]) / 2.0d, (dArr3[2] + dArr4[2]) / 2.0d};
            return sc6.m10666g(sc6.m10684y(dArr11[0]), sc6.m10684y(dArr11[1]), sc6.m10684y(dArr11[2]));
        }
    }

    /* JADX INFO: renamed from: I */
    public static final nt2 m12900I(nt2 nt2Var, yg3 yg3Var, ik4 ik4Var, jk4 jk4Var, eo0 eo0Var) {
        rj4 rj4Var = new rj4();
        rj4Var.f29358a = yg3Var;
        rj4Var.f29359b = ik4Var;
        rj4Var.f29360c = jk4Var;
        rj4Var.f29361d = eo0Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(rj4Var);
    }

    /* JADX INFO: renamed from: J */
    public static final List m12901J(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(hb0.m6299K0(arrayList));
        }
        return v71.f32439a;
    }

    /* JADX INFO: renamed from: K */
    public static final Map m12902K(Map map) {
        int size = map.size();
        if (size == 0) {
            return w71.f33134a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) hb0.m6298J0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: L */
    public static z32 m12903L(Object obj) {
        z32 z32Var = new z32((byte) 23);
        z32Var.f35739c = obj;
        z32Var.f35738b = new ArrayList();
        VarHandle.storeStoreFence();
        return z32Var;
    }

    /* JADX INFO: renamed from: M */
    public static double m12904M(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX INFO: renamed from: N */
    public static final Exception m12905N(String str, FileNotFoundException fileNotFoundException) throws IllegalAccessException, InvocationTargetException {
        int i;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            try {
                Parcel parcelObtain = Parcel.obtain();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            zEquals = ((String) method.invoke(null, "sys.user." + i + ".ce_available", "false")).equals("true");
        } catch (Throwable th) {
            se0.m10720f(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            qz0 qz0Var = new qz0(fileNotFoundException);
            qz0Var.f28898a = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
            VarHandle.storeStoreFence();
            return qz0Var;
        } finally {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: O */
    public static DnsStatus m12906O(Network network) {
        ConnectivityManager connectivityManager;
        Boolean boolValueOf = f34892o;
        if (boolValueOf == null) {
            boolean z = false;
            try {
                if (x06.f33904a.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                    z = true;
                }
            } catch (RuntimeException unused) {
            }
            boolValueOf = Boolean.valueOf(z);
            f34892o = boolValueOf;
        }
        if (!boolValueOf.booleanValue() || (connectivityManager = (ConnectivityManager) x06.f33904a.getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties != null) {
                return new DnsStatus(linkProperties.getDnsServers(), linkProperties.isPrivateDnsActive(), linkProperties.getPrivateDnsServerName(), linkProperties.getDomains());
            }
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final cf0 m12907a(Object obj) {
        cf0 cf0Var = new cf0();
        cf0Var.m4989U(obj);
        return cf0Var;
    }

    /* JADX INFO: renamed from: b */
    public static final m32 m12908b(String str, jc2 jc2Var) {
        n32 n32Var = new n32();
        n32Var.f25419a = jc2Var;
        VarHandle.storeStoreFence();
        m32 m32Var = new m32(str, n32Var, 1);
        m32Var.f24618l = true;
        VarHandle.storeStoreFence();
        return m32Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m12909c(nt2 nt2Var, xh3 xh3Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        pg0 pg0Var2 = sj3.f30331a;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-714464401);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(xh3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(pg0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                d83 d83Var = new d83(null, o85.f26450j);
                ir1Var.m6905n0(d83Var);
                objM6869O = d83Var;
            }
            C0705gy c0705gyM12918l = m12918l(pg0Var2, ir1Var, (i2 >> 6) & 14);
            zh3 zh3VarMo7523a = xh3Var.mo7523a(c0705gyM12918l);
            C0613ei c0613ei = new C0613ei(b2);
            c0613ei.f18112b = nt2Var;
            c0613ei.f18113c = (sw2) objM6869O;
            c0613ei.f18114d = pg0Var;
            c0613ei.f18115e = c0705gyM12918l;
            VarHandle.storeStoreFence();
            as4.m3244c(zh3VarMo7523a, vd6.m11834R(274270255, c0613ei, ir1Var), ir1Var, 56);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf(b);
            c1403zf.f36036c = nt2Var;
            c1403zf.f36037d = xh3Var;
            c1403zf.f36038e = pg0Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:102:0x0135  */
    /* JADX WARN: Code duplicated, block: B:103:0x0138  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0169  */
    /* JADX WARN: Code duplicated, block: B:113:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0182  */
    /* JADX WARN: Code duplicated, block: B:121:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x019a  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:137:0x022b  */
    /* JADX WARN: Code duplicated, block: B:140:0x023b  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m12910d(nt2 nt2Var, mq1 mq1Var, mq1 mq1Var2, mq1 mq1Var3, pg0 pg0Var, int i, long j, long j2, a05 a05Var, pg0 pg0Var2, mi0 mi0Var, int i2, int i3) {
        nt2 nt2Var2;
        int i4;
        mq1 mq1Var4;
        int i5;
        mq1 mq1Var5;
        int i6;
        int i7;
        int i8;
        a05 a05Var2;
        boolean z;
        mq1 mq1Var6;
        long j3;
        a05 a05Var3;
        long j4;
        byte b;
        yk3 yk3VarM6916v;
        nt2 nt2Var3;
        mq1 mq1Var7;
        mq1 mq1Var8;
        pg0 pg0Var3;
        int i9;
        long j5;
        long jM6742b;
        int i10;
        mq1 mq1Var9;
        a05 a05VarM12932z;
        nt2 nt2Var4;
        mq1 mq1Var10;
        mq1 mq1Var11;
        byte b2;
        boolean z2;
        Object obj;
        ww2 ww2Var;
        boolean zM6890g;
        Object obj2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1211482744);
        int i17 = i3 & 1;
        if (i17 != 0) {
            i4 = i2 | 6;
            nt2Var2 = nt2Var;
        } else if ((i2 & 6) == 0) {
            nt2Var2 = nt2Var;
            i4 = (ir1Var.m6890g(nt2Var2) ? 4 : 2) | i2;
        } else {
            nt2Var2 = nt2Var;
            i4 = i2;
        }
        int i18 = i3 & 2;
        if (i18 == 0) {
            if ((i2 & 48) == 0) {
                mq1Var4 = mq1Var;
                i4 |= ir1Var.m6894i(mq1Var4) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    mq1Var5 = mq1Var2;
                    if (ir1Var.m6894i(mq1Var5)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 3072;
                if ((i2 & 24576) == 0) {
                    if (ir1Var.m6894i(pg0Var)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i7 |= i16;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        i15 = i;
                        if (ir1Var.m6886e(i15)) {
                            i12 = i15;
                            i13 = 131072;
                            i14 = i15;
                        }
                        i7 |= i13;
                        i8 = i14;
                    } else {
                        i12 = i;
                    }
                    i12 = i15;
                    i13 = 65536;
                    i14 = i12;
                    i7 |= i13;
                    i8 = i14;
                } else {
                    i8 = i;
                }
                if ((1572864 & i2) == 0) {
                    i7 |= 524288;
                }
                if ((12582912 & i2) == 0) {
                    i7 |= 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        a05Var2 = a05Var;
                        int i19 = ir1Var.m6890g(a05Var2) ? 67108864 : 33554432;
                        i7 |= i19;
                    } else {
                        a05Var2 = a05Var;
                    }
                    i7 |= i19;
                } else {
                    a05Var2 = a05Var;
                }
                if ((i2 & 805306368) == 0) {
                    if (ir1Var.m6894i(pg0Var2)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i7 |= i11;
                }
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (ir1Var.m6871T(i7 & 1, z)) {
                    ir1Var.m6876Y();
                    if ((i2 & 1) != 0 || ir1Var.m6856B()) {
                        if (i17 != 0) {
                            nt2Var3 = kt2.f23428a;
                        } else {
                            nt2Var3 = nt2Var2;
                        }
                        if (i18 != 0) {
                            mq1Var7 = gq6.f20043h;
                        } else {
                            mq1Var7 = mq1Var4;
                        }
                        if (i5 != 0) {
                            mq1Var8 = gq6.f20044i;
                        } else {
                            mq1Var8 = mq1Var5;
                        }
                        pg0Var3 = gq6.f20045j;
                        i9 = i8;
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                            i9 = 2;
                        }
                        j5 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a.f16957n;
                        jM6742b = ic0.m6742b(j5, ir1Var);
                        i10 = i7 & (-33030145);
                        if ((i3 & 256) != 0) {
                            nt2Var4 = nt2Var3;
                            mq1Var10 = mq1Var7;
                            i10 = i7 & (-267911169);
                            mq1Var11 = mq1Var8;
                            mq1Var9 = pg0Var3;
                            b2 = i9;
                            a05VarM12932z = m12932z(ir1Var);
                        } else {
                            mq1Var9 = pg0Var3;
                            a05VarM12932z = a05Var2;
                            nt2Var4 = nt2Var3;
                            mq1Var10 = mq1Var7;
                            mq1Var11 = mq1Var8;
                            b2 = i9;
                        }
                    } else {
                        ir1Var.m6874W();
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                        }
                        int i20 = i7 & (-33030145);
                        if ((i3 & 256) != 0) {
                            i20 = i7 & (-267911169);
                        }
                        mq1Var9 = mq1Var3;
                        jM6742b = j2;
                        i10 = i20;
                        mq1Var10 = mq1Var4;
                        b2 = i8;
                        a05VarM12932z = a05Var2;
                        nt2Var4 = nt2Var2;
                        mq1Var11 = mq1Var5;
                        j5 = j;
                    }
                    ir1Var.m6913s();
                    int i21 = (i10 & 234881024) ^ 100663296;
                    boolean z3 = (i21 <= 67108864 && ir1Var.m6890g(a05VarM12932z)) || (i10 & 100663296) == 67108864;
                    Object objM6869O = ir1Var.m6869O();
                    z2 = z3;
                    i50 i50Var = ki0.f23136a;
                    if (!z2 || objM6869O == i50Var) {
                        ww2 ww2Var2 = new ww2();
                        ww2Var2.f33799a = k43.m7398w(a05VarM12932z);
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(ww2Var2);
                        obj = ww2Var2;
                    } else {
                        obj = objM6869O;
                    }
                    ww2Var = (ww2) obj;
                    zM6890g = ir1Var.m6890g(ww2Var) | ((i21 <= 67108864 && ir1Var.m6890g(a05VarM12932z)) || (i10 & 100663296) == 67108864);
                    Object objM6869O2 = ir1Var.m6869O();
                    obj2 = objM6869O2;
                    if (zM6890g || objM6869O2 == i50Var) {
                        na1 na1Var = new na1((byte) 26);
                        na1Var.f25595b = ww2Var;
                        na1Var.f25596c = a05VarM12932z;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(na1Var);
                        obj2 = na1Var;
                    }
                    nt2 nt2VarM12874w0 = y42.m12874w0(nt2Var4, (yp1) obj2);
                    ug2 ug2Var = new ug2((byte) 1);
                    ug2Var.f31851b = b2;
                    ug2Var.f31852c = mq1Var10;
                    ug2Var.f31853d = pg0Var2;
                    ug2Var.f31854e = mq1Var9;
                    ug2Var.f31855f = pg0Var;
                    ug2Var.f31856g = ww2Var;
                    ug2Var.f31857h = mq1Var11;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(848889571, ug2Var, ir1Var);
                    mq1 mq1Var12 = mq1Var10;
                    mq1 mq1Var13 = mq1Var11;
                    mq1 mq1Var14 = mq1Var9;
                    byte b3 = b2;
                    long j6 = j5;
                    long j7 = jM6742b;
                    kf4.m7511a(nt2VarM12874w0, null, j6, j7, 0.0f, pg0VarM11834R, ir1Var, 12582912, 114);
                    nt2Var2 = nt2Var4;
                    j4 = j7;
                    j3 = j6;
                    a05Var3 = a05VarM12932z;
                    mq1Var4 = mq1Var12;
                    mq1Var5 = mq1Var13;
                    mq1Var6 = mq1Var14;
                    b = b3 == true ? 1 : 0;
                } else {
                    ir1Var.m6874W();
                    mq1Var6 = mq1Var3;
                    j3 = j;
                    a05Var3 = a05Var2;
                    j4 = j2;
                    b = i8;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    lv3 lv3Var = new lv3();
                    lv3Var.f24390a = nt2Var2;
                    lv3Var.f24391b = mq1Var4;
                    lv3Var.f24392c = mq1Var5;
                    lv3Var.f24393d = mq1Var6;
                    lv3Var.f24394e = pg0Var;
                    lv3Var.f24395f = b;
                    lv3Var.f24396g = j3;
                    lv3Var.f24397h = j4;
                    lv3Var.f24398i = a05Var3;
                    lv3Var.f24399j = pg0Var2;
                    lv3Var.f24400k = i2;
                    lv3Var.f24401l = i3;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = lv3Var;
                }
            }
            i4 |= 384;
            mq1Var5 = mq1Var2;
            i7 = i4 | 3072;
            if ((i2 & 24576) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i7 |= i16;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    i15 = i;
                    if (ir1Var.m6886e(i15)) {
                        i12 = i15;
                        i13 = 131072;
                        i14 = i15;
                    }
                    i7 |= i13;
                    i8 = i14;
                } else {
                    i12 = i;
                }
                i12 = i15;
                i13 = 65536;
                i14 = i12;
                i7 |= i13;
                i8 = i14;
            } else {
                i8 = i;
            }
            if ((1572864 & i2) == 0) {
                i7 |= 524288;
            }
            if ((12582912 & i2) == 0) {
                i7 |= 4194304;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    a05Var2 = a05Var;
                    if (ir1Var.m6890g(a05Var2)) {
                    }
                    i7 |= i19;
                } else {
                    a05Var2 = a05Var;
                }
                i7 |= i19;
            } else {
                a05Var2 = a05Var;
            }
            if ((i2 & 805306368) == 0) {
                if (ir1Var.m6894i(pg0Var2)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i7 |= i11;
            }
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (ir1Var.m6871T(i7 & 1, z)) {
                ir1Var.m6876Y();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        nt2Var3 = kt2.f23428a;
                    } else {
                        nt2Var3 = nt2Var2;
                    }
                    if (i18 != 0) {
                        mq1Var7 = gq6.f20043h;
                    } else {
                        mq1Var7 = mq1Var4;
                    }
                    if (i5 != 0) {
                        mq1Var8 = gq6.f20044i;
                    } else {
                        mq1Var8 = mq1Var5;
                    }
                    pg0Var3 = gq6.f20045j;
                    i9 = i8;
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        i9 = 2;
                    }
                    j5 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a.f16957n;
                    jM6742b = ic0.m6742b(j5, ir1Var);
                    i10 = i7 & (-33030145);
                    if ((i3 & 256) != 0) {
                        nt2Var4 = nt2Var3;
                        mq1Var10 = mq1Var7;
                        i10 = i7 & (-267911169);
                        mq1Var11 = mq1Var8;
                        mq1Var9 = pg0Var3;
                        b2 = i9;
                        a05VarM12932z = m12932z(ir1Var);
                    } else {
                        mq1Var9 = pg0Var3;
                        a05VarM12932z = a05Var2;
                        nt2Var4 = nt2Var3;
                        mq1Var10 = mq1Var7;
                        mq1Var11 = mq1Var8;
                        b2 = i9;
                    }
                } else {
                    if (i17 != 0) {
                        nt2Var3 = kt2.f23428a;
                    } else {
                        nt2Var3 = nt2Var2;
                    }
                    if (i18 != 0) {
                        mq1Var7 = gq6.f20043h;
                    } else {
                        mq1Var7 = mq1Var4;
                    }
                    if (i5 != 0) {
                        mq1Var8 = gq6.f20044i;
                    } else {
                        mq1Var8 = mq1Var5;
                    }
                    pg0Var3 = gq6.f20045j;
                    i9 = i8;
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        i9 = 2;
                    }
                    j5 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a.f16957n;
                    jM6742b = ic0.m6742b(j5, ir1Var);
                    i10 = i7 & (-33030145);
                    if ((i3 & 256) != 0) {
                        nt2Var4 = nt2Var3;
                        mq1Var10 = mq1Var7;
                        i10 = i7 & (-267911169);
                        mq1Var11 = mq1Var8;
                        mq1Var9 = pg0Var3;
                        b2 = i9;
                        a05VarM12932z = m12932z(ir1Var);
                    } else {
                        mq1Var9 = pg0Var3;
                        a05VarM12932z = a05Var2;
                        nt2Var4 = nt2Var3;
                        mq1Var10 = mq1Var7;
                        mq1Var11 = mq1Var8;
                        b2 = i9;
                    }
                }
                ir1Var.m6913s();
                int i22 = (i10 & 234881024) ^ 100663296;
                if (i22 <= 67108864) {
                }
                Object objM6869O3 = ir1Var.m6869O();
                z2 = z3;
                i50 i50Var2 = ki0.f23136a;
                if (z2) {
                    ww2 ww2Var3 = new ww2();
                    ww2Var3.f33799a = k43.m7398w(a05VarM12932z);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(ww2Var3);
                    obj = ww2Var3;
                } else {
                    ww2 ww2Var4 = new ww2();
                    ww2Var4.f33799a = k43.m7398w(a05VarM12932z);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(ww2Var4);
                    obj = ww2Var4;
                }
                ww2Var = (ww2) obj;
                zM6890g = ir1Var.m6890g(ww2Var) | ((i22 <= 67108864 && ir1Var.m6890g(a05VarM12932z)) || (i10 & 100663296) == 67108864);
                Object objM6869O4 = ir1Var.m6869O();
                obj2 = objM6869O4;
                if (zM6890g) {
                    na1 na1Var2 = new na1((byte) 26);
                    na1Var2.f25595b = ww2Var;
                    na1Var2.f25596c = a05VarM12932z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(na1Var2);
                    obj2 = na1Var2;
                } else {
                    na1 na1Var3 = new na1((byte) 26);
                    na1Var3.f25595b = ww2Var;
                    na1Var3.f25596c = a05VarM12932z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(na1Var3);
                    obj2 = na1Var3;
                }
                nt2 nt2VarM12874w1 = y42.m12874w0(nt2Var4, (yp1) obj2);
                ug2 ug2Var2 = new ug2((byte) 1);
                ug2Var2.f31851b = b2;
                ug2Var2.f31852c = mq1Var10;
                ug2Var2.f31853d = pg0Var2;
                ug2Var2.f31854e = mq1Var9;
                ug2Var2.f31855f = pg0Var;
                ug2Var2.f31856g = ww2Var;
                ug2Var2.f31857h = mq1Var11;
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R2 = vd6.m11834R(848889571, ug2Var2, ir1Var);
                mq1 mq1Var15 = mq1Var10;
                mq1 mq1Var16 = mq1Var11;
                mq1 mq1Var17 = mq1Var9;
                byte b4 = b2;
                long j8 = j5;
                long j9 = jM6742b;
                kf4.m7511a(nt2VarM12874w1, null, j8, j9, 0.0f, pg0VarM11834R2, ir1Var, 12582912, 114);
                nt2Var2 = nt2Var4;
                j4 = j9;
                j3 = j8;
                a05Var3 = a05VarM12932z;
                mq1Var4 = mq1Var15;
                mq1Var5 = mq1Var16;
                mq1Var6 = mq1Var17;
                b = b4 == true ? 1 : 0;
            } else {
                ir1Var.m6874W();
                mq1Var6 = mq1Var3;
                j3 = j;
                a05Var3 = a05Var2;
                j4 = j2;
                b = i8;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                lv3 lv3Var2 = new lv3();
                lv3Var2.f24390a = nt2Var2;
                lv3Var2.f24391b = mq1Var4;
                lv3Var2.f24392c = mq1Var5;
                lv3Var2.f24393d = mq1Var6;
                lv3Var2.f24394e = pg0Var;
                lv3Var2.f24395f = b;
                lv3Var2.f24396g = j3;
                lv3Var2.f24397h = j4;
                lv3Var2.f24398i = a05Var3;
                lv3Var2.f24399j = pg0Var2;
                lv3Var2.f24400k = i2;
                lv3Var2.f24401l = i3;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = lv3Var2;
            }
        }
        i4 |= 48;
        mq1Var4 = mq1Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                mq1Var5 = mq1Var2;
                if (ir1Var.m6894i(mq1Var5)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i4 | 3072;
            if ((i2 & 24576) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i7 |= i16;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    i15 = i;
                    if (ir1Var.m6886e(i15)) {
                        i12 = i15;
                        i13 = 131072;
                        i14 = i15;
                    }
                    i7 |= i13;
                    i8 = i14;
                } else {
                    i12 = i;
                }
                i12 = i15;
                i13 = 65536;
                i14 = i12;
                i7 |= i13;
                i8 = i14;
            } else {
                i8 = i;
            }
            if ((1572864 & i2) == 0) {
                i7 |= 524288;
            }
            if ((12582912 & i2) == 0) {
                i7 |= 4194304;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    a05Var2 = a05Var;
                    if (ir1Var.m6890g(a05Var2)) {
                    }
                    i7 |= i19;
                } else {
                    a05Var2 = a05Var;
                }
                i7 |= i19;
            } else {
                a05Var2 = a05Var;
            }
            if ((i2 & 805306368) == 0) {
                if (ir1Var.m6894i(pg0Var2)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i7 |= i11;
            }
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (ir1Var.m6871T(i7 & 1, z)) {
                ir1Var.m6876Y();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        nt2Var3 = kt2.f23428a;
                    } else {
                        nt2Var3 = nt2Var2;
                    }
                    if (i18 != 0) {
                        mq1Var7 = gq6.f20043h;
                    } else {
                        mq1Var7 = mq1Var4;
                    }
                    if (i5 != 0) {
                        mq1Var8 = gq6.f20044i;
                    } else {
                        mq1Var8 = mq1Var5;
                    }
                    pg0Var3 = gq6.f20045j;
                    i9 = i8;
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        i9 = 2;
                    }
                    j5 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a.f16957n;
                    jM6742b = ic0.m6742b(j5, ir1Var);
                    i10 = i7 & (-33030145);
                    if ((i3 & 256) != 0) {
                        nt2Var4 = nt2Var3;
                        mq1Var10 = mq1Var7;
                        i10 = i7 & (-267911169);
                        mq1Var11 = mq1Var8;
                        mq1Var9 = pg0Var3;
                        b2 = i9;
                        a05VarM12932z = m12932z(ir1Var);
                    } else {
                        mq1Var9 = pg0Var3;
                        a05VarM12932z = a05Var2;
                        nt2Var4 = nt2Var3;
                        mq1Var10 = mq1Var7;
                        mq1Var11 = mq1Var8;
                        b2 = i9;
                    }
                } else {
                    if (i17 != 0) {
                        nt2Var3 = kt2.f23428a;
                    } else {
                        nt2Var3 = nt2Var2;
                    }
                    if (i18 != 0) {
                        mq1Var7 = gq6.f20043h;
                    } else {
                        mq1Var7 = mq1Var4;
                    }
                    if (i5 != 0) {
                        mq1Var8 = gq6.f20044i;
                    } else {
                        mq1Var8 = mq1Var5;
                    }
                    pg0Var3 = gq6.f20045j;
                    i9 = i8;
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        i9 = 2;
                    }
                    j5 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a.f16957n;
                    jM6742b = ic0.m6742b(j5, ir1Var);
                    i10 = i7 & (-33030145);
                    if ((i3 & 256) != 0) {
                        nt2Var4 = nt2Var3;
                        mq1Var10 = mq1Var7;
                        i10 = i7 & (-267911169);
                        mq1Var11 = mq1Var8;
                        mq1Var9 = pg0Var3;
                        b2 = i9;
                        a05VarM12932z = m12932z(ir1Var);
                    } else {
                        mq1Var9 = pg0Var3;
                        a05VarM12932z = a05Var2;
                        nt2Var4 = nt2Var3;
                        mq1Var10 = mq1Var7;
                        mq1Var11 = mq1Var8;
                        b2 = i9;
                    }
                }
                ir1Var.m6913s();
                int i23 = (i10 & 234881024) ^ 100663296;
                if (i23 <= 67108864) {
                }
                Object objM6869O5 = ir1Var.m6869O();
                z2 = z3;
                i50 i50Var3 = ki0.f23136a;
                if (z2) {
                    ww2 ww2Var5 = new ww2();
                    ww2Var5.f33799a = k43.m7398w(a05VarM12932z);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(ww2Var5);
                    obj = ww2Var5;
                } else {
                    ww2 ww2Var6 = new ww2();
                    ww2Var6.f33799a = k43.m7398w(a05VarM12932z);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(ww2Var6);
                    obj = ww2Var6;
                }
                ww2Var = (ww2) obj;
                zM6890g = ir1Var.m6890g(ww2Var) | ((i23 <= 67108864 && ir1Var.m6890g(a05VarM12932z)) || (i10 & 100663296) == 67108864);
                Object objM6869O6 = ir1Var.m6869O();
                obj2 = objM6869O6;
                if (zM6890g) {
                    na1 na1Var4 = new na1((byte) 26);
                    na1Var4.f25595b = ww2Var;
                    na1Var4.f25596c = a05VarM12932z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(na1Var4);
                    obj2 = na1Var4;
                } else {
                    na1 na1Var5 = new na1((byte) 26);
                    na1Var5.f25595b = ww2Var;
                    na1Var5.f25596c = a05VarM12932z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(na1Var5);
                    obj2 = na1Var5;
                }
                nt2 nt2VarM12874w2 = y42.m12874w0(nt2Var4, (yp1) obj2);
                ug2 ug2Var3 = new ug2((byte) 1);
                ug2Var3.f31851b = b2;
                ug2Var3.f31852c = mq1Var10;
                ug2Var3.f31853d = pg0Var2;
                ug2Var3.f31854e = mq1Var9;
                ug2Var3.f31855f = pg0Var;
                ug2Var3.f31856g = ww2Var;
                ug2Var3.f31857h = mq1Var11;
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R3 = vd6.m11834R(848889571, ug2Var3, ir1Var);
                mq1 mq1Var18 = mq1Var10;
                mq1 mq1Var19 = mq1Var11;
                mq1 mq1Var110 = mq1Var9;
                byte b5 = b2;
                long j10 = j5;
                long j11 = jM6742b;
                kf4.m7511a(nt2VarM12874w2, null, j10, j11, 0.0f, pg0VarM11834R3, ir1Var, 12582912, 114);
                nt2Var2 = nt2Var4;
                j4 = j11;
                j3 = j10;
                a05Var3 = a05VarM12932z;
                mq1Var4 = mq1Var18;
                mq1Var5 = mq1Var19;
                mq1Var6 = mq1Var110;
                b = b5 == true ? 1 : 0;
            } else {
                ir1Var.m6874W();
                mq1Var6 = mq1Var3;
                j3 = j;
                a05Var3 = a05Var2;
                j4 = j2;
                b = i8;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                lv3 lv3Var3 = new lv3();
                lv3Var3.f24390a = nt2Var2;
                lv3Var3.f24391b = mq1Var4;
                lv3Var3.f24392c = mq1Var5;
                lv3Var3.f24393d = mq1Var6;
                lv3Var3.f24394e = pg0Var;
                lv3Var3.f24395f = b;
                lv3Var3.f24396g = j3;
                lv3Var3.f24397h = j4;
                lv3Var3.f24398i = a05Var3;
                lv3Var3.f24399j = pg0Var2;
                lv3Var3.f24400k = i2;
                lv3Var3.f24401l = i3;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = lv3Var3;
            }
        }
        i4 |= 384;
        mq1Var5 = mq1Var2;
        i7 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            if (ir1Var.m6894i(pg0Var)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i7 |= i16;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                i15 = i;
                if (ir1Var.m6886e(i15)) {
                    i12 = i15;
                    i13 = 131072;
                    i14 = i15;
                }
                i7 |= i13;
                i8 = i14;
            } else {
                i12 = i;
            }
            i12 = i15;
            i13 = 65536;
            i14 = i12;
            i7 |= i13;
            i8 = i14;
        } else {
            i8 = i;
        }
        if ((1572864 & i2) == 0) {
            i7 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            i7 |= 4194304;
        }
        if ((i2 & 100663296) == 0) {
            if ((i3 & 256) == 0) {
                a05Var2 = a05Var;
                if (ir1Var.m6890g(a05Var2)) {
                }
                i7 |= i19;
            } else {
                a05Var2 = a05Var;
            }
            i7 |= i19;
        } else {
            a05Var2 = a05Var;
        }
        if ((i2 & 805306368) == 0) {
            if (ir1Var.m6894i(pg0Var2)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i7 |= i11;
        }
        if ((i7 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (ir1Var.m6871T(i7 & 1, z)) {
            ir1Var.m6876Y();
            if ((i2 & 1) != 0) {
                if (i17 != 0) {
                    nt2Var3 = kt2.f23428a;
                } else {
                    nt2Var3 = nt2Var2;
                }
                if (i18 != 0) {
                    mq1Var7 = gq6.f20043h;
                } else {
                    mq1Var7 = mq1Var4;
                }
                if (i5 != 0) {
                    mq1Var8 = gq6.f20044i;
                } else {
                    mq1Var8 = mq1Var5;
                }
                pg0Var3 = gq6.f20045j;
                i9 = i8;
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                    i9 = 2;
                }
                j5 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a.f16957n;
                jM6742b = ic0.m6742b(j5, ir1Var);
                i10 = i7 & (-33030145);
                if ((i3 & 256) != 0) {
                    nt2Var4 = nt2Var3;
                    mq1Var10 = mq1Var7;
                    i10 = i7 & (-267911169);
                    mq1Var11 = mq1Var8;
                    mq1Var9 = pg0Var3;
                    b2 = i9;
                    a05VarM12932z = m12932z(ir1Var);
                } else {
                    mq1Var9 = pg0Var3;
                    a05VarM12932z = a05Var2;
                    nt2Var4 = nt2Var3;
                    mq1Var10 = mq1Var7;
                    mq1Var11 = mq1Var8;
                    b2 = i9;
                }
            } else {
                if (i17 != 0) {
                    nt2Var3 = kt2.f23428a;
                } else {
                    nt2Var3 = nt2Var2;
                }
                if (i18 != 0) {
                    mq1Var7 = gq6.f20043h;
                } else {
                    mq1Var7 = mq1Var4;
                }
                if (i5 != 0) {
                    mq1Var8 = gq6.f20044i;
                } else {
                    mq1Var8 = mq1Var5;
                }
                pg0Var3 = gq6.f20045j;
                i9 = i8;
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                    i9 = 2;
                }
                j5 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a.f16957n;
                jM6742b = ic0.m6742b(j5, ir1Var);
                i10 = i7 & (-33030145);
                if ((i3 & 256) != 0) {
                    nt2Var4 = nt2Var3;
                    mq1Var10 = mq1Var7;
                    i10 = i7 & (-267911169);
                    mq1Var11 = mq1Var8;
                    mq1Var9 = pg0Var3;
                    b2 = i9;
                    a05VarM12932z = m12932z(ir1Var);
                } else {
                    mq1Var9 = pg0Var3;
                    a05VarM12932z = a05Var2;
                    nt2Var4 = nt2Var3;
                    mq1Var10 = mq1Var7;
                    mq1Var11 = mq1Var8;
                    b2 = i9;
                }
            }
            ir1Var.m6913s();
            int i24 = (i10 & 234881024) ^ 100663296;
            if (i24 <= 67108864) {
            }
            Object objM6869O7 = ir1Var.m6869O();
            z2 = z3;
            i50 i50Var4 = ki0.f23136a;
            if (z2) {
                ww2 ww2Var7 = new ww2();
                ww2Var7.f33799a = k43.m7398w(a05VarM12932z);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ww2Var7);
                obj = ww2Var7;
            } else {
                ww2 ww2Var8 = new ww2();
                ww2Var8.f33799a = k43.m7398w(a05VarM12932z);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ww2Var8);
                obj = ww2Var8;
            }
            ww2Var = (ww2) obj;
            zM6890g = ir1Var.m6890g(ww2Var) | ((i24 <= 67108864 && ir1Var.m6890g(a05VarM12932z)) || (i10 & 100663296) == 67108864);
            Object objM6869O8 = ir1Var.m6869O();
            obj2 = objM6869O8;
            if (zM6890g) {
                na1 na1Var6 = new na1((byte) 26);
                na1Var6.f25595b = ww2Var;
                na1Var6.f25596c = a05VarM12932z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var6);
                obj2 = na1Var6;
            } else {
                na1 na1Var7 = new na1((byte) 26);
                na1Var7.f25595b = ww2Var;
                na1Var7.f25596c = a05VarM12932z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var7);
                obj2 = na1Var7;
            }
            nt2 nt2VarM12874w3 = y42.m12874w0(nt2Var4, (yp1) obj2);
            ug2 ug2Var4 = new ug2((byte) 1);
            ug2Var4.f31851b = b2;
            ug2Var4.f31852c = mq1Var10;
            ug2Var4.f31853d = pg0Var2;
            ug2Var4.f31854e = mq1Var9;
            ug2Var4.f31855f = pg0Var;
            ug2Var4.f31856g = ww2Var;
            ug2Var4.f31857h = mq1Var11;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R4 = vd6.m11834R(848889571, ug2Var4, ir1Var);
            mq1 mq1Var111 = mq1Var10;
            mq1 mq1Var112 = mq1Var11;
            mq1 mq1Var113 = mq1Var9;
            byte b6 = b2;
            long j12 = j5;
            long j13 = jM6742b;
            kf4.m7511a(nt2VarM12874w3, null, j12, j13, 0.0f, pg0VarM11834R4, ir1Var, 12582912, 114);
            nt2Var2 = nt2Var4;
            j4 = j13;
            j3 = j12;
            a05Var3 = a05VarM12932z;
            mq1Var4 = mq1Var111;
            mq1Var5 = mq1Var112;
            mq1Var6 = mq1Var113;
            b = b6 == true ? 1 : 0;
        } else {
            ir1Var.m6874W();
            mq1Var6 = mq1Var3;
            j3 = j;
            a05Var3 = a05Var2;
            j4 = j2;
            b = i8;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            lv3 lv3Var4 = new lv3();
            lv3Var4.f24390a = nt2Var2;
            lv3Var4.f24391b = mq1Var4;
            lv3Var4.f24392c = mq1Var5;
            lv3Var4.f24393d = mq1Var6;
            lv3Var4.f24394e = pg0Var;
            lv3Var4.f24395f = b;
            lv3Var4.f24396g = j3;
            lv3Var4.f24397h = j4;
            lv3Var4.f24398i = a05Var3;
            lv3Var4.f24399j = pg0Var2;
            lv3Var4.f24400k = i2;
            lv3Var4.f24401l = i3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = lv3Var4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m12911e(int i, mq1 mq1Var, pg0 pg0Var, mq1 mq1Var2, pg0 pg0Var2, a05 a05Var, mq1 mq1Var3, mi0 mi0Var, int i2) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-280287501);
        int i3 = i2 | (ir1Var.m6886e(i) ? 4 : 2) | (ir1Var.m6894i(mq1Var) ? 32 : 16) | (ir1Var.m6894i(pg0Var) ? 256 : 128) | (ir1Var.m6894i(mq1Var2) ? 2048 : 1024) | (ir1Var.m6894i(pg0Var2) ? 16384 : 8192) | (ir1Var.m6890g(a05Var) ? 131072 : 65536) | (ir1Var.m6894i(mq1Var3) ? 1048576 : 524288);
        if (ir1Var.m6871T(i3 & 1, (599187 & i3) != 599186)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                obj = objM6869O;
                ov3 ov3Var = new ov3();
                ov3Var.f27150b = k43.m7398w(new g73(0.0f, 0.0f, 0.0f, 0.0f));
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ov3Var);
                obj = ov3Var;
            }
            obj = objM6869O;
            ov3 ov3Var2 = (ov3) obj;
            boolean z = ((i3 & 896) == 256) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (z || objM6869O2 == i50Var) {
                mv3 mv3Var = new mv3();
                mv3Var.f25236a = a05Var;
                mv3Var.f25237b = mq1Var;
                mv3Var.f25238c = mq1Var2;
                mv3Var.f25239d = pg0Var2;
                mv3Var.f25240e = i;
                mv3Var.f25241f = mq1Var3;
                mv3Var.f25242g = ov3Var2;
                mv3Var.f25243h = pg0Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(mv3Var);
                obj2 = mv3Var;
            }
            ae4.m2948a(null, (mq1) obj2, ir1Var, 0, 1);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ug2 ug2Var = new ug2((byte) 2);
            ug2Var.f31851b = i;
            ug2Var.f31852c = mq1Var;
            ug2Var.f31853d = pg0Var;
            ug2Var.f31854e = mq1Var2;
            ug2Var.f31855f = pg0Var2;
            ug2Var.f31856g = a05Var;
            ug2Var.f31857h = mq1Var3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ug2Var;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m12912f(nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1854833411);
        int i2 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2);
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = C1180tf.f31106h;
                ir1Var.m6905n0(objM6869O);
            }
            xq2 xq2Var = (xq2) objM6869O;
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2Var);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            pg0Var.invoke(ir1Var, 6);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            pe0 pe0Var = new pe0(b);
            pe0Var.f27559b = nt2Var;
            pe0Var.f27560c = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = pe0Var;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m12913g(C0213l2 c0213l2, ys0 ys0Var, long j, Integer num) {
        if (c0213l2 == null) {
            return "";
        }
        String str = c0213l2.f6637n0;
        String str2 = c0213l2.f6636n;
        byte b = ys0Var.f13836a;
        String strM13621u = str2 + "." + ((int) b) + "." + i41.m6647f(j);
        if (str.length() > 0) {
            strM13621u = zi4.m13621u(strM13621u, ".", str);
            if (num != null) {
                return strM13621u + "." + num;
            }
        }
        return strM13621u;
    }

    /* JADX INFO: renamed from: h */
    public static final URL m12914h(URL url, pt0 pt0Var, ey0 ey0Var) {
        String str = pt0Var.f8727c;
        Uri.Builder builderBuildUpon = Uri.parse(od4.m9042W(url.toString(), ey0Var != null ? ey0Var.m847T() : "%5Bgw_fbsaeid%5D", str)).buildUpon();
        builderBuildUpon.appendQueryParameter("gmp_app_id", pt0Var.f8725a);
        builderBuildUpon.appendQueryParameter("fbs_aiid", pt0Var.f8726b);
        if (builderBuildUpon.build().getQueryParameter("fbs_aeid") == null) {
            builderBuildUpon.appendQueryParameter("fbs_aeid", str);
        }
        return new URL(builderBuildUpon.build().toString());
    }

    /* JADX INFO: renamed from: i */
    public static final void m12915i(mx4 mx4Var, lc3 lc3Var) {
        dp2 dp2Var = mx4Var.f25284a;
        dp2Var.getClass();
        lx4 lx4Var = (lx4) dp2Var.f17256c;
        lx4 lx4Var2 = (lx4) dp2Var.f17255b;
        boolean zM12921o = m12921o(lc3Var);
        long j = lc3Var.f23936b;
        if (zM12921o) {
            AbstractC0990oo.m9206a0(null, lx4Var2.f24448d);
            lx4Var2.f24449e = 0;
            AbstractC0990oo.m9206a0(null, lx4Var.f24448d);
            lx4Var.f24449e = 0;
            dp2Var.f17254a = 0L;
        }
        if (!m12923q(lc3Var)) {
            List listM7953b = lc3Var.m7953b();
            int size = listM7953b.size();
            for (int i = 0; i < size; i++) {
                mw1 mw1Var = (mw1) listM7953b.get(i);
                dp2Var.m4635a(mw1Var.f25252a, b33.m3430h(mw1Var.f25256e, 0L));
            }
            dp2Var.m4635a(j, b33.m3430h(lc3Var.f23948n, 0L));
        }
        if (m12923q(lc3Var) && j - dp2Var.f17254a > 40) {
            AbstractC0990oo.m9206a0(null, lx4Var2.f24448d);
            lx4Var2.f24449e = 0;
            AbstractC0990oo.m9206a0(null, lx4Var.f24448d);
            lx4Var.f24449e = 0;
            dp2Var.f17254a = 0L;
        }
        dp2Var.f17254a = j;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m12916j(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX INFO: renamed from: k */
    public static final cr1 m12917k(cr1 cr1Var) {
        if (cr1Var == null) {
            cr1Var = null;
        }
        if (cr1Var != null) {
            return cr1Var;
        }
        qi0.m9890b("Inconsistent composition");
        xy4.m12794w();
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static final C0705gy m12918l(pg0 pg0Var, mi0 mi0Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((ir1) mi0Var).m6890g(pg0Var)) || (i & 6) == 4;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        Object obj = objM6869O;
        if (z || objM6869O == i50Var) {
            C0705gy c0705gy = new C0705gy();
            c0705gy.f20180a = pg0Var;
            c0705gy.f20181b = new dx2();
            c0705gy.f20182c = k43.m7398w(null);
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0705gy);
            obj = c0705gy;
        }
        C0705gy c0705gy2 = (C0705gy) obj;
        boolean zM6890g = ir1Var.m6890g(c0705gy2);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj2 = objM6869O2;
        if (zM6890g || objM6869O2 == i50Var) {
            C1127s c1127s = new C1127s((byte) 16);
            c1127s.f29778b = c0705gy2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c1127s);
            obj2 = c1127s;
        }
        lb5.m7923d(c0705gy2, (yp1) obj2, ir1Var);
        return c0705gy2;
    }

    /* JADX INFO: renamed from: m */
    public static final void m12919m(g25 g25Var, String str) {
        h35 h35VarM7105b;
        WorkDatabase workDatabase = g25Var.f19514c;
        u25 u25VarMo3080w = workDatabase.mo3080w();
        ry0 ry0VarMo3063f = workDatabase.mo3063f();
        ArrayList arrayListM7699b0 = kx5.m7699b0(str);
        arrayListM7699b0.addAll(gq6.m6096u(ry0VarMo3063f, str));
        ArrayList arrayList = new ArrayList();
        int size = arrayListM7699b0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM7699b0.get(i);
            i++;
            f25 f25VarM11209a = u25VarMo3080w.m11209a((String) obj);
            if (f25VarM11209a != null ? true ^ f25VarM11209a.m5459a() : false) {
                arrayList.add(obj);
            }
        }
        u25 u25VarMo3080w2 = g25Var.f19514c.mo3080w();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            WorkDatabase workDatabase2 = u25VarMo3080w2.f31629a;
            C1051py c1051py = new C1051py((byte) 15);
            c1051py.f28076b = (String) obj2;
            VarHandle.storeStoreFence();
            ((Number) as4.m3231J(workDatabase2, false, true, c1051py)).intValue();
        }
        jg3 jg3Var = g25Var.f19517f;
        synchronized (jg3Var.f22256j) {
            wn2.m12326e().m12328b(jg3.f22246k, "Processor cancelling " + str);
            jg3Var.f22254h.add(str);
            h35VarM7105b = jg3Var.m7105b(str);
        }
        jg3.m7103d(str, h35VarM7105b, 1);
        Iterator it = g25Var.f19516e.iterator();
        while (it.hasNext()) {
            ((bw3) it.next()).mo3746a(str);
        }
        g25Var.f19513b.getClass();
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m12920n(lc3 lc3Var) {
        return (lc3Var.m7954c() || lc3Var.f23942h || !lc3Var.f23938d) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m12921o(lc3 lc3Var) {
        return !lc3Var.f23942h && lc3Var.f23938d;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m12922p(lc3 lc3Var) {
        return (lc3Var.m7954c() || !lc3Var.f23942h || lc3Var.f23938d) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m12923q(lc3 lc3Var) {
        return lc3Var.f23942h && !lc3Var.f23938d;
    }

    /* JADX INFO: renamed from: r */
    public static double m12924r(double d) {
        int i;
        double dPow = Math.pow(Math.abs(d), 0.42d);
        if (d < 0.0d) {
            i = -1;
        } else {
            i = d == 0.0d ? 0 : 1;
        }
        return ((((double) i) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static long[] m12925s(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: t */
    public static final float m12926t(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m12927u(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    public static dn4 m12928v(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return dn4.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return dn4.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return dn4.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return dn4.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return dn4.SSL_3_0;
        }
        C1077qn.m9987m("Unexpected TLS version: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static po0 m12929w(po0 po0Var, qo0 qo0Var) {
        if (z62.m13387o(po0Var.getKey(), qo0Var)) {
            return po0Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static void m12930x(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            xy4.m12778e();
        }
    }

    /* JADX INFO: renamed from: y */
    public static final uo2 m12931y(uo2 uo2Var) {
        wf2 wf2VarM12295v = uo2Var.f32026u.f17625u;
        while (true) {
            wf2 wf2VarM12295v2 = wf2VarM12295v.m12295v();
            if ((wf2VarM12295v2 != null ? wf2VarM12295v2.f33319i : null) == null) {
                return ((e13) wf2VarM12295v.f33299G.f25608e).mo4869X0();
            }
            wf2 wf2VarM12295v3 = wf2VarM12295v.m12295v();
            wf2VarM12295v = (wf2VarM12295v3 != null ? wf2VarM12295v3.f33319i : null).f33318h ? wf2VarM12295v.m12295v() : wf2VarM12295v.m12295v().f33319i;
        }
    }

    /* JADX INFO: renamed from: z */
    public static final gu4 m12932z(mi0 mi0Var) {
        WeakHashMap weakHashMap = y05.f34773x;
        return ev0.m5375y0(k43.m7390o(mi0Var).f34780g, k43.m7390o(mi0Var).f34775b);
    }
}
