package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e51 {

    /* JADX INFO: renamed from: b */
    public static final yj5 f17692b;

    /* JADX INFO: renamed from: c */
    public static final jk5 f17693c;

    /* JADX INFO: renamed from: d */
    public static final yj5 f17694d;

    /* JADX INFO: renamed from: e */
    public static final jk5 f17695e;

    /* JADX INFO: renamed from: f */
    public static Boolean f17696f = null;

    /* JADX INFO: renamed from: g */
    public static String f17697g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f17698h = false;

    /* JADX INFO: renamed from: i */
    public static int f17699i = -1;

    /* JADX INFO: renamed from: j */
    public static Boolean f17700j;

    /* JADX INFO: renamed from: k */
    public static final ThreadLocal f17701k = new ThreadLocal();

    /* JADX INFO: renamed from: l */
    public static final C0753i8 f17702l = new C0753i8(10);

    /* JADX INFO: renamed from: m */
    public static final aj5 f17703m = new aj5(22);

    /* JADX INFO: renamed from: n */
    public static am6 f17704n;

    /* JADX INFO: renamed from: o */
    public static pn6 f17705o;

    /* JADX INFO: renamed from: a */
    public Context f17706a;

    static {
        byte b = 26;
        f17692b = new yj5(b);
        f17693c = new jk5(b);
        byte b2 = 27;
        f17694d = new yj5(b2);
        f17695e = new jk5(b2);
    }

    /* JADX INFO: renamed from: a */
    public static int m4926a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC1356y5.m12927u(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0265 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x026f A[Catch: all -> 0x026d, TRY_ENTER, TryCatch #6 {, blocks: (B:34:0x00f3, B:36:0x00f9, B:37:0x00fb, B:104:0x026f, B:105:0x0276), top: B:152:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:131:0x0300 A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ee, B:108:0x0279, B:109:0x0280, B:112:0x0283, B:113:0x0284, B:114:0x028b, B:131:0x0300, B:132:0x0320, B:115:0x028c, B:117:0x02b4, B:119:0x02ca, B:129:0x02f8, B:130:0x02ff, B:133:0x0321, B:134:0x036e), top: B:150:0x0042, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #3 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ee, B:108:0x0279, B:109:0x0280, B:112:0x0283, B:113:0x0284, B:114:0x028b, B:131:0x0300, B:132:0x0320, B:115:0x028c, B:117:0x02b4, B:119:0x02ca, B:129:0x02f8, B:130:0x02ff, B:133:0x0321, B:134:0x036e), top: B:150:0x0042, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9 A[Catch: all -> 0x026d, TryCatch #6 {, blocks: (B:34:0x00f3, B:36:0x00f9, B:37:0x00fb, B:104:0x026f, B:105:0x0276), top: B:152:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TRY_ENTER, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0105 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TRY_ENTER, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b0 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01bb A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ee A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0201 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0209 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0220 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0222 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0232 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0247 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0255 A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x025d A[Catch: all -> 0x016d, a51 -> 0x0170, RemoteException -> 0x0173, TryCatch #7 {a51 -> 0x0170, RemoteException -> 0x0173, all -> 0x016d, blocks: (B:33:0x00f2, B:39:0x00fe, B:41:0x0105, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x014e, B:58:0x0159, B:66:0x0189, B:68:0x0191, B:69:0x019d, B:70:0x01a4, B:65:0x0176, B:73:0x01a7, B:74:0x01a8, B:75:0x01af, B:76:0x01b0, B:77:0x01b7, B:80:0x01ba, B:81:0x01bb, B:83:0x01ee, B:85:0x0201, B:87:0x0209, B:93:0x0241, B:95:0x0247, B:96:0x0255, B:97:0x025c, B:88:0x0218, B:89:0x021f, B:91:0x0222, B:92:0x0232, B:98:0x025d, B:99:0x0264, B:100:0x0265, B:101:0x026c, B:107:0x0278), top: B:153:0x00f2 }] */
    /* JADX INFO: renamed from: c */
    public static e51 m4927c(Context context, d51 d51Var, String str) throws a51 {
        e51 e51Var;
        Cursor cursor;
        int i;
        Boolean bool;
        am6 am6VarM4932h;
        int i2;
        a02 a02VarM3048N;
        Object objM11710J;
        cj6 cj6Var;
        pn6 pn6Var;
        cj6 cj6Var2;
        boolean z;
        a02 a02VarM9588N;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a51("null application Context");
        }
        ThreadLocal threadLocal = f17701k;
        cj6 cj6Var3 = (cj6) threadLocal.get();
        cj6 cj6Var4 = new cj6();
        threadLocal.set(cj6Var4);
        C0753i8 c0753i8 = f17702l;
        Long l = (Long) c0753i8.get();
        long jLongValue = l.longValue();
        try {
            c0753i8.set(Long.valueOf(SystemClock.uptimeMillis()));
            c51 c51VarMo4355a = d51Var.mo4355a(context, str, f17703m);
            int i3 = c51VarMo4355a.f15808a;
            int i4 = c51VarMo4355a.f15809b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i3).length() + 19 + str.length() + 1 + String.valueOf(i4).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            Log.i("DynamiteModule", sb.toString());
            int i5 = c51VarMo4355a.f15810c;
            if (i5 != 0) {
                if (i5 != -1) {
                    if (i5 == 1 || c51VarMo4355a.f15809b != 0) {
                        if (i5 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            e51 e51Var2 = new e51();
                            e51Var2.f17706a = applicationContext;
                            if (jLongValue == 0) {
                                c0753i8.remove();
                            } else {
                                c0753i8.set(l);
                            }
                            cursor2 = cj6Var4.f16070a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(cj6Var3);
                            return e51Var2;
                        }
                        if (i5 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i5);
                            throw new a51(sb2.toString());
                        }
                        try {
                            i = c51VarMo4355a.f15809b;
                            try {
                                synchronized (e51.class) {
                                    if (m4929e(context)) {
                                        throw new a51("Remote loading disabled");
                                    }
                                    bool = f17696f;
                                }
                                if (bool != null) {
                                    throw new a51("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 40 + String.valueOf(i).length());
                                    sb3.append("Selected remote version of ");
                                    sb3.append(str);
                                    sb3.append(", version >= ");
                                    sb3.append(i);
                                    Log.i("DynamiteModule", sb3.toString());
                                    synchronized (e51.class) {
                                        pn6Var = f17705o;
                                    }
                                    if (pn6Var != null) {
                                        throw new a51("DynamiteLoaderV2 was not cached.");
                                    }
                                    cj6Var2 = (cj6) threadLocal.get();
                                    if (cj6Var2 != null || cj6Var2.f16070a == null) {
                                        throw new a51("No result cursor");
                                    }
                                    Context applicationContext2 = context.getApplicationContext();
                                    Cursor cursor3 = cj6Var2.f16070a;
                                    v23.m11711K(null);
                                    synchronized (e51.class) {
                                        z = f17699i >= 2;
                                    }
                                    if (z) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        a02VarM9588N = pn6Var.m9589O(v23.m11711K(applicationContext2), str, i, v23.m11711K(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        a02VarM9588N = pn6Var.m9588N(v23.m11711K(applicationContext2), str, i, v23.m11711K(cursor3));
                                    }
                                    Context context2 = (Context) v23.m11710J(a02VarM9588N);
                                    if (context2 == null) {
                                        throw new a51("Failed to get module context");
                                    }
                                    e51Var = new e51();
                                    e51Var.f17706a = context2;
                                    VarHandle.storeStoreFence();
                                } else {
                                    StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i).length());
                                    sb4.append("Selected remote version of ");
                                    sb4.append(str);
                                    sb4.append(", version >= ");
                                    sb4.append(i);
                                    Log.i("DynamiteModule", sb4.toString());
                                    am6VarM4932h = m4932h(context);
                                    if (am6VarM4932h != null) {
                                        throw new a51("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel parcelM7548E = am6VarM4932h.m7548E(am6VarM4932h.m7550G(), 6);
                                    i2 = parcelM7548E.readInt();
                                    parcelM7548E.recycle();
                                    if (i2 >= 3) {
                                        cj6Var = (cj6) threadLocal.get();
                                        if (cj6Var != null) {
                                            throw new a51("No cached result cursor holder");
                                        }
                                        a02VarM3048N = am6VarM4932h.m3051Q(v23.m11711K(context), str, i, v23.m11711K(cj6Var.f16070a));
                                    } else if (i2 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        a02VarM3048N = am6VarM4932h.m3049O(v23.m11711K(context), str, i);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        a02VarM3048N = am6VarM4932h.m3048N(v23.m11711K(context), str, i);
                                    }
                                    objM11710J = v23.m11710J(a02VarM3048N);
                                    if (objM11710J != null) {
                                        throw new a51("Failed to load remote module.");
                                    }
                                    e51Var = new e51();
                                    e51Var.f17706a = (Context) objM11710J;
                                    VarHandle.storeStoreFence();
                                }
                                if (jLongValue == 0) {
                                    f17702l.remove();
                                } else {
                                    f17702l.set(l);
                                }
                                cursor = cj6Var4.f16070a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                f17701k.set(cj6Var3);
                                return e51Var;
                            } catch (a51 e) {
                                throw e;
                            } catch (RemoteException e2) {
                                throw new a51("Failed to load remote module.", e2);
                            } catch (Throwable th) {
                                throw new a51("Failed to load remote module.", th);
                            }
                        } catch (a51 e3) {
                            String message = e3.getMessage();
                            StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb5.append("Failed to load remote module: ");
                            sb5.append(message);
                            Log.w("DynamiteModule", sb5.toString());
                            int i6 = c51VarMo4355a.f15808a;
                            if (i6 != 0) {
                                z34 z34Var = new z34();
                                z34Var.f35741a = i6;
                                VarHandle.storeStoreFence();
                                if (d51Var.mo4355a(context, str, z34Var).f15810c == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    e51Var = new e51();
                                    e51Var.f17706a = applicationContext;
                                }
                            }
                            throw new a51("Remote load failed. No local fallback found.", e3);
                        }
                    }
                } else if (c51VarMo4355a.f15808a != 0) {
                    i5 = -1;
                    if (i5 == 1) {
                    }
                    if (i5 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        e51 e51Var3 = new e51();
                        e51Var3.f17706a = applicationContext;
                        if (jLongValue == 0) {
                            c0753i8.remove();
                        } else {
                            c0753i8.set(l);
                        }
                        cursor2 = cj6Var4.f16070a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(cj6Var3);
                        return e51Var3;
                    }
                    if (i5 == 1) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(i5).length() + 36);
                        sb6.append("VersionPolicy returned invalid code:");
                        sb6.append(i5);
                        throw new a51(sb6.toString());
                    }
                    i = c51VarMo4355a.f15809b;
                    synchronized (e51.class) {
                        if (m4929e(context)) {
                            throw new a51("Remote loading disabled");
                        }
                        bool = f17696f;
                        if (bool != null) {
                            throw new a51("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb7 = new StringBuilder(str.length() + 40 + String.valueOf(i).length());
                            sb7.append("Selected remote version of ");
                            sb7.append(str);
                            sb7.append(", version >= ");
                            sb7.append(i);
                            Log.i("DynamiteModule", sb7.toString());
                            synchronized (e51.class) {
                                pn6Var = f17705o;
                                if (pn6Var != null) {
                                    throw new a51("DynamiteLoaderV2 was not cached.");
                                }
                                cj6Var2 = (cj6) threadLocal.get();
                                if (cj6Var2 != null) {
                                }
                                throw new a51("No result cursor");
                            }
                        }
                        StringBuilder sb8 = new StringBuilder(str.length() + 40 + String.valueOf(i).length());
                        sb8.append("Selected remote version of ");
                        sb8.append(str);
                        sb8.append(", version >= ");
                        sb8.append(i);
                        Log.i("DynamiteModule", sb8.toString());
                        am6VarM4932h = m4932h(context);
                        if (am6VarM4932h != null) {
                            throw new a51("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelM7548E2 = am6VarM4932h.m7548E(am6VarM4932h.m7550G(), 6);
                        i2 = parcelM7548E2.readInt();
                        parcelM7548E2.recycle();
                        if (i2 >= 3) {
                            cj6Var = (cj6) threadLocal.get();
                            if (cj6Var != null) {
                                throw new a51("No cached result cursor holder");
                            }
                            a02VarM3048N = am6VarM4932h.m3051Q(v23.m11711K(context), str, i, v23.m11711K(cj6Var.f16070a));
                        } else if (i2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            a02VarM3048N = am6VarM4932h.m3049O(v23.m11711K(context), str, i);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            a02VarM3048N = am6VarM4932h.m3048N(v23.m11711K(context), str, i);
                        }
                        objM11710J = v23.m11710J(a02VarM3048N);
                        if (objM11710J != null) {
                            throw new a51("Failed to load remote module.");
                        }
                        e51Var = new e51();
                        e51Var.f17706a = (Context) objM11710J;
                        VarHandle.storeStoreFence();
                        if (jLongValue == 0) {
                            f17702l.remove();
                        } else {
                            f17702l.set(l);
                        }
                        cursor = cj6Var4.f16070a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f17701k.set(cj6Var3);
                        return e51Var;
                    }
                }
            }
            int i7 = c51VarMo4355a.f15808a;
            int i8 = c51VarMo4355a.f15809b;
            StringBuilder sb9 = new StringBuilder(str.length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i8).length() + 1);
            sb9.append("No acceptable module ");
            sb9.append(str);
            sb9.append(" found. Local version is ");
            sb9.append(i7);
            sb9.append(" and remote version is ");
            sb9.append(i8);
            sb9.append(".");
            throw new a51(sb9.toString());
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                f17702l.remove();
            } else {
                f17702l.set(l);
            }
            Cursor cursor4 = cj6Var4.f16070a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f17701k.set(cj6Var3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x009c A[Catch: all -> 0x003b, TryCatch #7 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:49:0x00a5, B:17:0x0040, B:19:0x0046, B:21:0x004c, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:40:0x0084, B:41:0x008c, B:39:0x0076, B:44:0x008f, B:47:0x0092, B:48:0x009c, B:18:0x0043), top: B:143:0x002b, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0174  */
    /* JADX INFO: renamed from: d */
    public static int m4928d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i;
        Cursor cursor;
        try {
            synchronized (e51.class) {
                Boolean bool = f17696f;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m4931g(classLoader);
                                    } catch (a51 unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m4929e(context)) {
                                        return 0;
                                    }
                                    if (f17698h) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM4930f = m4930f(context, str, z, true);
                                                String str2 = f17697g;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM13020U = y70.m13020U();
                                                    if (classLoaderM13020U == null) {
                                                        String str3 = f17697g;
                                                        y42.m12854a0(str3);
                                                        classLoaderM13020U = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    }
                                                    m4931g(classLoaderM13020U);
                                                    declaredField.set(null, classLoaderM13020U);
                                                    f17696f = bool2;
                                                    return iM4930f;
                                                }
                                                return iM4930f;
                                            } catch (a51 unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f17696f = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String string = e.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m4930f(context, str, z, false);
                    } catch (a51 e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                am6 am6VarM4932h = m4932h(context);
                try {
                    if (am6VarM4932h == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelM7548E = am6VarM4932h.m7548E(am6VarM4932h.m7550G(), 6);
                        int i2 = parcelM7548E.readInt();
                        parcelM7548E.recycle();
                        if (i2 >= 3) {
                            ThreadLocal threadLocal = f17701k;
                            cj6 cj6Var = (cj6) threadLocal.get();
                            if (cj6Var != null && (cursor = cj6Var.f16070a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) v23.m11710J(am6VarM4932h.m3050P(v23.m11711K(context), str, z, ((Long) f17702l.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i = cursor3.getInt(0);
                                        if (i > 0) {
                                            cj6 cj6Var2 = (cj6) threadLocal.get();
                                            if (cj6Var2 == null || cj6Var2.f16070a != null) {
                                                z2 = false;
                                            } else {
                                                cj6Var2.f16070a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e3) {
                                    remoteException = e3;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            v23 v23VarM11711K = v23.m11711K(context);
                            Parcel parcelM7550G = am6VarM4932h.m7550G();
                            nv5.m8863b(parcelM7550G, v23VarM11711K);
                            parcelM7550G.writeString(str);
                            parcelM7550G.writeInt(z ? 1 : 0);
                            Parcel parcelM7548E2 = am6VarM4932h.m7548E(parcelM7550G, 5);
                            i = parcelM7548E2.readInt();
                            parcelM7548E2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            v23 v23VarM11711K2 = v23.m11711K(context);
                            Parcel parcelM7550G2 = am6VarM4932h.m7550G();
                            nv5.m8863b(parcelM7550G2, v23VarM11711K2);
                            parcelM7550G2.writeString(str);
                            parcelM7550G2.writeInt(z ? 1 : 0);
                            Parcel parcelM7548E3 = am6VarM4932h.m7548E(parcelM7550G2, 3);
                            i = parcelM7548E3.readInt();
                            parcelM7548E3.recycle();
                        }
                        return i;
                    } catch (RemoteException e4) {
                        remoteException = e4;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                y42.m12854a0(context);
                throw th5;
            } catch (Exception e5) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4929e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f17700j)) {
            return true;
        }
        boolean z = false;
        if (f17700j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (qt1.f28785b.m10123b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f17700j = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f17698h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public static int m4930f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f17702l.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr[i2] = null;
                                        } else if (type == 1) {
                                            objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (e51.class) {
                                    try {
                                        f17697g = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f17699i = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            f17698h = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                cj6 cj6Var = (cj6) f17701k.get();
                                if (cj6Var == null || cj6Var.f16070a != null) {
                                    z4 = false;
                                } else {
                                    cj6Var.f16070a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new a51("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i3;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof a51) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new a51(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a51("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m4931g(ClassLoader classLoader) throws a51 {
        try {
            pn6 pn6Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                pn6Var = iInterfaceQueryLocalInterface instanceof pn6 ? (pn6) iInterfaceQueryLocalInterface : new pn6(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", (byte) 2);
            }
            f17705o = pn6Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new a51("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static am6 m4932h(Context context) {
        am6 am6Var;
        synchronized (e51.class) {
            am6 am6Var2 = f17704n;
            if (am6Var2 != null) {
                return am6Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    am6Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    am6Var = iInterfaceQueryLocalInterface instanceof am6 ? (am6) iInterfaceQueryLocalInterface : new am6(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", (byte) 2);
                }
                if (am6Var != null) {
                    f17704n = am6Var;
                    return am6Var;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m4933b(String str) throws a51 {
        try {
            return (IBinder) this.f17706a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new a51("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
