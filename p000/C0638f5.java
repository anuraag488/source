package p000;

import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.C0313rh;
import ads_mobile_sdk.af1;
import ads_mobile_sdk.d50;
import ads_mobile_sdk.g83;
import ads_mobile_sdk.ia1;
import ads_mobile_sdk.su1;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.KeyEvent;
import android.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.NetError;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: f5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0638f5 {

    /* JADX INFO: renamed from: e */
    public static final yh3 f18751e = new yh3();

    /* JADX INFO: renamed from: f */
    public static final pg0 f18752f = new pg0(2121860938, false, new tg0(26));

    /* JADX INFO: renamed from: g */
    public static final pg0 f18753g = new pg0(-1227647261, false, new xg0(5));

    /* JADX INFO: renamed from: h */
    public static final C1254vf f18754h = new C1254vf(8);

    /* JADX INFO: renamed from: i */
    public static final p14 f18755i = new p14("TestTagsAsResourceId", false, new gv3(29));

    /* JADX INFO: renamed from: j */
    public static final p14 f18756j = new p14("AccessibilityClassName", true, new gv3(21));

    /* JADX INFO: renamed from: k */
    public static final p14 f18757k = new p14("CredentialRequest", false, new n14(0));

    /* JADX INFO: renamed from: l */
    public static final z45 f18758l = new z45(8);

    /* JADX INFO: renamed from: m */
    public static final kh5 f18759m = new kh5(10);

    /* JADX INFO: renamed from: n */
    public static g12 f18760n;

    /* JADX INFO: renamed from: o */
    public static g12 f18761o;

    /* JADX INFO: renamed from: p */
    public static String f18762p;

    /* JADX INFO: renamed from: q */
    public static Boolean f18763q;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18764a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ zf0 f18765b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f18766c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0006a5 f18767d;

    public /* synthetic */ C0638f5(byte b) {
        this.f18764a = b;
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m5522A(cr3 cr3Var) {
        long j = cr3Var.f16395e;
        return (j >>> 32) == (4294967295L & j) && j == cr3Var.f16396f && j == cr3Var.f16397g && j == cr3Var.f16398h;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m5523B(Bitmap bitmap) {
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = -1;
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = iArr[i2];
            if (Color.alpha(i3) > 16) {
                int i4 = i3 & 16777215;
                if (i == -1) {
                    i = i4;
                } else if (Math.abs(Color.red(i4) - Color.red(i)) > 8 || Math.abs(Color.green(i4) - Color.green(i)) > 8 || Math.abs(Color.blue(i4) - Color.blue(i)) > 8) {
                }
            }
        }
        return i != -1;
    }

    /* JADX INFO: renamed from: D */
    public static final int m5524D(ni2 ni2Var, boolean z) {
        int i;
        int i2;
        if (z) {
            i = ni2Var.f25862q;
            i2 = ni2Var.f25864s;
        } else {
            i = ni2Var.f25861p;
            i2 = ni2Var.f25863r;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: E */
    public static f24 m5525E(ExecutorService executorService) {
        f24 f24Var = new f24();
        f24Var.f18677b = new ArrayDeque();
        f24Var.f18678c = 1;
        f24Var.f18679d = 0L;
        oz5 oz5Var = new oz5((byte) 4);
        oz5Var.f27250c = f24Var;
        VarHandle.storeStoreFence();
        f24Var.f18680e = oz5Var;
        executorService.getClass();
        f24Var.f18676a = executorService;
        VarHandle.storeStoreFence();
        return f24Var;
    }

    /* JADX INFO: renamed from: F */
    public static Executor m5526F(Executor executor, ik1 ik1Var) {
        executor.getClass();
        if (executor == rz0.f29741a) {
            return executor;
        }
        xt2 xt2Var = new xt2((byte) 0);
        xt2Var.f34616b = executor;
        xt2Var.f34617c = ik1Var;
        VarHandle.storeStoreFence();
        return xt2Var;
    }

    /* JADX INFO: renamed from: G */
    public static final Bitmap m5527G(Drawable drawable, int i, int i2) {
        Drawable drawableMutate;
        Drawable drawableNewDrawable;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        if (i2 != 0) {
            bitmapCreateBitmap.eraseColor(i2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (drawableNewDrawable = constantState.newDrawable()) == null || (drawableMutate = drawableNewDrawable.mutate()) == null) {
            drawableMutate = drawable.mutate();
        }
        drawableMutate.setBounds(0, 0, i, i);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: H */
    public static Object m5528H(mq1 mq1Var) {
        return y70.m13014O(r71.f29063a, mq1Var);
    }

    /* JADX INFO: renamed from: I */
    public static final long m5529I(long j, kg2 kg2Var) {
        return kg2Var == kg2.f23106a ? ll0.m8009a(kl0.m7541k(j), kl0.m7539i(j), kl0.m7540j(j), kl0.m7538h(j)) : ll0.m8009a(kl0.m7540j(j), kl0.m7538h(j), kl0.m7541k(j), kl0.m7539i(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m5530a(String str, nt2 nt2Var, boolean z, mi0 mi0Var, int i, int i2) {
        C0853kz c0853kz = ig1.f21382f;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-361597979);
        byte b = 2;
        int i3 = (ir1Var.m6890g(str) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        boolean z2 = true;
        boolean z3 = true;
        if (ir1Var.m6871T(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                nt2Var = kt2.f23428a;
            }
            ir1Var.m6885d0(-587274457);
            C0532cm c0532cm = new C0532cm(str, true);
            C0750i5 c0750i5 = new C0750i5(b);
            c0750i5.f21129b = str;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(2065448525, c0750i5, ir1Var);
            ir1Var.m6887e0(-1555574782);
            jm0.f22418cp.getClass();
            lk3 lk3VarM10634F = sc6.m10634F(qm2.f28573a, ir1Var);
            int i6 = (((((i5 << 3) & 896) | 1769520) << 3) & 7168) | 14156344;
            ir1Var.m6887e0(-1545157471);
            C0954np c0954np = new C0954np(c0532cm, ba1.f15188a, lk3VarM10634F);
            sk3 sk3Var = fw4.f19357b;
            qz2 qz2Var = new qz2(z3 ? 1 : 0);
            qz2Var.f28901b = pg0VarM11834R;
            VarHandle.storeStoreFence();
            oh6.m9102h(c0954np, nt2Var, C0880lp.f24242t, null, c0853kz, im0.f21547b, new pg0(750771424, true, qz2Var), ir1Var, ((i6 >> 3) & 896) | 196656, 0);
            ir1Var.m6912r(false);
            ir1Var.m6912r(false);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
            z2 = z;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0580dm c0580dm = new C0580dm();
            c0580dm.f17172a = str;
            c0580dm.f17173b = nt2Var;
            c0580dm.f17174c = z2;
            c0580dm.f17175d = i;
            c0580dm.f17176e = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0580dm;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final cr3 m5531b(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new cr3(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: c */
    public static af1 m5532c(wa2 wa2Var, hx0 hx0Var) {
        wa2 wa2VarM2261a;
        wa2 wa2VarM2261a2;
        wa2 wa2VarM2261a3;
        ba2 ba2VarM12186z = wa2Var.m12186z("ad_json");
        wa2 wa2VarM3528l = ba2VarM12186z != null ? ba2VarM12186z.m3528l() : null;
        o92 o92VarM2271e = wa2VarM3528l != null ? su1.m2271e(wa2VarM3528l, "slots") : null;
        boolean z = false;
        o92 o92VarM2271e2 = (o92VarM2271e == null || (wa2VarM2261a3 = su1.m2261a(o92VarM2271e, 0)) == null) ? null : su1.m2271e(wa2VarM2261a3, "ads");
        o92 o92VarM2271e3 = su1.m2271e(wa2VarM3528l, "ads");
        String strM2258a = (o92VarM2271e3 == null || (wa2VarM2261a2 = su1.m2261a(o92VarM2271e3, 0)) == null) ? null : su1.m2258a(wa2VarM2261a2, "ad_mid", "");
        boolean z2 = o92VarM2271e != null && o92VarM2271e.f26491a.size() == 1;
        String strM2258a2 = (o92VarM2271e2 == null || (wa2VarM2261a = su1.m2261a(o92VarM2271e2, 0)) == null) ? null : su1.m2258a(wa2VarM2261a, "ad_mid", "");
        if (strM2258a2 != null && (!hd4.m6345k0(strM2258a2))) {
            z = true;
        }
        if (strM2258a == null && z2 && z) {
            strM2258a = strM2258a2;
        }
        ba2 ba2VarM12186z2 = wa2Var.m12186z("ad_html");
        String strMo3532s = ba2VarM12186z2 != null ? ba2VarM12186z2.mo3532s() : null;
        ba2 ba2VarM12186z3 = wa2Var.m12186z("ad_base_url");
        String strMo3532s2 = ba2VarM12186z3 != null ? ba2VarM12186z3.mo3532s() : null;
        af1 af1Var = new af1();
        af1Var.f546a = strMo3532s;
        af1Var.f547b = hx0Var;
        af1Var.f548c = strMo3532s2;
        af1Var.f549d = wa2VarM3528l;
        af1Var.f550e = strM2258a;
        af1Var.f551f = z;
        VarHandle.storeStoreFence();
        return af1Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[PHI: r2
  0x00ba: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v7 java.lang.String), (r2v7 java.lang.String), (r2v7 java.lang.String) binds: [B:14:0x003b, B:32:0x008f, B:38:0x00ac, B:40:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public static final WebResourceResponse m5533d(ia1 ia1Var) {
        Object next;
        String str;
        Object next2;
        String str2 = ia1Var.f4912b;
        LinkedHashMap linkedHashMap = ia1Var.f4913c;
        Iterator it = linkedHashMap.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!od4.m9039T((String) ((Map.Entry) next).getKey(), "Content-Type", true));
        Map.Entry entry = (Map.Entry) next;
        String str3 = entry != null ? (String) entry.getValue() : null;
        String str4 = "text/html";
        if (str3 != null) {
            List listM6353s0 = hd4.m6353s0(str3, new String[]{";"}, 6);
            String str5 = (String) hb0.m6301M0(listM6353s0);
            String string = str5 != null ? hd4.m6360z0(str5).toString() : null;
            if (string != null && hd4.m6335a0(string, "/", false)) {
                str4 = string;
            }
            Iterator it2 = hb0.m6295G0(listM6353s0, 1).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!od4.m9043X(hd4.m6360z0((String) next2).toString(), "charset=", true));
            String strSubstring = (String) next2;
            if (strSubstring == null) {
                str = "UTF-8";
            } else {
                int iM6343i0 = hd4.m6343i0(strSubstring, "=", 0, false, 6);
                if (iM6343i0 != -1) {
                    strSubstring = strSubstring.substring(1 + iM6343i0, strSubstring.length());
                }
                String string2 = hd4.m6360z0(strSubstring).toString();
                if (string2 != null) {
                    String upperCase = string2.toUpperCase(Locale.ROOT);
                    if (upperCase.length() == 0) {
                        str = "UTF-8";
                    } else {
                        str = upperCase;
                    }
                } else {
                    str = "UTF-8";
                }
            }
        } else {
            str = "UTF-8";
        }
        if (str2 == null || hd4.m6345k0(str2)) {
            str2 = "OK";
        }
        String str6 = str2;
        ByteArrayInputStream byteArrayInputStream = null;
        int i = ia1Var.f4911a;
        g83 g83Var = ia1Var.f4914d;
        if (g83Var != null) {
            byteArrayInputStream = new ByteArrayInputStream(g83Var.f3871a);
        }
        return new WebResourceResponse(str4, str, i, str6, linkedHashMap, byteArrayInputStream);
    }

    /* JADX INFO: renamed from: e */
    public static final void m5534e(zo0 zo0Var, C0310ra c0310ra, mq1 mq1Var) {
        lb5.m7909R(zo0Var, r71.f29063a, cp0.f16328d, new d50(c0310ra, mq1Var, (wm0) null));
    }

    /* JADX INFO: renamed from: f */
    public static long m5535f(boolean z, int i, EnumC0887lw enumC0887lw, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = enumC0887lw == EnumC0887lw.f24407b ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    /* JADX INFO: renamed from: g */
    public static int m5536g(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        C1077qn.m9987m(sc6.m10639K("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static long m5537h(long j, kg2 kg2Var) {
        kg2 kg2Var2 = kg2.f23106a;
        return ll0.m8009a(kg2Var == kg2Var2 ? kl0.m7541k(j) : kl0.m7540j(j), kg2Var == kg2Var2 ? kl0.m7539i(j) : kl0.m7538h(j), kg2Var == kg2Var2 ? kl0.m7540j(j) : kl0.m7541k(j), kg2Var == kg2Var2 ? kl0.m7538h(j) : kl0.m7539i(j));
    }

    /* JADX INFO: renamed from: i */
    public static long m5538i(int i, long j) {
        return ll0.m8009a(0, kl0.m7539i(j), (i & 4) != 0 ? kl0.m7540j(j) : 0, kl0.m7538h(j));
    }

    /* JADX INFO: renamed from: j */
    public static cr5 m5539j(byte[] bArr, int i, int i2) {
        return new cr5((Object) ByteBuffer.wrap(bArr, i, i2).slice(), (byte) 4);
    }

    /* JADX INFO: renamed from: k */
    public static final Bitmap m5540k(Drawable drawable, float f) {
        Bitmap bitmapM5527G = m5527G(drawable, 432, 0);
        int[] iArr = new int[bitmapM5527G.getHeight() * bitmapM5527G.getWidth()];
        bitmapM5527G.getPixels(iArr, 0, bitmapM5527G.getWidth(), 0, 0, bitmapM5527G.getWidth(), bitmapM5527G.getHeight());
        int width = bitmapM5527G.getWidth();
        int height = bitmapM5527G.getHeight();
        int height2 = bitmapM5527G.getHeight();
        int iMax = -1;
        int iMax2 = -1;
        for (int i = 0; i < height2; i++) {
            int width2 = bitmapM5527G.getWidth();
            for (int i2 = 0; i2 < width2; i2++) {
                if (Color.alpha(iArr[(bitmapM5527G.getWidth() * i) + i2]) > 16) {
                    width = Math.min(width, i2);
                    iMax = Math.max(iMax, i2);
                    height = Math.min(height, i);
                    iMax2 = Math.max(iMax2, i);
                }
            }
        }
        if (iMax < 0) {
            return null;
        }
        int i3 = (iMax - width) + 1;
        int i4 = (iMax2 - height) + 1;
        int iM10010E = qq2.m10010E(Math.max(i3, i4) / f);
        int i5 = (iM10010E - i3) / 2;
        int i6 = (iM10010E - i4) / 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM10010E, iM10010E, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM5527G, new Rect(width, height, iMax + 1, iMax2 + 1), new Rect(i5, i6, i3 + i5, i4 + i6), (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l */
    public static final File m5541l(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    /* JADX INFO: renamed from: m */
    public static final nt2 m5542m(nt2 nt2Var, yp1 yp1Var) {
        o31 o31Var = new o31();
        o31Var.f26314a = yp1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(o31Var);
    }

    /* JADX INFO: renamed from: n */
    public static final nt2 m5543n(nt2 nt2Var, yp1 yp1Var) {
        w31 w31Var = new w31();
        w31Var.f33057a = yp1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(w31Var);
    }

    /* JADX INFO: renamed from: o */
    public static final nt2 m5544o(nt2 nt2Var, yp1 yp1Var) {
        x31 x31Var = new x31();
        x31Var.f33953a = yp1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(x31Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public static final void m5545p(ti1 ti1Var, Object obj, Object obj2, ym0 ym0Var) {
        ij1 ij1Var;
        if (ym0Var instanceof ij1) {
            ij1Var = (ij1) ym0Var;
            int i = ij1Var.f21493v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ij1Var.f21493v = i - Integer.MIN_VALUE;
            } else {
                ij1Var = new ij1(ym0Var);
            }
        } else {
            ij1Var = new ij1(ym0Var);
        }
        Object obj3 = ij1Var.f21492u;
        Object obj4 = ap0.f14763a;
        int i2 = ij1Var.f21493v;
        if (i2 == 0) {
            k43.m7376J(obj3);
            ij1Var.f21491t = obj2;
            ij1Var.f21493v = 1;
            if (ti1Var.emit(obj, ij1Var) == obj4) {
                return;
            }
        } else if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = ij1Var.f21491t;
            k43.m7376J(obj3);
        }
        throw new C0817k(obj2);
    }

    /* JADX INFO: renamed from: q */
    public static final int m5546q(hi2 hi2Var, Object obj, int i) {
        int iM7080e;
        return (obj == null || hi2Var.m6409c() == 0 || (i < hi2Var.m6409c() && obj.equals(hi2Var.m6410d(i))) || (iM7080e = hi2Var.f20600d.m7080e(obj)) == -1) ? i : iM7080e;
    }

    /* JADX INFO: renamed from: r */
    public static long m5547r(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    ll0.m8019k(i6);
                    xy4.m12794w();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return ll0.m8009a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: s */
    public static long m5548s(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    ll0.m8019k(i6);
                    xy4.m12794w();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return ll0.m8009a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x002e  */
    /* JADX INFO: renamed from: t */
    public static final BitmapDrawable m5549t(Context context, Drawable drawable, String str) throws XmlPullParserException {
        float f;
        boolean zM5523B;
        int attributeResourceValue;
        boolean zM13387o;
        boolean z;
        Throwable th;
        int attributeResourceValue2;
        Object objM7389n;
        float f2 = 2.0f;
        int iM10010E = qq2.m10010E((1.0f / ((AdaptiveIconDrawable.getExtraInsetFraction() * 2.0f) + 1.0f)) * 216.0f);
        try {
            Context contextCreatePackageContext = context.createPackageContext(str, 0);
            Resources resources = contextCreatePackageContext.getResources();
            int i = contextCreatePackageContext.getPackageManager().getApplicationInfo(str, 0).icon;
            if (i == 0) {
                f = 2.0f;
                zM5523B = false;
            } else {
                XmlResourceParser xml = resources.getXml(i);
                try {
                    try {
                        int eventType = xml.getEventType();
                        while (true) {
                            if (eventType == 1) {
                                attributeResourceValue = 0;
                                break;
                            }
                            if (eventType == 2 && z62.m13387o(xml.getName(), "foreground")) {
                                attributeResourceValue = xml.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawable", 0);
                                break;
                            }
                            eventType = xml.next();
                        }
                        sc6.m10672m(xml, null);
                        if (attributeResourceValue == 0) {
                            f = 2.0f;
                        } else {
                            try {
                                try {
                                    XmlResourceParser xml2 = resources.getXml(attributeResourceValue);
                                    try {
                                        int eventType2 = xml2.getEventType();
                                        z = false;
                                        zM13387o = false;
                                        while (eventType2 != 1 && !zM13387o) {
                                            if (eventType2 == 2) {
                                                try {
                                                    String name = xml2.getName();
                                                    f = f2;
                                                    try {
                                                        if (z62.m13387o(name, "vector")) {
                                                            z = true;
                                                        } else if (z62.m13387o(name, "path") && (attributeResourceValue2 = xml2.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "fillColor", 0)) != 0) {
                                                            try {
                                                                objM7389n = resources.getResourceTypeName(attributeResourceValue2);
                                                            } catch (Throwable th2) {
                                                                objM7389n = k43.m7389n(th2);
                                                            }
                                                            if (objM7389n instanceof cp3) {
                                                                objM7389n = null;
                                                            }
                                                            zM13387o = z62.m13387o(objM7389n, "drawable");
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        th = th;
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th4) {
                                                            sc6.m10672m(xml2, th);
                                                            throw th4;
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    f = f2;
                                                }
                                            } else {
                                                f = f2;
                                            }
                                            if (!zM13387o) {
                                                eventType2 = xml2.next();
                                            }
                                            f2 = f;
                                        }
                                        f = f2;
                                        sc6.m10672m(xml2, null);
                                    } catch (Throwable th6) {
                                        f = 2.0f;
                                        th = th6;
                                        z = false;
                                        zM13387o = false;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    sc6.m10643O(th);
                                    sj3.m10807c(th);
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                f = 2.0f;
                                z = false;
                                zM13387o = false;
                                sc6.m10643O(th);
                                sj3.m10807c(th);
                            }
                            if (!z) {
                                zM5523B = m5523B(m5527G(resources.getDrawable(attributeResourceValue, contextCreatePackageContext.getTheme()), C0313rh.f10793i1, 0));
                            } else if (!zM13387o) {
                                zM5523B = true;
                            }
                        }
                    } catch (Throwable th9) {
                        f = 2.0f;
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            sc6.m10672m(xml, th9);
                            throw th10;
                        }
                    }
                } catch (Exception unused) {
                }
                zM5523B = false;
            }
        } catch (Exception unused2) {
        }
        Bitmap bitmapM5527G = m5527G(drawable, iM10010E, zM5523B ? 0 : -16777216);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM10010E, iM10010E, Bitmap.Config.ALPHA_8);
        if (zM5523B) {
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM5527G, 0.0f, 0.0f, (Paint) null);
        } else {
            Paint paint = new Paint(2);
            paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.33333334f, 0.33333334f, 0.33333334f, 0.0f, 0.0f})));
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM5527G, 0.0f, 0.0f, paint);
            int i2 = ((iM10010E + NetError.ERR_ADDRESS_INVALID) * iM10010E) / 2;
            int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth();
            byte[] bArr = new byte[height];
            bitmapCreateBitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
            int iMin = 255;
            int iMax = 0;
            for (int i3 = 0; i3 < height; i3++) {
                int i4 = bArr[i3] & 255;
                iMin = Math.min(iMin, i4);
                iMax = Math.max(iMax, i4);
            }
            if (iMin < iMax) {
                float f3 = iMax - iMin;
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    i5 = i5 + (bArr[i6] & 255) + (bArr[(height - 1) - i6] & 255);
                }
                boolean z2 = ((((float) i5) / (((float) i2) * f)) - ((float) iMin)) / f3 > 0.5f;
                for (int i7 = 0; i7 < height; i7++) {
                    int iM10010E2 = qq2.m10010E((((bArr[i7] & 255) - iMin) * 255.0f) / f3);
                    if (z2) {
                        iM10010E2 = 255 - iM10010E2;
                    }
                    bArr[i7] = (byte) iM10010E2;
                }
                bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            }
        }
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    /* JADX INFO: renamed from: u */
    public static final g12 m5550u() {
        g12 g12Var = f18760n;
        if (g12Var != null) {
            return g12Var;
        }
        f12 f12Var = new f12("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = uw4.f32218a;
        ga4 ga4Var = new ga4(pb0.f27495b);
        tv1 tv1Var = new tv1((byte) 1);
        tv1Var.m11175k(19.0f, 6.41f);
        tv1Var.m11173i(17.59f, 5.0f);
        tv1Var.m11173i(12.0f, 10.59f);
        tv1Var.m11173i(6.41f, 5.0f);
        tv1Var.m11173i(5.0f, 6.41f);
        tv1Var.m11173i(10.59f, 12.0f);
        tv1Var.m11173i(5.0f, 17.59f);
        tv1Var.m11173i(6.41f, 19.0f);
        tv1Var.m11173i(12.0f, 13.41f);
        tv1Var.m11173i(17.59f, 19.0f);
        tv1Var.m11173i(19.0f, 17.59f);
        tv1Var.m11173i(13.41f, 12.0f);
        tv1Var.m11168d();
        f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
        g12 g12VarM5449e = f12Var.m5449e();
        f18760n = g12VarM5449e;
        return g12VarM5449e;
    }

    /* JADX INFO: renamed from: v */
    public static String m5551v() {
        String str = f18762p;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        f18762p = processName;
        return processName;
    }

    /* JADX INFO: renamed from: w */
    public static double m5552w(rv1 rv1Var, double[] dArr, double[] dArr2) {
        double d;
        int iMin = Math.min(dArr.length - 1, dArr2.length);
        double d2 = rv1Var.f29661b;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                d = d2;
                break;
            }
            if (d2 >= dArr[i] && d2 < dArr[i + 1]) {
                d = dArr2[i] % 360.0d;
                if (d >= 0.0d) {
                    break;
                }
                d += 360.0d;
                break;
            }
            i++;
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    /* JADX INFO: renamed from: x */
    public static final oo3 m5553x(jl4 jl4Var, int i) {
        il4 il4Var = jl4Var.f22400a;
        yu2 yu2Var = jl4Var.f22401b;
        if (il4Var.f21533a.f24092b.length() != 0) {
            int iM13245d = yu2Var.m13245d(i);
            if ((i != 0 && iM13245d == yu2Var.m13245d(i - 1)) || (i != il4Var.f21533a.f24092b.length() && iM13245d == yu2Var.m13245d(i + 1))) {
                return jl4Var.m7175a(i);
            }
        }
        return jl4Var.m7181g(i);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m5554y(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m5555z(KeyEvent keyEvent, int i) {
        return ((int) (qs5.m10079D(keyEvent) >> 32)) == i;
    }

    /* JADX INFO: renamed from: C */
    public final void m5556C(Object obj, ar3 ar3Var) throws Exception {
        switch (this.f18764a) {
            case 0:
                zf0 zf0Var = this.f18765b;
                LinkedHashMap linkedHashMap = zf0Var.f36040b;
                ArrayList arrayList = zf0Var.f36042d;
                String str = this.f18766c;
                Object obj2 = linkedHashMap.get(str);
                C0006a5 c0006a5 = this.f18767d;
                if (obj2 == null) {
                    xd2.m12668o("Attempting to launch an unregistered ActivityResultLauncher with contract ", c0006a5, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    zf0Var.m13544b(iIntValue, c0006a5, obj, ar3Var);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                zf0 zf0Var2 = this.f18765b;
                ArrayList arrayList2 = zf0Var2.f36042d;
                LinkedHashMap linkedHashMap2 = zf0Var2.f36040b;
                String str2 = this.f18766c;
                Object obj3 = linkedHashMap2.get(str2);
                C0006a5 c0006a6 = this.f18767d;
                if (obj3 == null) {
                    xd2.m12668o("Attempting to launch an unregistered ActivityResultLauncher with contract ", c0006a6, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    zf0Var2.m13544b(iIntValue2, c0006a6, obj, ar3Var);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str2);
                    throw e2;
                }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m5557J() {
        this.f18765b.m13547e(this.f18766c);
    }
}
