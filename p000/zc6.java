package p000;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.UserManager;
import android.view.View;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zc6 {

    /* JADX INFO: renamed from: b */
    public static UserManager f35984b = null;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f35985c = false;

    /* JADX INFO: renamed from: d */
    public static final pg0 f35986d = new pg0(131034533, false, new xg0(19));

    /* JADX INFO: renamed from: e */
    public static final int[] f35987e = {13, 15, 14};

    /* JADX INFO: renamed from: f */
    public static final u11 f35988f;

    /* JADX INFO: renamed from: g */
    public static final z45 f35989g;

    /* JADX INFO: renamed from: h */
    public static final Object f35990h;

    /* JADX INFO: renamed from: i */
    public static int f35991i;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35992a;

    static {
        u11 u11Var = new u11();
        VarHandle.storeStoreFence();
        f35988f = u11Var;
        f35989g = new z45((byte) 17);
        f35990h = new Object();
    }

    public /* synthetic */ zc6(byte b) {
        this.f35992a = b;
    }

    /* JADX INFO: renamed from: B */
    public static final float[] m13505B(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    /* JADX INFO: renamed from: C */
    public static final void m13506C(int i) {
        throw new y92(kx5.m7687R(-1, "Json input is too nested and may be impossible to parse without stack overflow.", null, c75.m3878j("Current nesting limit is ", i, ". To adjust it, use 'maxNestingDepth' in 'Json {}' builder."), null), null);
    }

    /* JADX INFO: renamed from: D */
    public static float m13507D(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX INFO: renamed from: E */
    public static final float[] m13508E(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    /* JADX INFO: renamed from: F */
    public static final float[] m13509F(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    /* JADX INFO: renamed from: G */
    public static String m13510G(AssetFileDescriptor assetFileDescriptor, int i, boolean z) throws IOException {
        try {
            m13532r(assetFileDescriptor);
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor.getLength() <= i) {
                i = length;
            } else if (!z) {
                throw new yj2("AssetFileDescriptor.getLength() should be <= " + i);
            }
            byte[] bArr = new byte[i];
            ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptor.getParcelFileDescriptor();
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                int i2 = 0;
                while (i2 < i) {
                    int i3 = fileInputStream.read(bArr, i2, i - i2);
                    if (i3 < 0) {
                        break;
                    }
                    i2 += i3;
                }
                if (i2 != i) {
                    throw new IOException("Couldn't read " + i + " bytes from the AssetFileDescriptor");
                }
                parcelFileDescriptor.close();
                assetFileDescriptor.close();
                if (z) {
                    i--;
                    while (i >= 0) {
                        if ((bArr[i] & (-64)) == -128) {
                            i--;
                        }
                    }
                    i = -1;
                }
                return new String(bArr, 0, i, StandardCharsets.UTF_8);
            } catch (Throwable th) {
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            assetFileDescriptor.close();
            throw th3;
        }
        assetFileDescriptor.close();
        throw th3;
    }

    /* JADX INFO: renamed from: H */
    public static final View m13511H(px0 px0Var) {
        if (!((mt2) px0Var).f25195a.f25208n) {
            q32.m9721c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) zf2.m13548a(sc6.m10652X(px0Var));
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118  */
    /* JADX INFO: renamed from: I */
    public static final xl4 m13512I(xl4 xl4Var, df2 df2Var) {
        long j;
        al4 al4Var;
        int i;
        int i2;
        ol4 ol4Var;
        pa4 pa4Var = xl4Var.f34389a;
        yk4 yk4Var = qa4.f28348d;
        yk4 yk4Var2 = pa4Var.f27478a;
        if (yk4Var2.equals(ig1.f21365D)) {
            yk4Var2 = qa4.f28348d;
        }
        yk4 yk4Var3 = yk4Var2;
        long j2 = pa4Var.f27479b;
        cm4[] cm4VarArr = bm4.f15418b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = qa4.f28345a;
        }
        long j3 = j2;
        xm1 xm1Var = pa4Var.f27480c;
        if (xm1Var == null) {
            xm1Var = xm1.f34413f;
        }
        xm1 xm1Var2 = xm1Var;
        tm1 tm1Var = pa4Var.f27481d;
        tm1 tm1VarM11064a = tm1.m11064a(tm1Var != null ? tm1Var.f31237a : 0);
        um1 um1Var = pa4Var.f27482e;
        um1 um1VarM11584a = um1.m11584a(um1Var != null ? um1Var.f31990a : 65535);
        bm1 bm1Var = pa4Var.f27483f;
        if (bm1Var == null) {
            bm1Var = bm1.f15409a;
        }
        bm1 bm1Var2 = bm1Var;
        String str = pa4Var.f27484g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = pa4Var.f27485h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = qa4.f28346b;
        }
        long j5 = j4;
        C0471ay c0471ay = pa4Var.f27486i;
        float f = c0471ay != null ? c0471ay.f14938a : 0.0f;
        float f2 = Float.isNaN(f) ? 0.0f : f;
        C0471ay c0471ay2 = new C0471ay();
        c0471ay2.f14938a = f2;
        VarHandle.storeStoreFence();
        zk4 zk4Var = pa4Var.f27487j;
        if (zk4Var == null) {
            zk4Var = zk4.f36160c;
        }
        zk4 zk4Var2 = zk4Var;
        zm2 zm2VarM7249x = pa4Var.f27488k;
        if (zm2VarM7249x == null) {
            zm2 zm2Var = zm2.f36182c;
            zm2VarM7249x = kb3.f23056a.m7249x();
        }
        zm2 zm2Var2 = zm2VarM7249x;
        long j6 = pa4Var.f27489l;
        if (j6 == 16) {
            j6 = qa4.f28347c;
        }
        long j7 = j6;
        uj4 uj4Var = pa4Var.f27490m;
        if (uj4Var == null) {
            uj4Var = uj4.f31938b;
        }
        uj4 uj4Var2 = uj4Var;
        m44 m44Var = pa4Var.f27491n;
        if (m44Var == null) {
            m44Var = m44.f24642d;
        }
        m44 m44Var2 = m44Var;
        qq2 qq2Var = pa4Var.f27492o;
        if (qq2Var == null) {
            qq2Var = uf1.f31820j;
        }
        pa4 pa4Var2 = new pa4(yk4Var3, j3, xm1Var2, tm1VarM11064a, um1VarM11584a, bm1Var2, str2, j5, c0471ay2, zk4Var2, zm2Var2, j7, uj4Var2, m44Var2, qq2Var);
        r73 r73Var = xl4Var.f34390b;
        int i3 = s73.f29943b;
        int i4 = r73Var.f29064a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = r73Var.f29065b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = df2Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = r73Var.f29066c;
            if ((j & 1095216660480L) == 0) {
                j = s73.f29942a;
            }
            al4Var = r73Var.f29067d;
            if (al4Var == null) {
                al4Var = al4.f14615c;
            }
            mb3 mb3Var = r73Var.f29068e;
            dl2 dl2Var = r73Var.f29069f;
            i = r73Var.f29070g;
            if (i == 0) {
                i = yk2.f35295b;
            }
            i2 = r73Var.f29071h;
            if (i2 == 0) {
                i2 = 1;
            }
            ol4Var = r73Var.f29072i;
            if (ol4Var == null) {
                ol4Var = ol4.f26852c;
            }
            return new xl4(pa4Var2, new r73(i4, i6, j, al4Var, mb3Var, dl2Var, i, i2, ol4Var), xl4Var.f34391c);
        }
        int iOrdinal2 = df2Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            C0670g.m5864c();
            return null;
        }
        i6 = i5;
        j = r73Var.f29066c;
        if ((j & 1095216660480L) == 0) {
            j = s73.f29942a;
        }
        al4Var = r73Var.f29067d;
        if (al4Var == null) {
            al4Var = al4.f14615c;
        }
        mb3 mb3Var2 = r73Var.f29068e;
        dl2 dl2Var2 = r73Var.f29069f;
        i = r73Var.f29070g;
        if (i == 0) {
            i = yk2.f35295b;
        }
        i2 = r73Var.f29071h;
        if (i2 == 0) {
            i2 = 1;
        }
        ol4Var = r73Var.f29072i;
        if (ol4Var == null) {
            ol4Var = ol4.f26852c;
        }
        return new xl4(pa4Var2, new r73(i4, i6, j, al4Var, mb3Var2, dl2Var2, i, i2, ol4Var), xl4Var.f34391c);
    }

    /* JADX INFO: renamed from: J */
    public static final CharSequence m13513J(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? hd4.m6357w0(charSequence, 4999) : hd4.m6357w0(charSequence, 5000);
    }

    /* JADX INFO: renamed from: K */
    public static AssetFileDescriptor m13514K(byte[] bArr, ExecutorService executorService) throws IOException {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
        try {
            RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 22);
            runnableC1285w9.f33164b = bArr;
            runnableC1285w9.f33165c = autoCloseOutputStream;
            VarHandle.storeStoreFence();
            executorService.execute(runnableC1285w9);
            return new AssetFileDescriptor(parcelFileDescriptor, 0L, bArr.length);
        } catch (RejectedExecutionException e) {
            m13534t(autoCloseOutputStream);
            throw e;
        }
    }

    /* JADX INFO: renamed from: L */
    public static String m13515L(Context context, nr0 nr0Var, String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (nr0Var != nr0.CRONET_SOURCE_PLATFORM || qs5.m10095T(context).getBoolean("android.net.http.UseLegacyDefaultUserAgent", false)) {
            sb.append(context.getPackageName());
            sb.append('/');
            synchronized (f35990h) {
                i = f35991i;
                if (i == 0) {
                    try {
                        i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        f35991i = i;
                    } catch (PackageManager.NameNotFoundException unused) {
                        throw new IllegalStateException("Cannot determine package version");
                    }
                }
            }
            sb.append(i);
        } else {
            sb.append("AndroidHttpClient");
        }
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str2 = Build.MODEL;
        if (str2.length() > 0) {
            sb.append("; ");
            sb.append(str2);
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            sb.append("; Build/");
            sb.append(str3);
        }
        sb.append("; Cronet/");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static final void m13516a(List list, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1950017463);
        int i2 = i | (ir1Var.m6890g(list) ? 4 : 2);
        byte b = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            nt2 nt2VarM6619m = i25.m6619m(n74.m8583k(n74.m8575c(kt2.f23428a, 24.0f), 48.0f), gr3.m6151a(12.0f));
            pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.f34434a, ig1.f21387k, ir1Var, 0);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM6619m);
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
            C0006a5.m53I(ir1Var, ia5.f21216g, pr3VarM9243a);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            ir1Var.m6885d0(-1827912674);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q20.m9702a(as4.m3258q(n74.f25505b.mo7630d(new lg2(1.0f, true)), ((pb0) e74.m4941a(((pb0) it.next()).f27503a, ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d.mo7286c(), ir1Var, 0).getValue()).f27503a, k43.f22879x), ir1Var, 0);
            }
            ir1Var.m6912r(false);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            de0 de0Var = new de0(b);
            de0Var.f16999b = list;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = de0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13517b(String str, yp1 yp1Var, mi0 mi0Var, int i) {
        i50 i50Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-677987386);
        int i2 = i | 6 | (ir1Var.m6894i(yp1Var) ? 32 : 16);
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            ir1Var.m6885d0(1289156166);
            Set setKeySet = ((Map) ir1Var.m6898k(ln0.f24193d)).keySet();
            ArrayList arrayList = new ArrayList(ib0.m6717y0(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i50Var = ki0.f23136a;
                if (!zHasNext) {
                    break;
                }
                String str2 = (String) it.next();
                Object objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var) {
                    objM6869O = new sn0(str2, UUID.randomUUID().toString());
                    ir1Var.m6905n0(objM6869O);
                }
                sn0 sn0Var = (sn0) objM6869O;
                arrayList.add(new l73(sn0Var, ln0.m8040b(sn0Var, "picker", ir1Var)));
            }
            ir1Var.m6912r(false);
            List listM6315a1 = hb0.m6315a1(arrayList, new vl1((byte) 11));
            boolean zM6894i = ir1Var.m6894i(listM6315a1) | ((i2 & 112) == 32);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (zM6894i || objM6869O2 == i50Var) {
                C0951nm c0951nm = new C0951nm(b);
                c0951nm.f25937b = listM6315a1;
                c0951nm.f25938c = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0951nm);
                obj = c0951nm;
            }
            AbstractC0647fd.m5674l(null, "Pick an action", false, (yp1) obj, ir1Var, 48, 5);
            str = "Pick an action";
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ne0 ne0Var = new ne0((byte) 21);
            ne0Var.f25728b = str;
            ne0Var.f25729c = yp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ne0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m13518c(boolean z, nt2 nt2Var, nv2 nv2Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        boolean z2 = z;
        nv2 nv2Var2 = nv2Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1047235074);
        int i2 = i | (ir1Var.m6892h(z2) ? 4 : 2) | 384 | (ir1Var.m6890g(nv2Var2) ? 2048 : 1024);
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            nc4 nc4Var = pq2.f27894b;
            lu2 lu2Var = ((lq2) ir1Var.m6898k(nc4Var)).f24280d;
            xb4 xb4VarM8766b = AbstractC0947ni.m8766b(z2 ? 0.0f : -90.0f, lu2Var.mo7287d(), ir1Var);
            long j = pb0.f27500g;
            long j2 = ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16953j;
            long jM6747g = ic0.m6747g(((lq2) ir1Var.m6898k(nc4Var)).f24277a, 12.0f);
            long j3 = ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16960q;
            long jM6745e = ic0.m6745e(23, ir1Var);
            long jM6745e2 = ic0.m6745e(23, ir1Var);
            long jM6745e3 = ic0.m6745e(38, ir1Var);
            long jM13838B = zy5.m13838B(pb0.m9464c(ic0.m6745e(34, ir1Var), 1.0f, 0.0f, 0.0f, 0.0f, 14), ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16959p);
            long jM13838B2 = zy5.m13838B(pb0.m9464c(ic0.m6745e(17, ir1Var), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16959p);
            long jM13838B3 = zy5.m13838B(pb0.m9464c(ic0.m6745e(17, ir1Var), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16959p);
            long jM13838B4 = zy5.m13838B(pb0.m9464c(ic0.m6745e(17, ir1Var), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16959p);
            long jM13838B5 = zy5.m13838B(pb0.m9464c(ic0.m6745e(38, ir1Var), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16959p);
            long jM13838B6 = zy5.m13838B(pb0.m9464c(ic0.m6745e(17, ir1Var), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16959p);
            long jM13838B7 = zy5.m13838B(pb0.m9464c(ic0.m6745e(38, ir1Var), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16959p);
            xf4 xf4Var = new xf4();
            xf4Var.f34237a = jM6747g;
            xf4Var.f34238b = j2;
            xf4Var.f34239c = j;
            xf4Var.f34240d = j3;
            xf4Var.f34241e = jM6745e;
            xf4Var.f34242f = j;
            xf4Var.f34243g = jM6745e2;
            xf4Var.f34244h = jM6745e3;
            xf4Var.f34245i = jM13838B;
            xf4Var.f34246j = jM13838B2;
            xf4Var.f34247k = j;
            xf4Var.f34248l = jM13838B3;
            xf4Var.f34249m = jM13838B4;
            xf4Var.f34250n = jM13838B5;
            xf4Var.f34251o = jM13838B6;
            xf4Var.f34252p = jM13838B7;
            VarHandle.storeStoreFence();
            ae0 ae0Var = new ae0((byte) 0);
            ae0Var.f14400b = z;
            ae0Var.f14401c = lu2Var;
            ae0Var.f14402d = xb4VarM8766b;
            VarHandle.storeStoreFence();
            z2 = z;
            nv2Var2 = nv2Var;
            oh6.m9104j(z2, vd6.m11834R(1217384262, ae0Var, ir1Var), false, xf4Var, nv2Var2, ir1Var, (i2 & 14) | 3504 | ((i2 << 9) & 3670016));
            nt2Var2 = kt2.f23428a;
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ae0 ae0Var2 = new ae0((byte) 1);
            ae0Var2.f14400b = z2;
            ae0Var2.f14401c = nt2Var2;
            ae0Var2.f14402d = nv2Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ae0Var2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m13519d(lk2 lk2Var, yp1 yp1Var, mi0 mi0Var, int i) {
        Object obj;
        Boolean bool = Boolean.TRUE;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1220373486);
        int i2 = (ir1Var.m6894i(lk2Var) ? 32 : 16) | i;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            boolean zM6890g = ir1Var.m6890g(bool) | ir1Var.m6890g(lk2Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                gk2 lifecycle = lk2Var.getLifecycle();
                pk2 pk2Var = new pk2();
                pk2Var.f27689a = lifecycle;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(pk2Var);
                obj = pk2Var;
            }
            obj = objM6869O;
            m13520e(lk2Var, (pk2) obj, yp1Var, ir1Var, ((i2 >> 3) & 14) | 384);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            er1 er1Var = new er1((byte) 6);
            er1Var.f18412b = lk2Var;
            er1Var.f18413c = yp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = er1Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m13520e(lk2 lk2Var, pk2 pk2Var, yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(912823238);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(lk2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pk2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 256 : 128;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            boolean zM6894i = ir1Var.m6894i(pk2Var) | ((i2 & 896) == 256) | ir1Var.m6894i(lk2Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1164t c1164t = new C1164t((byte) 18);
                c1164t.f30700c = lk2Var;
                c1164t.f30701d = pk2Var;
                c1164t.f30699b = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1164t);
                obj = c1164t;
            }
            obj = objM6869O;
            lb5.m7924e(lk2Var, pk2Var, (yp1) obj, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 8);
            c1403zf.f36036c = lk2Var;
            c1403zf.f36037d = pk2Var;
            c1403zf.f36038e = yp1Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m13521f(Boolean bool, Object obj, lk2 lk2Var, yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        Object obj2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(696924721);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 2048 : 1024;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                lk2Var = (lk2) ir1Var.m6898k(rm2.f29413a);
            } else {
                ir1Var.m6874W();
            }
            int i3 = i2 & (-897);
            ir1Var.m6913s();
            boolean zM6890g = ir1Var.m6890g(bool) | ir1Var.m6890g(obj) | ir1Var.m6890g(lk2Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj2 = objM6869O;
                gk2 lifecycle = lk2Var.getLifecycle();
                tk2 tk2Var = new tk2();
                tk2Var.f31210a = lifecycle;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(tk2Var);
                obj2 = tk2Var;
            }
            obj2 = objM6869O;
            m13522g(lk2Var, (tk2) obj2, yp1Var, ir1Var, (i3 >> 3) & 896);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0877lm c0877lm = new C0877lm((byte) 5);
            c0877lm.f24144c = bool;
            c0877lm.f24146e = obj;
            c0877lm.f24147f = lk2Var;
            c0877lm.f24145d = yp1Var;
            c0877lm.f24143b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0877lm;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m13522g(lk2 lk2Var, tk2 tk2Var, yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(228371534);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(lk2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(tk2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 256 : 128;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            boolean zM6894i = ir1Var.m6894i(tk2Var) | ((i2 & 896) == 256) | ir1Var.m6894i(lk2Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1164t c1164t = new C1164t((byte) 19);
                c1164t.f30700c = lk2Var;
                c1164t.f30701d = tk2Var;
                c1164t.f30699b = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1164t);
                obj = c1164t;
            }
            obj = objM6869O;
            lb5.m7924e(lk2Var, tk2Var, (yp1) obj, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 9);
            c1403zf.f36036c = lk2Var;
            c1403zf.f36037d = tk2Var;
            c1403zf.f36038e = yp1Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final o03 m13523h(Context context, fg4 fg4Var) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        byte b = 6;
        if (connectivityManager == null || context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            return new h50(b);
        }
        try {
            tt2 tt2Var = new tt2((byte) 4, false);
            tt2Var.f31428b = connectivityManager;
            tt2Var.f31429c = fg4Var;
            qk3 qk3Var = new qk3(tt2Var, 0 == true ? 1 : 0);
            tt2Var.f31430d = qk3Var;
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), qk3Var);
            VarHandle.storeStoreFence();
            return tt2Var;
        } catch (Exception unused) {
            return new h50(b);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m13524i(nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(790527681);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                d83 d83Var = new d83(null, o85.f26450j);
                ir1Var.m6905n0(d83Var);
                objM6869O = d83Var;
            }
            sw2 sw2Var = (sw2) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (objM6869O2 == i50Var) {
                C0725hh c0725hh = new C0725hh((byte) 14);
                c0725hh.f20571b = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0725hh);
                obj = c0725hh;
            }
            wp1 wp1Var = (wp1) obj;
            ed3 ed3Var = dx0.f17476a;
            C0705gy c0705gyM12918l = AbstractC1356y5.m12918l(sj3.f30332b, ir1Var, 6);
            zh3[] zh3VarArr = {nj4.f25891b.mo7523a(zp0.m13658J(wp1Var, ir1Var, 2)), nj4.f25890a.mo7523a(c0705gyM12918l)};
            ri1 ri1Var = new ri1(b);
            ri1Var.f29310d = nt2Var;
            ri1Var.f29309c = sw2Var;
            ri1Var.f29308b = pg0Var;
            ri1Var.f29311e = c0705gyM12918l;
            ri1Var.f29312f = wp1Var;
            VarHandle.storeStoreFence();
            as4.m3245d(zh3VarArr, vd6.m11834R(1070596993, ri1Var, ir1Var), ir1Var, 56);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0688gh c0688gh = new C0688gh(b);
            c0688gh.f19788b = nt2Var;
            c0688gh.f19789c = pg0Var;
            c0688gh.f19790d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0688gh;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m13525j(nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(155925518);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        byte b = 3;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ir1Var.m6898k(nj4.f25890a) != null;
            boolean z2 = ir1Var.m6898k(nj4.f25891b) != null;
            if (z && z2) {
                ir1Var.m6885d0(-1977187922);
                xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, true);
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
                C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
                C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                C0006a5.m50F(ir1Var);
                C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                pg0Var.invoke(ir1Var, Integer.valueOf((i2 >> 3) & 14));
                ir1Var.m6912r(true);
                ir1Var.m6912r(false);
            } else if (z) {
                ir1Var.m6885d0(-1976997706);
                zp0.m13671c(nt2Var, pg0Var, ir1Var, i2 & 126);
                ir1Var.m6912r(false);
            } else if (z2) {
                ir1Var.m6885d0(-1976846922);
                dx0.m4788d(nt2Var, pg0Var, ir1Var, i2 & 126);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-1976716505);
                m13524i(nt2Var, pg0Var, ir1Var, i2 & 126);
                ir1Var.m6912r(false);
            }
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0688gh c0688gh = new C0688gh(b);
            c0688gh.f19788b = nt2Var;
            c0688gh.f19789c = pg0Var;
            c0688gh.f19790d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0688gh;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m13526k(int i, int i2) {
        return zi4.m13609i(i, i2, 31);
    }

    /* JADX INFO: renamed from: l */
    public static final byte[] m13527l(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(new byte[]{0, 0, 0, 16});
        messageDigest.update(bArr);
        messageDigest.update(bArr2);
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest.length < 4) {
            return null;
        }
        return new byte[]{0, bArrDigest[0], bArrDigest[1], bArrDigest[2], bArrDigest[3]};
    }

    /* JADX INFO: renamed from: m */
    public static lc0 m13528m(lc0 lc0Var) {
        uz4 uz4Var = ev0.f18499g;
        ar3 ar3Var = ar3.f14807e;
        if (sc6.m10630B(lc0Var.f23930b, 12884901888L)) {
            qp3 qp3Var = (qp3) lc0Var;
            uz4 uz4Var2 = qp3Var.f28661d;
            if (!m13536v(uz4Var2, uz4Var)) {
                return new qp3(qp3Var.f23929a, qp3Var.f28665h, uz4Var, m13508E(m13533s((float[]) ar3Var.f14813b, uz4Var2.m11687a(), uz4Var.m11687a()), qp3Var.f28666i), qp3Var.f28668k, qp3Var.f28671n, qp3Var.f28662e, qp3Var.f28663f, qp3Var.f28664g, -1);
            }
        }
        return lc0Var;
    }

    /* JADX INFO: renamed from: n */
    public static final void m13529n(C1242v3 c1242v3, i14 i14Var) {
        e14 e14Var = i14Var.f21012d;
        lw2 lw2Var = e14Var.f17631a;
        Object objM8132g = e14Var.f17631a.m8132g(m14.f24576y);
        if (objM8132g == null) {
            objM8132g = null;
        }
        lq3 lq3Var = (lq3) objM8132g;
        if (vd6.m11857p(i14Var)) {
            if (lq3Var != null && lq3Var.f24281a == 8) {
                return;
            }
            Object objM8132g2 = lw2Var.m8132g(d14.f16728y);
            if (objM8132g2 == null) {
                objM8132g2 = null;
            }
            C1353y2 c1353y2 = (C1353y2) objM8132g2;
            if (c1353y2 != null) {
                c1242v3.m11713a(new C1131s3(null, R.id.accessibilityActionPageUp, c1353y2.f34817a, null));
            }
            Object objM8132g3 = lw2Var.m8132g(d14.f16701A);
            if (objM8132g3 == null) {
                objM8132g3 = null;
            }
            C1353y2 c1353y3 = (C1353y2) objM8132g3;
            if (c1353y3 != null) {
                c1242v3.m11713a(new C1131s3(null, R.id.accessibilityActionPageDown, c1353y3.f34817a, null));
            }
            Object objM8132g4 = lw2Var.m8132g(d14.f16729z);
            if (objM8132g4 == null) {
                objM8132g4 = null;
            }
            C1353y2 c1353y4 = (C1353y2) objM8132g4;
            if (c1353y4 != null) {
                c1242v3.m11713a(new C1131s3(null, R.id.accessibilityActionPageLeft, c1353y4.f34817a, null));
            }
            Object objM8132g5 = lw2Var.m8132g(d14.f16702B);
            if (objM8132g5 == null) {
                objM8132g5 = null;
            }
            C1353y2 c1353y5 = (C1353y2) objM8132g5;
            if (c1353y5 != null) {
                c1242v3.m11713a(new C1131s3(null, R.id.accessibilityActionPageRight, c1353y5.f34817a, null));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m13530o(p84 p84Var, List list, zk3 zk3Var) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int iM9415c = p84Var.m9415c((cr1) list.get(i));
            int iM9404O = p84Var.m9404O(p84Var.f27434b, p84Var.m9428q(iM9415c));
            Object obj = iM9404O < p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(iM9415c + 1)) ? p84Var.f27435c[p84Var.m9419g(iM9404O)] : ki0.f23136a;
            yk3 yk3Var = obj instanceof yk3 ? (yk3) obj : null;
            if (yk3Var != null) {
                yk3Var.f35297a = zk3Var;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m13531p(StringBuilder sb, Object obj, yp1 yp1Var) {
        if (yp1Var != null) {
            sb.append((CharSequence) yp1Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m13532r(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor.getStartOffset() < 0) {
            C1077qn.m9987m("AssetFileDescriptor offset should be >= 0");
            return;
        }
        if (assetFileDescriptor.getLength() != -1 && assetFileDescriptor.getLength() < 0) {
            C1077qn.m9987m("AssetFileDescriptor should have valid length");
            return;
        }
        if (assetFileDescriptor.getDeclaredLength() != -1 && assetFileDescriptor.getDeclaredLength() < 0) {
            C1077qn.m9987m("AssetFileDescriptor should have valid declared length");
            return;
        }
        if (assetFileDescriptor.getLength() == -1 && assetFileDescriptor.getStartOffset() != 0) {
            qm5.m9919j("AssetFileDescriptor offset should be 0 for unknown length");
        } else {
            if (assetFileDescriptor.getLength() != -1) {
                return;
            }
            qm5.m9919j("AssetFileDescriptor should have known length");
        }
    }

    /* JADX INFO: renamed from: s */
    public static final float[] m13533s(float[] fArr, float[] fArr2, float[] fArr3) {
        m13509F(fArr, fArr2);
        m13509F(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM13505B = m13505B(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return m13508E(fArrM13505B, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    /* JADX INFO: renamed from: t */
    public static void m13534t(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[RETURN] */
    /* JADX INFO: renamed from: u */
    public static final int m13535u(gf4 gf4Var, String str) {
        int columnCount = gf4Var.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(gf4Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strM13617q = zi4.m13617q('`', "`", str);
        int columnCount2 = gf4Var.getColumnCount();
        while (i < columnCount2) {
            if (strM13617q.equals(gf4Var.getColumnName(i))) {
                if (i >= 0) {
                    return i;
                }
                return -1;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m13536v(uz4 uz4Var, uz4 uz4Var2) {
        if (uz4Var == uz4Var2) {
            return true;
        }
        return Math.abs(uz4Var.f32275a - uz4Var2.f32275a) < 0.001f && Math.abs(uz4Var.f32276b - uz4Var2.f32276b) < 0.001f;
    }

    /* JADX INFO: renamed from: w */
    public static byte[] m13537w(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                xy4.m12788q("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: x */
    public static final tk0 m13538x(lc0 lc0Var, lc0 lc0Var2) {
        float[] fArrM13508E;
        if (lc0Var == lc0Var2) {
            return new rk0(lc0Var, lc0Var, 1);
        }
        if (!sc6.m10630B(lc0Var.f23930b, 12884901888L) || !sc6.m10630B(lc0Var2.f23930b, 12884901888L)) {
            return new tk0(lc0Var, lc0Var2, 0);
        }
        qp3 qp3Var = (qp3) lc0Var;
        qp3 qp3Var2 = (qp3) lc0Var2;
        sk0 sk0Var = new sk0(qp3Var2, qp3Var, qp3Var2, null);
        sk0Var.f30349e = qp3Var;
        sk0Var.f30350f = qp3Var2;
        float[] fArr = (float[]) ar3.f14807e.f14813b;
        uz4 uz4Var = qp3Var.f28661d;
        float[] fArrM13508E2 = qp3Var.f28666i;
        uz4 uz4Var2 = qp3Var2.f28661d;
        float[] fArrM13505B = qp3Var2.f28667j;
        if (m13536v(uz4Var, uz4Var2)) {
            fArrM13508E = m13508E(fArrM13505B, fArrM13508E2);
        } else {
            float[] fArrM11687a = uz4Var.m11687a();
            float[] fArrM11687a2 = uz4Var2.m11687a();
            uz4 uz4Var3 = ev0.f18499g;
            if (!m13536v(uz4Var, uz4Var3)) {
                fArrM13508E2 = m13508E(m13533s(fArr, fArrM11687a, new float[]{0.964212f, 1.0f, 0.825188f}), fArrM13508E2);
            }
            if (!m13536v(uz4Var2, uz4Var3)) {
                fArrM13505B = m13505B(m13508E(m13533s(fArr, fArrM11687a2, new float[]{0.964212f, 1.0f, 0.825188f}), qp3Var2.f28666i));
            }
            fArrM13508E = m13508E(fArrM13505B, fArrM13508E2);
        }
        sk0Var.f30351g = fArrM13508E;
        VarHandle.storeStoreFence();
        return sk0Var;
    }

    /* JADX INFO: renamed from: z */
    public static final nt2 m13539z(jl1 jl1Var) {
        kl1 kl1Var = new kl1();
        kl1Var.f23211a = jl1Var;
        VarHandle.storeStoreFence();
        return kl1Var;
    }

    /* JADX INFO: renamed from: A */
    public void m13540A(ve4 ve4Var, Object obj) {
        if (obj == null) {
            return;
        }
        gf4 gf4VarM11888b = ve4Var.m11888b(mo10167y());
        try {
            mo10166q(gf4VarM11888b, obj);
            gf4VarM11888b.mo5112g();
            sc6.m10672m(gf4VarM11888b, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sc6.m10672m(gf4VarM11888b, th);
                throw th2;
            }
        }
    }

    public int hashCode() {
        switch (this.f35992a) {
            case 23:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo10166q(gf4 gf4Var, Object obj);

    public String toString() {
        switch (this.f35992a) {
            case 23:
                return rl3.m10361a(getClass()).m10249b();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: y */
    public abstract String mo10167y();
}
