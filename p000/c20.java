package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.C0316rt;
import ads_mobile_sdk.C0367uz;
import ads_mobile_sdk.EnumC0350tz;
import ads_mobile_sdk.ee2;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.fe2;
import ads_mobile_sdk.su1;
import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.autofill.AutofillId;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class c20 {

    /* JADX INFO: renamed from: a */
    public static volatile FirebaseAnalytics f15759a;

    /* JADX INFO: renamed from: b */
    public static final Object f15760b = new Object();

    /* JADX INFO: renamed from: c */
    public static final pg0 f15761c = new pg0(-49807564, false, new rg0());

    /* JADX INFO: renamed from: d */
    public static final pg0 f15762d = new pg0(-18377838, false, new fh0(16));

    /* JADX INFO: renamed from: e */
    public static final pg0 f15763e = new pg0(-331506422, false, new jh0(3));

    /* JADX INFO: renamed from: f */
    public static final pg0 f15764f = new pg0(-1294840346, false, new xg0(26));

    /* JADX INFO: renamed from: g */
    public static final double[][] f15765g = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: h */
    public static final double[][] f15766h = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: i */
    public static final double[] f15767i = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: j */
    public static final double[] f15768j = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    /* JADX INFO: renamed from: k */
    public static final StackTraceElement[] f15769k = new StackTraceElement[0];

    /* JADX INFO: renamed from: l */
    public static final C0796jf f15770l = new C0796jf(1022);

    /* JADX INFO: renamed from: m */
    public static final z45 f15771m = new z45(25);

    /* JADX INFO: renamed from: n */
    public static g12 f15772n;

    /* JADX INFO: renamed from: A */
    public static final ro0 m3796A(zo0 zo0Var, ro0 ro0Var) {
        ro0 ro0VarM3820o = m3820o(zo0Var.mo6367f(), ro0Var, true);
        pw0 pw0Var = l01.f23664a;
        return (ro0VarM3820o == pw0Var || ro0VarM3820o.get(gb5.f19711b) != null) ? ro0VarM3820o : ro0VarM3820o.plus(pw0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static final void m3797B(mt2 mt2Var, wp1 wp1Var) {
        z23 z23Var = mt2Var.f25201g;
        if (z23Var == null) {
            z23Var = new z23();
            z23Var.f35722a = (y23) mt2Var;
            VarHandle.storeStoreFence();
            mt2Var.f25201g = z23Var;
        }
        u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(mt2Var)).getSnapshotObserver();
        snapshotObserver.f31675a.m159e(z23Var, z23.f35721b, wp1Var);
    }

    /* JADX INFO: renamed from: C */
    public static final Object m3798C(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static final Object m3799D(Object obj) {
        return obj instanceof ff0 ? k43.m7389n(((ff0) obj).f18941a) : obj;
    }

    /* JADX INFO: renamed from: E */
    public static final gn0 m3800E(String str, g12 g12Var, oh4 oh4Var, ir1 ir1Var) {
        hn4 hn4Var = (hn4) se0.m10708W("system_panel_state", 0L, new n14((byte) 15), ir1Var, 6, 14).invoke(ir1Var, 0);
        C0712h4 c0712h4 = new C0712h4((byte) 9);
        c0712h4.f20357b = hn4Var;
        c0712h4.f20358c = oh4Var;
        c0712h4.f20359d = g12Var;
        VarHandle.storeStoreFence();
        pg0 pg0VarM11834R = vd6.m11834R(78982891, c0712h4, ir1Var);
        boolean zM6890g = ir1Var.m6890g(hn4Var);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new C0792jb(hn4Var, oh4Var, null, (byte) 8);
            ir1Var.m6905n0(objM6869O);
        }
        return ln0.m8039a(str, null, pg0VarM11834R, null, null, (yp1) objM6869O, 90);
    }

    /* JADX INFO: renamed from: F */
    public static final long m3801F(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: G */
    public static String m3802G(long j) {
        return "PointerId(value=" + j + ")";
    }

    /* JADX INFO: renamed from: H */
    public static final String m3803H(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    /* JADX INFO: renamed from: I */
    public static double m3804I(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX INFO: renamed from: J */
    public static final zt4 m3805J(wm0 wm0Var, ro0 ro0Var, Object obj) {
        zt4 zt4Var = null;
        if ((wm0Var instanceof bp0) && ro0Var.get(g70.f19625c) != null) {
            bp0 callerFrame = (bp0) wm0Var;
            while (!(callerFrame instanceof h01) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof zt4) {
                    zt4Var = (zt4) callerFrame;
                    break;
                }
            }
            if (zt4Var != null) {
                zt4Var.m13755n0(ro0Var, obj);
            }
        }
        return zt4Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m3806a(C0532cm c0532cm, nt2 nt2Var, mi0 mi0Var, int i, int i2) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6887e0(1451072229);
        if ((i2 & 4) != 0) {
            nt2Var = kt2.f23428a;
        }
        nt2 nt2Var2 = nt2Var;
        C0853kz c0853kz = ig1.f21382f;
        jm0.f22418cp.getClass();
        lk3 lk3VarM10634F = sc6.m10634F(qm2.f28573a, ir1Var);
        int i3 = i << 3;
        int i4 = (i & 112) | 520 | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        ir1Var.m6887e0(2032051394);
        C0954np c0954np = new C0954np(c0532cm, ba1.f15188a, lk3VarM10634F);
        int i5 = i4 >> 3;
        zy5.m13863a(c0954np, nt2Var2, C0880lp.f24242t, c0853kz, im0.f21547b, ir1Var, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
        ir1Var.m6912r(false);
        ir1Var.m6912r(false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX WARN: Code duplicated, block: B:129:0x0209  */
    /* JADX WARN: Code duplicated, block: B:131:0x020d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0216  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m3807b(String str, nt2 nt2Var, xl4 xl4Var, int i, boolean z, int i2, int i3, mi0 mi0Var, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zM6894i;
        int i15;
        boolean z3;
        boolean z4;
        boolean z5;
        yk3 yk3VarM6916v;
        int i16;
        Executor executor;
        boolean z6;
        C1180tf c1180tf;
        int iHashCode;
        nt2 nt2VarM10006A;
        ga3 ga3VarM6902m;
        int length;
        int i17;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (ir1Var.m6890g(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= ir1Var.m6890g(xl4Var) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= ir1Var.m6894i(null) ? 2048 : 1024;
        }
        int i18 = i5 & 16;
        if (i18 == 0) {
            if ((i4 & 24576) == 0) {
                int i19 = i;
                i6 |= ir1Var.m6886e(i19 == true ? 1 : 0) ? 16384 : 8192;
                i7 = i19;
            }
            i8 = i5 & 32;
            if (i8 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (ir1Var.m6892h(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i6 |= i9;
                }
                if ((1572864 & i4) == 0) {
                    if (ir1Var.m6886e(i2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i6 |= i17;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    if ((12582912 & i4) == 0) {
                        i11 = i3;
                        if (ir1Var.m6886e(i11 == true ? 1 : 0)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i6 |= i12;
                        i13 = i11;
                    }
                    i14 = i6 | 100663296;
                    if ((i5 & 512) != 0) {
                        i14 = i6 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zM6894i = ir1Var.m6890g(null);
                        } else {
                            zM6894i = ir1Var.m6894i(null);
                        }
                        if (zM6894i) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i14 |= i15;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i16 = i7;
                    if (ir1Var.m6871T(i14 & 1, z3)) {
                        if (i18 != 0) {
                            i16 = 1;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            i13 = 1;
                        }
                        as4.m3241T(i13 == true ? 1 : 0, i2);
                        if (ir1Var.m6898k(c14.f15755a) == null) {
                            xy4.m12778e();
                            return;
                        }
                        ir1Var.m6885d0(357055103);
                        ir1Var.m6912r(false);
                        am1 am1Var = (am1) ir1Var.m6898k(ij0.f21476k);
                        executor = (Executor) ir1Var.m6898k(AbstractC0889ly.f24457a);
                        if (executor != null || (length = str.length()) < 8 || length >= 1000) {
                            z6 = false;
                            ir1Var.m6885d0(-1248455541);
                            ir1Var.m6912r(false);
                        } else {
                            Boolean boolValueOf = AbstractC0889ly.f24458b;
                            if (boolValueOf == null) {
                                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                                AbstractC0889ly.f24458b = boolValueOf;
                            }
                            if (boolValueOf.booleanValue()) {
                                ir1Var.m6885d0(-1250263182);
                                df2 df2Var = (df2) ir1Var.m6898k(ij0.f21479n);
                                ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
                                try {
                                    RunnableC0852ky runnableC0852ky = new RunnableC0852ky((byte) 0);
                                    runnableC0852ky.f23606d = xl4Var;
                                    runnableC0852ky.f23607e = df2Var;
                                    runnableC0852ky.f23604b = str;
                                    runnableC0852ky.f23608f = ky0Var;
                                    runnableC0852ky.f23609g = am1Var;
                                    runnableC0852ky.f23605c = z2;
                                    VarHandle.storeStoreFence();
                                    executor.execute(runnableC0852ky);
                                } catch (RejectedExecutionException unused) {
                                }
                                z6 = false;
                                ir1Var.m6912r(false);
                            } else {
                                z6 = false;
                                ir1Var.m6885d0(-1248455541);
                                ir1Var.m6912r(false);
                            }
                        }
                        ir1Var.m6885d0(358076243);
                        ir1Var.m6912r(z6);
                        tl4 tl4Var = new tl4();
                        tl4Var.f31223a = str;
                        tl4Var.f31224b = xl4Var;
                        tl4Var.f31225c = am1Var;
                        tl4Var.f31226d = i16 == true ? 1 : 0;
                        tl4Var.f31227e = z2;
                        tl4Var.f31228f = i2;
                        tl4Var.f31229g = i13 == true ? 1 : 0;
                        VarHandle.storeStoreFence();
                        nt2 nt2VarMo7630d = nt2Var.mo7630d(tl4Var);
                        c1180tf = C1180tf.f31103e;
                        iHashCode = Long.hashCode(ir1Var.f21683T);
                        nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d);
                        ga3VarM6902m = ir1Var.m6902m();
                        bi0.f15310ap.getClass();
                        if (ir1Var.f21685a != null) {
                            dt0.m4682E();
                            throw null;
                        }
                        ir1Var.m6893h0();
                        if (ir1Var.f21682S) {
                            ir1Var.m6900l(wf2.f33290T);
                        } else {
                            ir1Var.m6911q0();
                        }
                        C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
                        C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                        C0006a5.m50F(ir1Var);
                        C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                        C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                        ir1Var.m6912r(true);
                        z5 = i16;
                        z4 = i13;
                    } else {
                        ir1Var.m6874W();
                        z5 = i7;
                        z4 = i13;
                    }
                    yk3VarM6916v = ir1Var.m6916v();
                    if (yk3VarM6916v != null) {
                        C0815jy c0815jy = new C0815jy();
                        c0815jy.f22731a = str;
                        c0815jy.f22732b = nt2Var;
                        c0815jy.f22733c = xl4Var;
                        c0815jy.f22734d = z5;
                        c0815jy.f22735e = z2;
                        c0815jy.f22736f = i2;
                        c0815jy.f22737g = z4;
                        c0815jy.f22738h = i4;
                        c0815jy.f22739i = i5;
                        VarHandle.storeStoreFence();
                        yk3VarM6916v.f35300d = c0815jy;
                    }
                }
                i6 |= 12582912;
                i13 = i3;
                i14 = i6 | 100663296;
                if ((i5 & 512) != 0) {
                    i14 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM6894i = ir1Var.m6890g(null);
                    } else {
                        zM6894i = ir1Var.m6894i(null);
                    }
                    if (zM6894i) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i16 = i7;
                if (ir1Var.m6871T(i14 & 1, z3)) {
                    if (i18 != 0) {
                        i16 = 1;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        i13 = 1;
                    }
                    as4.m3241T(i13 == true ? 1 : 0, i2);
                    if (ir1Var.m6898k(c14.f15755a) == null) {
                        xy4.m12778e();
                        return;
                    }
                    ir1Var.m6885d0(357055103);
                    ir1Var.m6912r(false);
                    am1 am1Var2 = (am1) ir1Var.m6898k(ij0.f21476k);
                    executor = (Executor) ir1Var.m6898k(AbstractC0889ly.f24457a);
                    if (executor != null) {
                        z6 = false;
                        ir1Var.m6885d0(-1248455541);
                        ir1Var.m6912r(false);
                    } else {
                        z6 = false;
                        ir1Var.m6885d0(-1248455541);
                        ir1Var.m6912r(false);
                    }
                    ir1Var.m6885d0(358076243);
                    ir1Var.m6912r(z6);
                    tl4 tl4Var2 = new tl4();
                    tl4Var2.f31223a = str;
                    tl4Var2.f31224b = xl4Var;
                    tl4Var2.f31225c = am1Var2;
                    tl4Var2.f31226d = i16 == true ? 1 : 0;
                    tl4Var2.f31227e = z2;
                    tl4Var2.f31228f = i2;
                    tl4Var2.f31229g = i13 == true ? 1 : 0;
                    VarHandle.storeStoreFence();
                    nt2 nt2VarMo7630d2 = nt2Var.mo7630d(tl4Var2);
                    c1180tf = C1180tf.f31103e;
                    iHashCode = Long.hashCode(ir1Var.f21683T);
                    nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d2);
                    ga3VarM6902m = ir1Var.m6902m();
                    bi0.f15310ap.getClass();
                    if (ir1Var.f21685a != null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var.m6893h0();
                    if (ir1Var.f21682S) {
                        ir1Var.m6900l(wf2.f33290T);
                    } else {
                        ir1Var.m6911q0();
                    }
                    C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    ir1Var.m6912r(true);
                    z5 = i16;
                    z4 = i13;
                } else {
                    ir1Var.m6874W();
                    z5 = i7;
                    z4 = i13;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    C0815jy c0815jy2 = new C0815jy();
                    c0815jy2.f22731a = str;
                    c0815jy2.f22732b = nt2Var;
                    c0815jy2.f22733c = xl4Var;
                    c0815jy2.f22734d = z5;
                    c0815jy2.f22735e = z2;
                    c0815jy2.f22736f = i2;
                    c0815jy2.f22737g = z4;
                    c0815jy2.f22738h = i4;
                    c0815jy2.f22739i = i5;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = c0815jy2;
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (ir1Var.m6886e(i2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i6 |= i17;
            }
            i10 = i5 & 128;
            if (i10 != 0) {
                if ((12582912 & i4) == 0) {
                    i11 = i3;
                    if (ir1Var.m6886e(i11 == true ? 1 : 0)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                    i13 = i11;
                }
                i14 = i6 | 100663296;
                if ((i5 & 512) != 0) {
                    i14 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM6894i = ir1Var.m6890g(null);
                    } else {
                        zM6894i = ir1Var.m6894i(null);
                    }
                    if (zM6894i) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i16 = i7;
                if (ir1Var.m6871T(i14 & 1, z3)) {
                    if (i18 != 0) {
                        i16 = 1;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        i13 = 1;
                    }
                    as4.m3241T(i13 == true ? 1 : 0, i2);
                    if (ir1Var.m6898k(c14.f15755a) == null) {
                        xy4.m12778e();
                        return;
                    }
                    ir1Var.m6885d0(357055103);
                    ir1Var.m6912r(false);
                    am1 am1Var3 = (am1) ir1Var.m6898k(ij0.f21476k);
                    executor = (Executor) ir1Var.m6898k(AbstractC0889ly.f24457a);
                    if (executor != null) {
                        z6 = false;
                        ir1Var.m6885d0(-1248455541);
                        ir1Var.m6912r(false);
                    } else {
                        z6 = false;
                        ir1Var.m6885d0(-1248455541);
                        ir1Var.m6912r(false);
                    }
                    ir1Var.m6885d0(358076243);
                    ir1Var.m6912r(z6);
                    tl4 tl4Var3 = new tl4();
                    tl4Var3.f31223a = str;
                    tl4Var3.f31224b = xl4Var;
                    tl4Var3.f31225c = am1Var3;
                    tl4Var3.f31226d = i16 == true ? 1 : 0;
                    tl4Var3.f31227e = z2;
                    tl4Var3.f31228f = i2;
                    tl4Var3.f31229g = i13 == true ? 1 : 0;
                    VarHandle.storeStoreFence();
                    nt2 nt2VarMo7630d3 = nt2Var.mo7630d(tl4Var3);
                    c1180tf = C1180tf.f31103e;
                    iHashCode = Long.hashCode(ir1Var.f21683T);
                    nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d3);
                    ga3VarM6902m = ir1Var.m6902m();
                    bi0.f15310ap.getClass();
                    if (ir1Var.f21685a != null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var.m6893h0();
                    if (ir1Var.f21682S) {
                        ir1Var.m6900l(wf2.f33290T);
                    } else {
                        ir1Var.m6911q0();
                    }
                    C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    ir1Var.m6912r(true);
                    z5 = i16;
                    z4 = i13;
                } else {
                    ir1Var.m6874W();
                    z5 = i7;
                    z4 = i13;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    C0815jy c0815jy3 = new C0815jy();
                    c0815jy3.f22731a = str;
                    c0815jy3.f22732b = nt2Var;
                    c0815jy3.f22733c = xl4Var;
                    c0815jy3.f22734d = z5;
                    c0815jy3.f22735e = z2;
                    c0815jy3.f22736f = i2;
                    c0815jy3.f22737g = z4;
                    c0815jy3.f22738h = i4;
                    c0815jy3.f22739i = i5;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = c0815jy3;
                }
            }
            i6 |= 12582912;
            i13 = i3;
            i14 = i6 | 100663296;
            if ((i5 & 512) != 0) {
                i14 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM6894i = ir1Var.m6890g(null);
                } else {
                    zM6894i = ir1Var.m6894i(null);
                }
                if (zM6894i) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            i16 = i7;
            if (ir1Var.m6871T(i14 & 1, z3)) {
                if (i18 != 0) {
                    i16 = 1;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i10 != 0) {
                    i13 = 1;
                }
                as4.m3241T(i13 == true ? 1 : 0, i2);
                if (ir1Var.m6898k(c14.f15755a) == null) {
                    xy4.m12778e();
                    return;
                }
                ir1Var.m6885d0(357055103);
                ir1Var.m6912r(false);
                am1 am1Var4 = (am1) ir1Var.m6898k(ij0.f21476k);
                executor = (Executor) ir1Var.m6898k(AbstractC0889ly.f24457a);
                if (executor != null) {
                    z6 = false;
                    ir1Var.m6885d0(-1248455541);
                    ir1Var.m6912r(false);
                } else {
                    z6 = false;
                    ir1Var.m6885d0(-1248455541);
                    ir1Var.m6912r(false);
                }
                ir1Var.m6885d0(358076243);
                ir1Var.m6912r(z6);
                tl4 tl4Var4 = new tl4();
                tl4Var4.f31223a = str;
                tl4Var4.f31224b = xl4Var;
                tl4Var4.f31225c = am1Var4;
                tl4Var4.f31226d = i16 == true ? 1 : 0;
                tl4Var4.f31227e = z2;
                tl4Var4.f31228f = i2;
                tl4Var4.f31229g = i13 == true ? 1 : 0;
                VarHandle.storeStoreFence();
                nt2 nt2VarMo7630d4 = nt2Var.mo7630d(tl4Var4);
                c1180tf = C1180tf.f31103e;
                iHashCode = Long.hashCode(ir1Var.f21683T);
                nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d4);
                ga3VarM6902m = ir1Var.m6902m();
                bi0.f15310ap.getClass();
                if (ir1Var.f21685a != null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(wf2.f33290T);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
                C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                C0006a5.m50F(ir1Var);
                C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                ir1Var.m6912r(true);
                z5 = i16;
                z4 = i13;
            } else {
                ir1Var.m6874W();
                z5 = i7;
                z4 = i13;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                C0815jy c0815jy4 = new C0815jy();
                c0815jy4.f22731a = str;
                c0815jy4.f22732b = nt2Var;
                c0815jy4.f22733c = xl4Var;
                c0815jy4.f22734d = z5;
                c0815jy4.f22735e = z2;
                c0815jy4.f22736f = i2;
                c0815jy4.f22737g = z4;
                c0815jy4.f22738h = i4;
                c0815jy4.f22739i = i5;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = c0815jy4;
            }
        }
        i6 |= 24576;
        i7 = i;
        i8 = i5 & 32;
        if (i8 != 0) {
            if ((196608 & i4) == 0) {
                z2 = z;
                if (ir1Var.m6892h(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i6 |= i9;
            }
            if ((1572864 & i4) == 0) {
                if (ir1Var.m6886e(i2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i6 |= i17;
            }
            i10 = i5 & 128;
            if (i10 != 0) {
                if ((12582912 & i4) == 0) {
                    i11 = i3;
                    if (ir1Var.m6886e(i11 == true ? 1 : 0)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                    i13 = i11;
                }
                i14 = i6 | 100663296;
                if ((i5 & 512) != 0) {
                    i14 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM6894i = ir1Var.m6890g(null);
                    } else {
                        zM6894i = ir1Var.m6894i(null);
                    }
                    if (zM6894i) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i16 = i7;
                if (ir1Var.m6871T(i14 & 1, z3)) {
                    if (i18 != 0) {
                        i16 = 1;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        i13 = 1;
                    }
                    as4.m3241T(i13 == true ? 1 : 0, i2);
                    if (ir1Var.m6898k(c14.f15755a) == null) {
                        xy4.m12778e();
                        return;
                    }
                    ir1Var.m6885d0(357055103);
                    ir1Var.m6912r(false);
                    am1 am1Var5 = (am1) ir1Var.m6898k(ij0.f21476k);
                    executor = (Executor) ir1Var.m6898k(AbstractC0889ly.f24457a);
                    if (executor != null) {
                        z6 = false;
                        ir1Var.m6885d0(-1248455541);
                        ir1Var.m6912r(false);
                    } else {
                        z6 = false;
                        ir1Var.m6885d0(-1248455541);
                        ir1Var.m6912r(false);
                    }
                    ir1Var.m6885d0(358076243);
                    ir1Var.m6912r(z6);
                    tl4 tl4Var5 = new tl4();
                    tl4Var5.f31223a = str;
                    tl4Var5.f31224b = xl4Var;
                    tl4Var5.f31225c = am1Var5;
                    tl4Var5.f31226d = i16 == true ? 1 : 0;
                    tl4Var5.f31227e = z2;
                    tl4Var5.f31228f = i2;
                    tl4Var5.f31229g = i13 == true ? 1 : 0;
                    VarHandle.storeStoreFence();
                    nt2 nt2VarMo7630d5 = nt2Var.mo7630d(tl4Var5);
                    c1180tf = C1180tf.f31103e;
                    iHashCode = Long.hashCode(ir1Var.f21683T);
                    nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d5);
                    ga3VarM6902m = ir1Var.m6902m();
                    bi0.f15310ap.getClass();
                    if (ir1Var.f21685a != null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var.m6893h0();
                    if (ir1Var.f21682S) {
                        ir1Var.m6900l(wf2.f33290T);
                    } else {
                        ir1Var.m6911q0();
                    }
                    C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    ir1Var.m6912r(true);
                    z5 = i16;
                    z4 = i13;
                } else {
                    ir1Var.m6874W();
                    z5 = i7;
                    z4 = i13;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    C0815jy c0815jy5 = new C0815jy();
                    c0815jy5.f22731a = str;
                    c0815jy5.f22732b = nt2Var;
                    c0815jy5.f22733c = xl4Var;
                    c0815jy5.f22734d = z5;
                    c0815jy5.f22735e = z2;
                    c0815jy5.f22736f = i2;
                    c0815jy5.f22737g = z4;
                    c0815jy5.f22738h = i4;
                    c0815jy5.f22739i = i5;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = c0815jy5;
                }
            }
            i6 |= 12582912;
            i13 = i3;
            i14 = i6 | 100663296;
            if ((i5 & 512) != 0) {
                i14 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM6894i = ir1Var.m6890g(null);
                } else {
                    zM6894i = ir1Var.m6894i(null);
                }
                if (zM6894i) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            i16 = i7;
            if (ir1Var.m6871T(i14 & 1, z3)) {
                if (i18 != 0) {
                    i16 = 1;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i10 != 0) {
                    i13 = 1;
                }
                as4.m3241T(i13 == true ? 1 : 0, i2);
                if (ir1Var.m6898k(c14.f15755a) == null) {
                    xy4.m12778e();
                    return;
                }
                ir1Var.m6885d0(357055103);
                ir1Var.m6912r(false);
                am1 am1Var6 = (am1) ir1Var.m6898k(ij0.f21476k);
                executor = (Executor) ir1Var.m6898k(AbstractC0889ly.f24457a);
                if (executor != null) {
                    z6 = false;
                    ir1Var.m6885d0(-1248455541);
                    ir1Var.m6912r(false);
                } else {
                    z6 = false;
                    ir1Var.m6885d0(-1248455541);
                    ir1Var.m6912r(false);
                }
                ir1Var.m6885d0(358076243);
                ir1Var.m6912r(z6);
                tl4 tl4Var6 = new tl4();
                tl4Var6.f31223a = str;
                tl4Var6.f31224b = xl4Var;
                tl4Var6.f31225c = am1Var6;
                tl4Var6.f31226d = i16 == true ? 1 : 0;
                tl4Var6.f31227e = z2;
                tl4Var6.f31228f = i2;
                tl4Var6.f31229g = i13 == true ? 1 : 0;
                VarHandle.storeStoreFence();
                nt2 nt2VarMo7630d6 = nt2Var.mo7630d(tl4Var6);
                c1180tf = C1180tf.f31103e;
                iHashCode = Long.hashCode(ir1Var.f21683T);
                nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d6);
                ga3VarM6902m = ir1Var.m6902m();
                bi0.f15310ap.getClass();
                if (ir1Var.f21685a != null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(wf2.f33290T);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
                C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                C0006a5.m50F(ir1Var);
                C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                ir1Var.m6912r(true);
                z5 = i16;
                z4 = i13;
            } else {
                ir1Var.m6874W();
                z5 = i7;
                z4 = i13;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                C0815jy c0815jy6 = new C0815jy();
                c0815jy6.f22731a = str;
                c0815jy6.f22732b = nt2Var;
                c0815jy6.f22733c = xl4Var;
                c0815jy6.f22734d = z5;
                c0815jy6.f22735e = z2;
                c0815jy6.f22736f = i2;
                c0815jy6.f22737g = z4;
                c0815jy6.f22738h = i4;
                c0815jy6.f22739i = i5;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = c0815jy6;
            }
        }
        i6 |= 196608;
        z2 = z;
        if ((1572864 & i4) == 0) {
            if (ir1Var.m6886e(i2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i6 |= i17;
        }
        i10 = i5 & 128;
        if (i10 != 0) {
            if ((12582912 & i4) == 0) {
                i11 = i3;
                if (ir1Var.m6886e(i11 == true ? 1 : 0)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
                i13 = i11;
            }
            i14 = i6 | 100663296;
            if ((i5 & 512) != 0) {
                i14 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM6894i = ir1Var.m6890g(null);
                } else {
                    zM6894i = ir1Var.m6894i(null);
                }
                if (zM6894i) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            i16 = i7;
            if (ir1Var.m6871T(i14 & 1, z3)) {
                if (i18 != 0) {
                    i16 = 1;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i10 != 0) {
                    i13 = 1;
                }
                as4.m3241T(i13 == true ? 1 : 0, i2);
                if (ir1Var.m6898k(c14.f15755a) == null) {
                    xy4.m12778e();
                    return;
                }
                ir1Var.m6885d0(357055103);
                ir1Var.m6912r(false);
                am1 am1Var7 = (am1) ir1Var.m6898k(ij0.f21476k);
                executor = (Executor) ir1Var.m6898k(AbstractC0889ly.f24457a);
                if (executor != null) {
                    z6 = false;
                    ir1Var.m6885d0(-1248455541);
                    ir1Var.m6912r(false);
                } else {
                    z6 = false;
                    ir1Var.m6885d0(-1248455541);
                    ir1Var.m6912r(false);
                }
                ir1Var.m6885d0(358076243);
                ir1Var.m6912r(z6);
                tl4 tl4Var7 = new tl4();
                tl4Var7.f31223a = str;
                tl4Var7.f31224b = xl4Var;
                tl4Var7.f31225c = am1Var7;
                tl4Var7.f31226d = i16 == true ? 1 : 0;
                tl4Var7.f31227e = z2;
                tl4Var7.f31228f = i2;
                tl4Var7.f31229g = i13 == true ? 1 : 0;
                VarHandle.storeStoreFence();
                nt2 nt2VarMo7630d7 = nt2Var.mo7630d(tl4Var7);
                c1180tf = C1180tf.f31103e;
                iHashCode = Long.hashCode(ir1Var.f21683T);
                nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d7);
                ga3VarM6902m = ir1Var.m6902m();
                bi0.f15310ap.getClass();
                if (ir1Var.f21685a != null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(wf2.f33290T);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
                C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                C0006a5.m50F(ir1Var);
                C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                ir1Var.m6912r(true);
                z5 = i16;
                z4 = i13;
            } else {
                ir1Var.m6874W();
                z5 = i7;
                z4 = i13;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                C0815jy c0815jy7 = new C0815jy();
                c0815jy7.f22731a = str;
                c0815jy7.f22732b = nt2Var;
                c0815jy7.f22733c = xl4Var;
                c0815jy7.f22734d = z5;
                c0815jy7.f22735e = z2;
                c0815jy7.f22736f = i2;
                c0815jy7.f22737g = z4;
                c0815jy7.f22738h = i4;
                c0815jy7.f22739i = i5;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = c0815jy7;
            }
        }
        i6 |= 12582912;
        i13 = i3;
        i14 = i6 | 100663296;
        if ((i5 & 512) != 0) {
            i14 = i6 | 905969664;
        } else if ((805306368 & i4) == 0) {
            if ((1073741824 & i4) == 0) {
                zM6894i = ir1Var.m6890g(null);
            } else {
                zM6894i = ir1Var.m6894i(null);
            }
            if (zM6894i) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i14 |= i15;
        }
        if ((i14 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        i16 = i7;
        if (ir1Var.m6871T(i14 & 1, z3)) {
            if (i18 != 0) {
                i16 = 1;
            }
            if (i8 != 0) {
                z2 = true;
            }
            if (i10 != 0) {
                i13 = 1;
            }
            as4.m3241T(i13 == true ? 1 : 0, i2);
            if (ir1Var.m6898k(c14.f15755a) == null) {
                xy4.m12778e();
                return;
            }
            ir1Var.m6885d0(357055103);
            ir1Var.m6912r(false);
            am1 am1Var8 = (am1) ir1Var.m6898k(ij0.f21476k);
            executor = (Executor) ir1Var.m6898k(AbstractC0889ly.f24457a);
            if (executor != null) {
                z6 = false;
                ir1Var.m6885d0(-1248455541);
                ir1Var.m6912r(false);
            } else {
                z6 = false;
                ir1Var.m6885d0(-1248455541);
                ir1Var.m6912r(false);
            }
            ir1Var.m6885d0(358076243);
            ir1Var.m6912r(z6);
            tl4 tl4Var8 = new tl4();
            tl4Var8.f31223a = str;
            tl4Var8.f31224b = xl4Var;
            tl4Var8.f31225c = am1Var8;
            tl4Var8.f31226d = i16 == true ? 1 : 0;
            tl4Var8.f31227e = z2;
            tl4Var8.f31228f = i2;
            tl4Var8.f31229g = i13 == true ? 1 : 0;
            VarHandle.storeStoreFence();
            nt2 nt2VarMo7630d8 = nt2Var.mo7630d(tl4Var8);
            c1180tf = C1180tf.f31103e;
            iHashCode = Long.hashCode(ir1Var.f21683T);
            nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d8);
            ga3VarM6902m = ir1Var.m6902m();
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a != null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            ir1Var.m6912r(true);
            z5 = i16;
            z4 = i13;
        } else {
            ir1Var.m6874W();
            z5 = i7;
            z4 = i13;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0815jy c0815jy8 = new C0815jy();
            c0815jy8.f22731a = str;
            c0815jy8.f22732b = nt2Var;
            c0815jy8.f22733c = xl4Var;
            c0815jy8.f22734d = z5;
            c0815jy8.f22735e = z2;
            c0815jy8.f22736f = i2;
            c0815jy8.f22737g = z4;
            c0815jy8.f22738h = i4;
            c0815jy8.f22739i = i5;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0815jy8;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final oz0 m3808c(int i) {
        oz0 oz0Var = new oz0();
        oz0Var.f27241l = i;
        if (i > 0) {
            VarHandle.storeStoreFence();
            return oz0Var;
        }
        C1077qn.m9987m("px must be > 0.");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m3809d(pg0 pg0Var, mi0 mi0Var, int i) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(441837433);
        if (ir1Var.m6871T(i & 1, (i & 3) != 2)) {
            Object objM6869O = ir1Var.m6869O();
            Object obj2 = ki0.f23136a;
            if (objM6869O == obj2) {
                obj = objM6869O;
                ap2 ap2Var = new ap2();
                ap2Var.f14768a = null;
                ir1Var.m6905n0(ap2Var);
                obj = ap2Var;
            }
            obj = objM6869O;
            Object obj3 = (ap2) obj;
            Object objM6869O2 = ir1Var.m6869O();
            byte b = 11;
            if (objM6869O2 == obj2) {
                objM6869O2 = new da2(b);
                ir1Var.m6905n0(objM6869O2);
            }
            wp1 wp1Var = (wp1) objM6869O2;
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wp1Var);
            } else {
                ir1Var.m6911q0();
            }
            el1 el1Var = new el1((byte) 28);
            if (ir1Var.f21682S) {
                u04 u04Var = new u04(b);
                u04Var.f31581b = el1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6880b(u04Var, ju4.f22634a);
            }
            C0006a5.m53I(ir1Var, new en0((byte) 25), obj3);
            pg0Var.invoke(obj3, ir1Var, 48);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            h02 h02Var = new h02((byte) 6);
            h02Var.f20244b = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = h02Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C1253ve m3810e() {
        return new C1253ve(new Paint(7));
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x0170  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m3811f(hh4 hh4Var, boolean z, int i, boolean z2, pg0 pg0Var, mi0 mi0Var, int i2, int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b;
        boolean z4;
        boolean z5;
        yk3 yk3VarM6916v;
        int i9;
        int iOrdinal;
        Context contextM12815a;
        yk3 yk3VarM6916v2;
        byte b2;
        Context context;
        ba4 ba4Var;
        e94 e94VarM5353c0;
        yp1 yp1VarMo3783e;
        e94 e94VarM5361k0;
        cj0 cj0Var;
        boolean zM6890g;
        hh4 hh4Var2;
        Object obj;
        kx1 kx1Var;
        boolean zM6890g2;
        Object obj2;
        int i10;
        int i11;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(127905232);
        if ((i2 & 6) == 0) {
            i4 = (ir1Var.m6886e(hh4Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                z3 = z;
                i4 |= ir1Var.m6892h(z3) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    i6 = i;
                    if (ir1Var.m6886e(i6)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i4 |= i7;
                }
                if ((i2 & 3072) == 0) {
                    if (ir1Var.m6892h(z2)) {
                        i11 = 2048;
                    } else {
                        i11 = 1024;
                    }
                    i4 |= i11;
                }
                i8 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    if (ir1Var.m6894i(pg0Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i8 |= i10;
                }
                b = 0;
                if ((74899 & i8) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ir1Var.m6871T(i8 & 1, z4)) {
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i5 != 0) {
                        i9 = 0;
                    } else {
                        i9 = i6;
                    }
                    iOrdinal = hh4Var.ordinal();
                    if (iOrdinal != 0) {
                        ir1Var.m6885d0(789052474);
                        contextM12815a = ((C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a)).m12815a();
                        if (contextM12815a == null) {
                            ir1Var.m6912r(false);
                            yk3VarM6916v2 = ir1Var.m6916v();
                            if (yk3VarM6916v2 != null) {
                                tg4 tg4Var = new tg4(b);
                                tg4Var.f31147b = hh4Var;
                                tg4Var.f31148c = z5;
                                tg4Var.f31149d = i9;
                                tg4Var.f31150e = z2;
                                tg4Var.f31151f = pg0Var;
                                tg4Var.f31152g = i2;
                                tg4Var.f31153h = i3;
                                VarHandle.storeStoreFence();
                                yk3VarM6916v2.f35300d = tg4Var;
                                return;
                            }
                            return;
                        }
                        ir1Var.m6912r(false);
                    } else if (iOrdinal == 1) {
                        ir1Var.m6885d0(-1637116242);
                        ir1Var.m6912r(false);
                        C0670g.m5864c();
                        return;
                    } else {
                        ir1Var.m6885d0(-1637111038);
                        contextM12815a = ((Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                        ir1Var.m6912r(false);
                    }
                    r50 r50Var = i41.f21117b;
                    b2 = 7;
                    context = contextM12815a;
                    ba4Var = (ba4) se0.m10708W("system_overlay_host", as4.m3238Q(3, m41.SECONDS), new n14(b2), ir1Var, 6, 6).invoke(ir1Var, 0);
                    gr1 gr1VarM4685N = dt0.m4685N(ir1Var);
                    e94VarM5353c0 = ev0.m5353c0();
                    if (e94VarM5353c0 != null) {
                        yp1VarMo3783e = e94VarM5353c0.mo3783e();
                    } else {
                        yp1VarMo3783e = null;
                    }
                    e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                    try {
                        ga3 ga3VarMo6114j = gr1VarM4685N.mo6114j();
                        cj0Var = new cj0();
                        cj0Var.f16058a = ga3VarMo6114j;
                        VarHandle.storeStoreFence();
                        ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                        zM6890g = ir1Var.m6890g(context);
                        Object objM6869O = ir1Var.m6869O();
                        i50 i50Var = ki0.f23136a;
                        obj = objM6869O;
                        if (zM6890g || objM6869O == i50Var) {
                            kx1 kx1Var2 = new kx1();
                            kx1Var2.f23570a = context;
                            if (context instanceof AccessibilityService) {
                                hh4Var2 = hh4.f20583a;
                            } else {
                                hh4Var2 = hh4.f20584b;
                            }
                            kx1Var2.f23571b = new zg4(hh4Var2, 30);
                            kx1Var2.f23572c = k43.m7398w(cj0Var);
                            kx1Var2.f23573d = k43.m7398w(n40.f25435f);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(kx1Var2);
                            obj = kx1Var2;
                        }
                        kx1Var = (kx1) obj;
                        zg4 zg4Var = kx1Var.f23571b;
                        zg4Var.f36071e.setValue(Boolean.valueOf(z5));
                        zg4Var.f36070d.m133i(i9);
                        zg4Var.f36072f.setValue(Boolean.valueOf(z2));
                        zg4Var.f36073g.setValue(false);
                        kx1Var.f23572c.setValue(cj0Var);
                        kx1Var.f23573d.setValue(pg0Var);
                        zM6890g2 = ir1Var.m6890g(ba4Var) | ir1Var.m6890g(kx1Var);
                        Object objM6869O2 = ir1Var.m6869O();
                        obj2 = objM6869O2;
                        if (zM6890g2 || objM6869O2 == i50Var) {
                            cz3 cz3Var = new cz3(b2);
                            cz3Var.f16638b = ba4Var;
                            cz3Var.f16639c = kx1Var;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(cz3Var);
                            obj2 = cz3Var;
                        }
                        lb5.m7923d(kx1Var, (yp1) obj2, ir1Var);
                        i6 = i9;
                    } catch (Throwable th) {
                        ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                        throw th;
                    }
                } else {
                    ir1Var.m6874W();
                    z5 = z3;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    tg4 tg4Var2 = new tg4((byte) 1);
                    tg4Var2.f31147b = hh4Var;
                    tg4Var2.f31148c = z5;
                    tg4Var2.f31149d = i6;
                    tg4Var2.f31150e = z2;
                    tg4Var2.f31151f = pg0Var;
                    tg4Var2.f31152g = i2;
                    tg4Var2.f31153h = i3;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = tg4Var2;
                }
            }
            i4 |= 384;
            i6 = i;
            if ((i2 & 3072) == 0) {
                if (ir1Var.m6892h(z2)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i4 |= i11;
            }
            i8 = i4 | 24576;
            if ((196608 & i2) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i8 |= i10;
            }
            b = 0;
            if ((74899 & i8) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ir1Var.m6871T(i8 & 1, z4)) {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    i9 = 0;
                } else {
                    i9 = i6;
                }
                iOrdinal = hh4Var.ordinal();
                if (iOrdinal != 0) {
                    ir1Var.m6885d0(789052474);
                    contextM12815a = ((C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a)).m12815a();
                    if (contextM12815a == null) {
                        ir1Var.m6912r(false);
                        yk3VarM6916v2 = ir1Var.m6916v();
                        if (yk3VarM6916v2 != null) {
                            tg4 tg4Var3 = new tg4(b);
                            tg4Var3.f31147b = hh4Var;
                            tg4Var3.f31148c = z5;
                            tg4Var3.f31149d = i9;
                            tg4Var3.f31150e = z2;
                            tg4Var3.f31151f = pg0Var;
                            tg4Var3.f31152g = i2;
                            tg4Var3.f31153h = i3;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v2.f35300d = tg4Var3;
                            return;
                        }
                        return;
                    }
                    ir1Var.m6912r(false);
                } else if (iOrdinal == 1) {
                    ir1Var.m6885d0(-1637116242);
                    ir1Var.m6912r(false);
                    C0670g.m5864c();
                    return;
                } else {
                    ir1Var.m6885d0(-1637111038);
                    contextM12815a = ((Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                    ir1Var.m6912r(false);
                }
                r50 r50Var2 = i41.f21117b;
                b2 = 7;
                context = contextM12815a;
                ba4Var = (ba4) se0.m10708W("system_overlay_host", as4.m3238Q(3, m41.SECONDS), new n14(b2), ir1Var, 6, 6).invoke(ir1Var, 0);
                gr1 gr1VarM4685N2 = dt0.m4685N(ir1Var);
                e94VarM5353c0 = ev0.m5353c0();
                if (e94VarM5353c0 != null) {
                    yp1VarMo3783e = e94VarM5353c0.mo3783e();
                } else {
                    yp1VarMo3783e = null;
                }
                e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                ga3 ga3VarMo6114j2 = gr1VarM4685N2.mo6114j();
                cj0Var = new cj0();
                cj0Var.f16058a = ga3VarMo6114j2;
                VarHandle.storeStoreFence();
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                zM6890g = ir1Var.m6890g(context);
                Object objM6869O3 = ir1Var.m6869O();
                i50 i50Var2 = ki0.f23136a;
                obj = objM6869O3;
                if (zM6890g) {
                    kx1 kx1Var3 = new kx1();
                    kx1Var3.f23570a = context;
                    if (context instanceof AccessibilityService) {
                        hh4Var2 = hh4.f20583a;
                    } else {
                        hh4Var2 = hh4.f20584b;
                    }
                    kx1Var3.f23571b = new zg4(hh4Var2, 30);
                    kx1Var3.f23572c = k43.m7398w(cj0Var);
                    kx1Var3.f23573d = k43.m7398w(n40.f25435f);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(kx1Var3);
                    obj = kx1Var3;
                } else {
                    kx1 kx1Var4 = new kx1();
                    kx1Var4.f23570a = context;
                    if (context instanceof AccessibilityService) {
                        hh4Var2 = hh4.f20583a;
                    } else {
                        hh4Var2 = hh4.f20584b;
                    }
                    kx1Var4.f23571b = new zg4(hh4Var2, 30);
                    kx1Var4.f23572c = k43.m7398w(cj0Var);
                    kx1Var4.f23573d = k43.m7398w(n40.f25435f);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(kx1Var4);
                    obj = kx1Var4;
                }
                kx1Var = (kx1) obj;
                zg4 zg4Var2 = kx1Var.f23571b;
                zg4Var2.f36071e.setValue(Boolean.valueOf(z5));
                zg4Var2.f36070d.m133i(i9);
                zg4Var2.f36072f.setValue(Boolean.valueOf(z2));
                zg4Var2.f36073g.setValue(false);
                kx1Var.f23572c.setValue(cj0Var);
                kx1Var.f23573d.setValue(pg0Var);
                zM6890g2 = ir1Var.m6890g(ba4Var) | ir1Var.m6890g(kx1Var);
                Object objM6869O4 = ir1Var.m6869O();
                obj2 = objM6869O4;
                if (zM6890g2) {
                    cz3 cz3Var2 = new cz3(b2);
                    cz3Var2.f16638b = ba4Var;
                    cz3Var2.f16639c = kx1Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(cz3Var2);
                    obj2 = cz3Var2;
                } else {
                    cz3 cz3Var3 = new cz3(b2);
                    cz3Var3.f16638b = ba4Var;
                    cz3Var3.f16639c = kx1Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(cz3Var3);
                    obj2 = cz3Var3;
                }
                lb5.m7923d(kx1Var, (yp1) obj2, ir1Var);
                i6 = i9;
            } else {
                ir1Var.m6874W();
                z5 = z3;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                tg4 tg4Var4 = new tg4((byte) 1);
                tg4Var4.f31147b = hh4Var;
                tg4Var4.f31148c = z5;
                tg4Var4.f31149d = i6;
                tg4Var4.f31150e = z2;
                tg4Var4.f31151f = pg0Var;
                tg4Var4.f31152g = i2;
                tg4Var4.f31153h = i3;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = tg4Var4;
            }
        }
        i4 |= 48;
        z3 = z;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                i6 = i;
                if (ir1Var.m6886e(i6)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i4 |= i7;
            }
            if ((i2 & 3072) == 0) {
                if (ir1Var.m6892h(z2)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i4 |= i11;
            }
            i8 = i4 | 24576;
            if ((196608 & i2) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i8 |= i10;
            }
            b = 0;
            if ((74899 & i8) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ir1Var.m6871T(i8 & 1, z4)) {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    i9 = 0;
                } else {
                    i9 = i6;
                }
                iOrdinal = hh4Var.ordinal();
                if (iOrdinal != 0) {
                    ir1Var.m6885d0(789052474);
                    contextM12815a = ((C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a)).m12815a();
                    if (contextM12815a == null) {
                        ir1Var.m6912r(false);
                        yk3VarM6916v2 = ir1Var.m6916v();
                        if (yk3VarM6916v2 != null) {
                            tg4 tg4Var5 = new tg4(b);
                            tg4Var5.f31147b = hh4Var;
                            tg4Var5.f31148c = z5;
                            tg4Var5.f31149d = i9;
                            tg4Var5.f31150e = z2;
                            tg4Var5.f31151f = pg0Var;
                            tg4Var5.f31152g = i2;
                            tg4Var5.f31153h = i3;
                            VarHandle.storeStoreFence();
                            yk3VarM6916v2.f35300d = tg4Var5;
                            return;
                        }
                        return;
                    }
                    ir1Var.m6912r(false);
                } else if (iOrdinal == 1) {
                    ir1Var.m6885d0(-1637116242);
                    ir1Var.m6912r(false);
                    C0670g.m5864c();
                    return;
                } else {
                    ir1Var.m6885d0(-1637111038);
                    contextM12815a = ((Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                    ir1Var.m6912r(false);
                }
                r50 r50Var3 = i41.f21117b;
                b2 = 7;
                context = contextM12815a;
                ba4Var = (ba4) se0.m10708W("system_overlay_host", as4.m3238Q(3, m41.SECONDS), new n14(b2), ir1Var, 6, 6).invoke(ir1Var, 0);
                gr1 gr1VarM4685N3 = dt0.m4685N(ir1Var);
                e94VarM5353c0 = ev0.m5353c0();
                if (e94VarM5353c0 != null) {
                    yp1VarMo3783e = e94VarM5353c0.mo3783e();
                } else {
                    yp1VarMo3783e = null;
                }
                e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                ga3 ga3VarMo6114j3 = gr1VarM4685N3.mo6114j();
                cj0Var = new cj0();
                cj0Var.f16058a = ga3VarMo6114j3;
                VarHandle.storeStoreFence();
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                zM6890g = ir1Var.m6890g(context);
                Object objM6869O5 = ir1Var.m6869O();
                i50 i50Var3 = ki0.f23136a;
                obj = objM6869O5;
                if (zM6890g) {
                    kx1 kx1Var5 = new kx1();
                    kx1Var5.f23570a = context;
                    if (context instanceof AccessibilityService) {
                        hh4Var2 = hh4.f20583a;
                    } else {
                        hh4Var2 = hh4.f20584b;
                    }
                    kx1Var5.f23571b = new zg4(hh4Var2, 30);
                    kx1Var5.f23572c = k43.m7398w(cj0Var);
                    kx1Var5.f23573d = k43.m7398w(n40.f25435f);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(kx1Var5);
                    obj = kx1Var5;
                } else {
                    kx1 kx1Var6 = new kx1();
                    kx1Var6.f23570a = context;
                    if (context instanceof AccessibilityService) {
                        hh4Var2 = hh4.f20583a;
                    } else {
                        hh4Var2 = hh4.f20584b;
                    }
                    kx1Var6.f23571b = new zg4(hh4Var2, 30);
                    kx1Var6.f23572c = k43.m7398w(cj0Var);
                    kx1Var6.f23573d = k43.m7398w(n40.f25435f);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(kx1Var6);
                    obj = kx1Var6;
                }
                kx1Var = (kx1) obj;
                zg4 zg4Var3 = kx1Var.f23571b;
                zg4Var3.f36071e.setValue(Boolean.valueOf(z5));
                zg4Var3.f36070d.m133i(i9);
                zg4Var3.f36072f.setValue(Boolean.valueOf(z2));
                zg4Var3.f36073g.setValue(false);
                kx1Var.f23572c.setValue(cj0Var);
                kx1Var.f23573d.setValue(pg0Var);
                zM6890g2 = ir1Var.m6890g(ba4Var) | ir1Var.m6890g(kx1Var);
                Object objM6869O6 = ir1Var.m6869O();
                obj2 = objM6869O6;
                if (zM6890g2) {
                    cz3 cz3Var4 = new cz3(b2);
                    cz3Var4.f16638b = ba4Var;
                    cz3Var4.f16639c = kx1Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(cz3Var4);
                    obj2 = cz3Var4;
                } else {
                    cz3 cz3Var5 = new cz3(b2);
                    cz3Var5.f16638b = ba4Var;
                    cz3Var5.f16639c = kx1Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(cz3Var5);
                    obj2 = cz3Var5;
                }
                lb5.m7923d(kx1Var, (yp1) obj2, ir1Var);
                i6 = i9;
            } else {
                ir1Var.m6874W();
                z5 = z3;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                tg4 tg4Var6 = new tg4((byte) 1);
                tg4Var6.f31147b = hh4Var;
                tg4Var6.f31148c = z5;
                tg4Var6.f31149d = i6;
                tg4Var6.f31150e = z2;
                tg4Var6.f31151f = pg0Var;
                tg4Var6.f31152g = i2;
                tg4Var6.f31153h = i3;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = tg4Var6;
            }
        }
        i4 |= 384;
        i6 = i;
        if ((i2 & 3072) == 0) {
            if (ir1Var.m6892h(z2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i4 |= i11;
        }
        i8 = i4 | 24576;
        if ((196608 & i2) == 0) {
            if (ir1Var.m6894i(pg0Var)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i8 |= i10;
        }
        b = 0;
        if ((74899 & i8) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ir1Var.m6871T(i8 & 1, z4)) {
            if (i12 != 0) {
                z5 = true;
            } else {
                z5 = z3;
            }
            if (i5 != 0) {
                i9 = 0;
            } else {
                i9 = i6;
            }
            iOrdinal = hh4Var.ordinal();
            if (iOrdinal != 0) {
                ir1Var.m6885d0(789052474);
                contextM12815a = ((C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a)).m12815a();
                if (contextM12815a == null) {
                    ir1Var.m6912r(false);
                    yk3VarM6916v2 = ir1Var.m6916v();
                    if (yk3VarM6916v2 != null) {
                        tg4 tg4Var7 = new tg4(b);
                        tg4Var7.f31147b = hh4Var;
                        tg4Var7.f31148c = z5;
                        tg4Var7.f31149d = i9;
                        tg4Var7.f31150e = z2;
                        tg4Var7.f31151f = pg0Var;
                        tg4Var7.f31152g = i2;
                        tg4Var7.f31153h = i3;
                        VarHandle.storeStoreFence();
                        yk3VarM6916v2.f35300d = tg4Var7;
                        return;
                    }
                    return;
                }
                ir1Var.m6912r(false);
            } else if (iOrdinal == 1) {
                ir1Var.m6885d0(-1637116242);
                ir1Var.m6912r(false);
                C0670g.m5864c();
                return;
            } else {
                ir1Var.m6885d0(-1637111038);
                contextM12815a = ((Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                ir1Var.m6912r(false);
            }
            r50 r50Var4 = i41.f21117b;
            b2 = 7;
            context = contextM12815a;
            ba4Var = (ba4) se0.m10708W("system_overlay_host", as4.m3238Q(3, m41.SECONDS), new n14(b2), ir1Var, 6, 6).invoke(ir1Var, 0);
            gr1 gr1VarM4685N4 = dt0.m4685N(ir1Var);
            e94VarM5353c0 = ev0.m5353c0();
            if (e94VarM5353c0 != null) {
                yp1VarMo3783e = e94VarM5353c0.mo3783e();
            } else {
                yp1VarMo3783e = null;
            }
            e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            ga3 ga3VarMo6114j4 = gr1VarM4685N4.mo6114j();
            cj0Var = new cj0();
            cj0Var.f16058a = ga3VarMo6114j4;
            VarHandle.storeStoreFence();
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            zM6890g = ir1Var.m6890g(context);
            Object objM6869O7 = ir1Var.m6869O();
            i50 i50Var4 = ki0.f23136a;
            obj = objM6869O7;
            if (zM6890g) {
                kx1 kx1Var7 = new kx1();
                kx1Var7.f23570a = context;
                if (context instanceof AccessibilityService) {
                    hh4Var2 = hh4.f20583a;
                } else {
                    hh4Var2 = hh4.f20584b;
                }
                kx1Var7.f23571b = new zg4(hh4Var2, 30);
                kx1Var7.f23572c = k43.m7398w(cj0Var);
                kx1Var7.f23573d = k43.m7398w(n40.f25435f);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(kx1Var7);
                obj = kx1Var7;
            } else {
                kx1 kx1Var8 = new kx1();
                kx1Var8.f23570a = context;
                if (context instanceof AccessibilityService) {
                    hh4Var2 = hh4.f20583a;
                } else {
                    hh4Var2 = hh4.f20584b;
                }
                kx1Var8.f23571b = new zg4(hh4Var2, 30);
                kx1Var8.f23572c = k43.m7398w(cj0Var);
                kx1Var8.f23573d = k43.m7398w(n40.f25435f);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(kx1Var8);
                obj = kx1Var8;
            }
            kx1Var = (kx1) obj;
            zg4 zg4Var4 = kx1Var.f23571b;
            zg4Var4.f36071e.setValue(Boolean.valueOf(z5));
            zg4Var4.f36070d.m133i(i9);
            zg4Var4.f36072f.setValue(Boolean.valueOf(z2));
            zg4Var4.f36073g.setValue(false);
            kx1Var.f23572c.setValue(cj0Var);
            kx1Var.f23573d.setValue(pg0Var);
            zM6890g2 = ir1Var.m6890g(ba4Var) | ir1Var.m6890g(kx1Var);
            Object objM6869O8 = ir1Var.m6869O();
            obj2 = objM6869O8;
            if (zM6890g2) {
                cz3 cz3Var6 = new cz3(b2);
                cz3Var6.f16638b = ba4Var;
                cz3Var6.f16639c = kx1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(cz3Var6);
                obj2 = cz3Var6;
            } else {
                cz3 cz3Var7 = new cz3(b2);
                cz3Var7.f16638b = ba4Var;
                cz3Var7.f16639c = kx1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(cz3Var7);
                obj2 = cz3Var7;
            }
            lb5.m7923d(kx1Var, (yp1) obj2, ir1Var);
            i6 = i9;
        } else {
            ir1Var.m6874W();
            z5 = z3;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            tg4 tg4Var8 = new tg4((byte) 1);
            tg4Var8.f31147b = hh4Var;
            tg4Var8.f31148c = z5;
            tg4Var8.f31149d = i6;
            tg4Var8.f31150e = z2;
            tg4Var8.f31151f = pg0Var;
            tg4Var8.f31152g = i2;
            tg4Var8.f31153h = i3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = tg4Var8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public static final void m3812g(View view, zg4 zg4Var, WindowManager windowManager, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-393180373);
        byte b = 2;
        int i2 = (ir1Var.m6894i(view) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(zg4Var) ? 32 : 16;
        }
        int i3 = i2 | (ir1Var.m6894i(windowManager) ? 256 : 128);
        if (ir1Var.m6871T(i3 & 1, (i3 & 147) != 146)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = k43.m7398w(Boolean.FALSE);
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            byte b2 = 6;
            if (((Boolean) sw2Var.getValue()).booleanValue()) {
                ir1Var.m6885d0(-860506930);
                wv1.f33759b.m12424k(6, ir1Var);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-860467529);
                ir1Var.m6912r(false);
            }
            Boolean bool = (Boolean) zg4Var.f36071e.getValue();
            bool.booleanValue();
            int i4 = i3 & 112;
            boolean zM6894i = ir1Var.m6894i(view) | (i4 == 32);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (zM6894i || objM6869O2 == i50Var) {
                jp1 jp1Var = new jp1((byte) 22);
                jp1Var.f22485b = view;
                jp1Var.f22486c = zg4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jp1Var);
                obj = jp1Var;
            }
            lb5.m7933n(view, bool, (wp1) obj, ir1Var);
            vg4 vg4Var = (vg4) se0.m10708W("system_windows", 0L, new n14(b2), ir1Var, 6, 14).invoke(ir1Var, 0);
            C0950nl c0950nl = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
            boolean zM6894i2 = ir1Var.m6894i(view) | (i4 == 32) | ir1Var.m6894i(c0950nl) | ir1Var.m6894i(vg4Var) | ir1Var.m6894i(windowManager);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj2 = objM6869O3;
            if (zM6894i2 || objM6869O3 == i50Var) {
                C0786j5 c0786j5 = new C0786j5(b);
                c0786j5.f22019b = view;
                c0786j5.f22020c = zg4Var;
                c0786j5.f22021d = vg4Var;
                c0786j5.f22022e = windowManager;
                c0786j5.f22024g = c0950nl;
                c0786j5.f22023f = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0786j5);
                obj2 = c0786j5;
            }
            lb5.m7925f(view, zg4Var, windowManager, (yp1) obj2, ir1Var);
            boolean zM6894i3 = ir1Var.m6894i(vg4Var) | ir1Var.m6894i(view) | (i4 == 32) | ir1Var.m6894i(windowManager);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj3 = objM6869O4;
            if (zM6894i3 || objM6869O4 == i50Var) {
                C0869le c0869le = new C0869le((byte) 6);
                c0869le.f23968b = vg4Var;
                c0869le.f23969c = view;
                c0869le.f23970d = zg4Var;
                c0869le.f23971e = windowManager;
                c0869le.f23972f = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0869le);
                obj3 = c0869le;
            }
            lb5.m7923d(view, (yp1) obj3, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            rm0 rm0Var = new rm0((byte) 1);
            rm0Var.f29407c = view;
            rm0Var.f29408d = zg4Var;
            rm0Var.f29409e = windowManager;
            rm0Var.f29406b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = rm0Var;
        }
    }

    /* JADX INFO: renamed from: h */
    public static fe2 m3813h(wa2 wa2Var) {
        ee2 ee2Var;
        ee2 ee2Var2;
        su1 su1Var = su1.f11748a;
        try {
            f70 f70Var = ee2.f2968a;
            int iM2255a = su1.m2255a(wa2Var, "impression_prerequisite", 0);
            f70Var.getClass();
            if (iM2255a == 0) {
                ee2Var = ee2.f2969b;
            } else if (iM2255a != 1) {
                ee2Var = iM2255a != 2 ? ee2.f2969b : ee2.f2971d;
            } else {
                ee2Var = ee2.f2970c;
            }
            int iM2255a2 = su1.m2255a(wa2Var, "click_prerequisite", 0);
            if (iM2255a2 == 0) {
                ee2Var2 = ee2.f2969b;
            } else if (iM2255a2 != 1) {
                ee2Var2 = iM2255a2 != 2 ? ee2.f2969b : ee2.f2971d;
            } else {
                ee2Var2 = ee2.f2970c;
            }
            boolean zM2267a = su1.m2267a(wa2Var, "notification_flow_enabled", false);
            fe2 fe2Var = new fe2();
            fe2Var.f3433a = ee2Var;
            fe2Var.f3434b = ee2Var2;
            fe2Var.f3435c = zM2267a;
            VarHandle.storeStoreFence();
            return fe2Var;
        } catch (Exception e) {
            ArrayList arrayList = i20.m6589n(e).f5884s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0367uz m3814i(wa2 wa2Var, ey0 ey0Var) {
        long j;
        long j2;
        wa2 wa2Var2;
        wa2 wa2Var3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C0316rt c0316rt;
        wa2 wa2Var4;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        wa2 wa2Var5;
        long jMo3530q;
        wa2 wa2Var6;
        wa2 wa2Var7;
        wa2 wa2Var8;
        wa2 wa2Var9;
        ArrayList arrayList = new ArrayList();
        r50 r50Var = i41.f21117b;
        int iMo3526e = 1;
        long jM3238Q = 0;
        long jM6651j = i41.m6651j(0L, as4.m3238Q(1, m41.SECONDS));
        wa2 wa2Var10 = new wa2();
        wa2 wa2Var11 = new wa2();
        wa2 wa2Var12 = new wa2();
        wa2 wa2Var13 = new wa2();
        if (wa2Var != null) {
            Iterator it = ((nl2) wa2Var.f33192a.entrySet()).iterator();
            wa2Var3 = wa2Var13;
            String strMo3532s = "";
            String strMo3532s2 = strMo3532s;
            String strMo3532s3 = strMo3532s2;
            String strMo3532s4 = strMo3532s3;
            String strMo3532s5 = strMo3532s4;
            String strMo3532s6 = strMo3532s5;
            String strMo3532s7 = strMo3532s6;
            int iMo3526e2 = 0;
            C0316rt c0316rt2 = null;
            boolean zMo3523b = false;
            boolean zMo3523b2 = false;
            wa2 wa2VarM2260a = null;
            boolean zMo3523b3 = false;
            wa2 wa2VarM3528l = wa2Var11;
            wa2Var5 = wa2Var12;
            jMo3530q = 0;
            while (((ml2) it).hasNext()) {
                ol2 ol2VarM8344a = ((ml2) it).m8344a();
                String str8 = (String) ol2VarM8344a.getKey();
                ba2 ba2Var = (ba2) ol2VarM8344a.getValue();
                if (str8 != null) {
                    switch (str8.hashCode()) {
                        case -2068795272:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("is_persistent_ad_enabled")) {
                                zMo3523b2 = ba2Var.mo3523b();
                            }
                            break;
                        case -1934789405:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("adRequestUrl")) {
                                strMo3532s3 = ba2Var.mo3532s();
                            }
                            break;
                        case -1664768712:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("inspector_ad_transaction_extras")) {
                                wa2 wa2VarM2260a2 = su1.m2260a(ba2Var);
                                if (wa2VarM2260a2 != null) {
                                    wa2Var5 = wa2VarM2260a2;
                                } else {
                                    try {
                                        wa2Var7 = (wa2) new ou1().m9270c(ba2Var.mo3532s(), new cs4(wa2.class));
                                    } catch (Exception e) {
                                        ArrayList arrayList2 = i20.m6589n(e).f5884s;
                                        String message = e.getMessage();
                                        if (message == null) {
                                            message = e.getClass().getName();
                                        }
                                        arrayList2.add(message);
                                        wa2Var7 = null;
                                    }
                                    if (wa2Var7 != null) {
                                        wa2Var5 = wa2Var7;
                                    }
                                }
                            }
                            break;
                        case -1620470467:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("backend_query_id")) {
                                strMo3532s7 = ba2Var.mo3532s();
                            }
                            break;
                        case -1550155393:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("nofill_urls")) {
                                su1 su1Var = su1.f11748a;
                                ArrayList arrayList3 = ba2Var.m3527g().f26491a;
                                int size = arrayList3.size();
                                int i2 = 0;
                                int i3 = 0;
                                while (i3 < size) {
                                    Object obj = arrayList3.get(i3);
                                    i3++;
                                    int i4 = i2 + 1;
                                    if (i2 < 0) {
                                        kx5.m7735t0();
                                        throw null;
                                    }
                                    Uri uri = Uri.parse(((ba2) obj).mo3532s());
                                    if (uri != null) {
                                        arrayList.add(uri);
                                    }
                                    i2 = i4;
                                }
                            }
                            break;
                        case -1076723292:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("adapter_response_replacement_key")) {
                                strMo3532s5 = ba2Var.mo3532s();
                            }
                            break;
                        case -996058782:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("adResponseHeaders")) {
                                wa2 wa2VarM2260a3 = su1.m2260a(ba2Var);
                                if (wa2VarM2260a3 != null) {
                                    wa2Var3 = wa2VarM2260a3;
                                } else {
                                    try {
                                        wa2Var8 = (wa2) new ou1().m9270c(ba2Var.mo3532s(), new cs4(wa2.class));
                                    } catch (Exception e2) {
                                        ArrayList arrayList4 = i20.m6589n(e2).f5884s;
                                        String message2 = e2.getMessage();
                                        if (message2 == null) {
                                            message2 = e2.getClass().getName();
                                        }
                                        arrayList4.add(message2);
                                        wa2Var8 = null;
                                    }
                                    if (wa2Var8 != null) {
                                        wa2Var3 = wa2Var8;
                                    }
                                }
                            }
                            break;
                        case -878581970:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("gws_query_id")) {
                                strMo3532s = ba2Var.mo3532s();
                            }
                            break;
                        case -729197079:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("is_idless")) {
                                zMo3523b = ba2Var.mo3523b();
                            }
                            break;
                        case -644504941:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("max_parallel_renderers")) {
                                iMo3526e = ba2Var.mo3526e();
                            }
                            break;
                        case -430112607:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("throttle_configuration")) {
                                wa2VarM2260a = su1.m2260a(ba2Var);
                            }
                            break;
                        case -46576386:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("latency")) {
                                jMo3530q = ba2Var.mo3530q();
                            }
                            break;
                        case 532938054:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("adResponseBody")) {
                                strMo3532s6 = ba2Var.mo3532s();
                            }
                            break;
                        case 864007346:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("public_error")) {
                                if (!(ba2Var instanceof sa2)) {
                                    try {
                                        su1 su1Var2 = su1.f11748a;
                                        int iMo3526e3 = ba2Var.m3528l().m12186z("code").mo3526e();
                                        String strM2257a = su1.m2257a(ba2Var.m3528l(), "description");
                                        C0316rt c0316rt3 = new C0316rt();
                                        c0316rt3.f10918a = iMo3526e3;
                                        c0316rt3.f10919b = strM2257a;
                                        VarHandle.storeStoreFence();
                                        c0316rt2 = c0316rt3;
                                    } catch (Exception e3) {
                                        ArrayList arrayList5 = i20.m6589n(e3).f5884s;
                                        String message3 = e3.getMessage();
                                        if (message3 == null) {
                                            message3 = e3.getClass().getName();
                                        }
                                        arrayList5.add(message3);
                                        wa2Var10 = wa2Var6;
                                        c0316rt2 = null;
                                    }
                                    break;
                                }
                                wa2Var10 = wa2Var6;
                                c0316rt2 = null;
                            }
                            break;
                        case 868720662:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("response_info_extras")) {
                                wa2VarM3528l = ba2Var.m3528l();
                            }
                            break;
                        case 961728366:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("adRequestPostBody")) {
                                strMo3532s4 = ba2Var.mo3532s();
                            }
                            break;
                        case 1128093708:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("analytics_query_ad_event_id")) {
                                strMo3532s2 = ba2Var.mo3532s();
                            }
                            break;
                        case 1282999366:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("refresh_load_delay_time_interval")) {
                                r50 r50Var2 = i41.f21117b;
                                jM6651j = as4.m3238Q(ba2Var.mo3526e(), m41.SECONDS);
                            }
                            break;
                        case 1474602697:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("is_cross_process_ad_enabled")) {
                                zMo3523b3 = ba2Var.mo3523b();
                            }
                            break;
                        case 1676268331:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("response_code")) {
                                iMo3526e2 = ba2Var.mo3526e();
                            }
                            break;
                        case 1722800622:
                            wa2Var6 = wa2Var10;
                            if (str8.equals("bidding_data")) {
                                wa2Var10 = su1.m2260a(ba2Var);
                                if (wa2Var10 == null) {
                                    try {
                                        wa2Var9 = (wa2) new ou1().m9270c(ba2Var.mo3532s(), new cs4(wa2.class));
                                    } catch (Exception e4) {
                                        ArrayList arrayList6 = i20.m6589n(e4).f5884s;
                                        String message4 = e4.getMessage();
                                        if (message4 == null) {
                                            message4 = e4.getClass().getName();
                                        }
                                        arrayList6.add(message4);
                                        wa2Var9 = null;
                                    }
                                    if (wa2Var9 != null) {
                                        wa2Var10 = wa2Var9;
                                    }
                                }
                            }
                            break;
                        case 1816824233:
                            if (!str8.equals("refresh_interval")) {
                                continue;
                            } else {
                                r50 r50Var3 = i41.f21117b;
                                jM3238Q = as4.m3238Q(ba2Var.mo3526e(), m41.SECONDS);
                            }
                            break;
                        default:
                            continue;
                    }
                    wa2Var10 = wa2Var6;
                }
            }
            str = strMo3532s;
            str6 = strMo3532s2;
            str4 = strMo3532s3;
            str5 = strMo3532s4;
            str3 = strMo3532s5;
            str7 = strMo3532s7;
            i = iMo3526e2;
            z2 = zMo3523b2;
            wa2Var4 = wa2VarM2260a;
            z3 = zMo3523b3;
            j = jM6651j;
            wa2Var2 = wa2VarM3528l;
            str2 = strMo3532s6;
            c0316rt = c0316rt2;
            z = zMo3523b;
            j2 = jM3238Q;
        } else {
            j = jM6651j;
            j2 = 0;
            wa2Var2 = wa2Var11;
            wa2Var3 = wa2Var13;
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            str5 = str4;
            str6 = str5;
            str7 = str6;
            c0316rt = null;
            wa2Var4 = null;
            z = false;
            z2 = false;
            i = 0;
            z3 = false;
            wa2Var5 = wa2Var12;
            jMo3530q = 0;
        }
        int i5 = iMo3526e;
        String str9 = (String) ey0Var.m13553a("gads:fullscreen_on_show_trigger", "create", C0033as.a$13);
        EnumC0350tz.f12121b.getClass();
        EnumC0350tz enumC0350tz = (EnumC0350tz) EnumC0350tz.f12122c.get(str9);
        if (enumC0350tz == null) {
            enumC0350tz = EnumC0350tz.ON_CREATE;
        }
        C0367uz c0367uz = new C0367uz();
        c0367uz.f12511a = str3;
        c0367uz.f12512b = str5;
        c0367uz.f12513c = str4;
        c0367uz.f12514d = str2;
        c0367uz.f12515e = wa2Var3;
        c0367uz.f12516f = wa2Var10;
        c0367uz.f12517g = c0316rt;
        c0367uz.f12518h = str;
        c0367uz.f12519i = wa2Var5;
        c0367uz.f12520j = z;
        c0367uz.f12521k = jMo3530q;
        c0367uz.f12522l = i5;
        c0367uz.f12523m = arrayList;
        c0367uz.f12524n = j2;
        c0367uz.f12525o = j;
        c0367uz.f12526p = i;
        c0367uz.f12527q = wa2Var2;
        c0367uz.f12528r = str6;
        c0367uz.f12529s = z2;
        c0367uz.f12530t = wa2Var4;
        c0367uz.f12531u = z3;
        c0367uz.f12532v = enumC0350tz;
        c0367uz.f12533w = str7;
        VarHandle.storeStoreFence();
        return c0367uz;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3815j(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX INFO: renamed from: k */
    public static double m3816k(double d) {
        int i;
        double dPow = Math.pow(Math.abs(d), 0.42d);
        if (d < 0.0d) {
            i = -1;
        } else {
            i = d == 0.0d ? 0 : 1;
        }
        return ((((double) i) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX INFO: renamed from: l */
    public static final void m3817l(b70 b70Var, w01 w01Var) {
        w60 w60Var = new w60((byte) 2);
        w60Var.f33119b = w01Var;
        VarHandle.storeStoreFence();
        b70Var.m3500x(w60Var);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m3818m(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: n */
    public static rv1 m3819n(rv1 rv1Var) {
        double dRint = Math.rint(rv1Var.f29661b);
        return (((90.0d > dRint ? 1 : (90.0d == dRint ? 0 : -1)) <= 0 && (dRint > 111.0d ? 1 : (dRint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(rv1Var.f29662c) > 16.0d ? 1 : (Math.rint(rv1Var.f29662c) == 16.0d ? 0 : -1)) > 0) && (Math.rint(rv1Var.f29663d) < 65.0d)) ? new rv1(AbstractC1356y5.m12899H(rv1Var.f29661b, rv1Var.f29662c, 70.0d)) : rv1Var;
    }

    /* JADX INFO: renamed from: o */
    public static final ro0 m3820o(ro0 ro0Var, ro0 ro0Var2, boolean z) {
        Object obj = Boolean.FALSE;
        byte b = 8;
        boolean zBooleanValue = ((Boolean) ro0Var.fold(new en0(b), obj)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ro0Var2.fold(new en0(b), obj)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return ro0Var.plus(ro0Var2);
        }
        ql3 ql3Var = new ql3();
        ql3Var.f28555a = ro0Var2;
        C0823k5 c0823k5 = new C0823k5((byte) 5);
        c0823k5.f22893c = ql3Var;
        c0823k5.f22892b = z;
        VarHandle.storeStoreFence();
        Object obj2 = r71.f29063a;
        ro0 ro0Var3 = (ro0) ro0Var.fold(c0823k5, obj2);
        if (zBooleanValue2) {
            ql3Var.f28555a = ((ro0) ql3Var.f28555a).fold(new en0((byte) 9), obj2);
        }
        return ro0Var3.plus((ro0) ql3Var.f28555a);
    }

    /* JADX INFO: renamed from: q */
    public static ar3 m3821q(View view) {
        AutofillId autofillId = view.getAutofillId();
        ar3 ar3Var = new ar3((byte) 9);
        ar3Var.f14813b = autofillId;
        VarHandle.storeStoreFence();
        return ar3Var;
    }

    /* JADX INFO: renamed from: s */
    public static final int m3822s(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* JADX INFO: renamed from: t */
    public static final Paint m3823t(C1253ve c1253ve) {
        if (c1253ve == null) {
            p32.m9361a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + rl3.m10361a(c1253ve.getClass()).m10248a());
        }
        return (Paint) c1253ve.f32549b;
    }

    /* JADX INFO: renamed from: u */
    public static final b70 m3824u(wm0 wm0Var) {
        Unsafe unsafe;
        b70 b70Var;
        b70 b70Var2;
        if (!(wm0Var instanceof f01)) {
            return new b70(1, wm0Var);
        }
        f01 f01Var = (f01) wm0Var;
        long j = f01.f18625h;
        while (true) {
            unsafe = AbstractC1078qo.f28633a;
            Object objectVolatile = unsafe.getObjectVolatile(f01Var, j);
            b70Var = null;
            C0641f8 c0641f8 = g01.f19458b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(f01Var, j, c0641f8);
                b70Var2 = null;
                break;
            }
            if (objectVolatile instanceof b70) {
                if (unsafe.compareAndSwapObject(f01Var, f01.f18625h, objectVolatile, c0641f8)) {
                    b70Var2 = (b70) objectVolatile;
                    break;
                }
            } else if (objectVolatile != c0641f8 && !(objectVolatile instanceof Throwable)) {
                nm0.m8798k(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (b70Var2 != null) {
            long j2 = b70.f15137h;
            Object objectVolatile2 = unsafe.getObjectVolatile(b70Var2, j2);
            if (!(objectVolatile2 instanceof df0) || ((df0) objectVolatile2).f17004d == null) {
                unsafe.putIntVolatile(b70Var2, b70.f15135f, 536870911);
                unsafe.putObjectVolatile(b70Var2, j2, C1206u4.f31639a);
                b70Var = b70Var2;
            } else {
                b70Var2.m3492o();
            }
            if (b70Var != null) {
                return b70Var;
            }
        }
        return new b70(2, wm0Var);
    }

    /* JADX INFO: renamed from: w */
    public static double m3825w(double[] dArr) {
        double d = dArr[0];
        double[][] dArr2 = f15765g;
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double dM3816k = m3816k(d6);
        double dM3816k2 = m3816k(d7);
        double dM3816k3 = m3816k(d8);
        return Math.atan2(d55.m4361f(dM3816k3, 2.0d, dM3816k + dM3816k2, 9.0d), ((((-12.0d) * dM3816k2) + (dM3816k * 11.0d)) + dM3816k3) / 11.0d);
    }

    /* JADX INFO: renamed from: x */
    public static double m3826x(double d) {
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

    /* JADX INFO: renamed from: y */
    public static boolean m3827y(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    /* JADX INFO: renamed from: p */
    public Method mo3828p(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    /* JADX INFO: renamed from: r */
    public Constructor mo3829r(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    /* JADX INFO: renamed from: v */
    public String[] mo3830v(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    /* JADX INFO: renamed from: z */
    public boolean mo3831z(Class cls) {
        return false;
    }
}
