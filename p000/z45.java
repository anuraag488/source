package p000;

import ads_mobile_sdk.AbstractC0241mu;
import ads_mobile_sdk.C0047bd;
import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.C0244n;
import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.EnumC0263nu;
import ads_mobile_sdk.c73;
import ads_mobile_sdk.da4;
import ads_mobile_sdk.e44;
import ads_mobile_sdk.ef1;
import ads_mobile_sdk.en0;
import ads_mobile_sdk.gf1;
import ads_mobile_sdk.gy2;
import ads_mobile_sdk.k83;
import ads_mobile_sdk.kc1;
import ads_mobile_sdk.kp3;
import ads_mobile_sdk.n94;
import ads_mobile_sdk.p04;
import ads_mobile_sdk.qa4;
import ads_mobile_sdk.ua4;
import ads_mobile_sdk.zm3;
import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z45 implements v85 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35749a;

    public /* synthetic */ z45(byte b) {
        this.f35749a = b;
    }

    @Override // p000.ki5
    public final Object get() {
        switch (this.f35749a) {
            case 0:
                return ev0.m5333H(0, null, null, 7);
            case 1:
                qb1 qb1Var = qb1.f28357c;
                HashMap map = new HashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                gn1 gn1Var = ou1.f27107i;
                int i = ou1.f27109k;
                int i2 = ou1.f27110l;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayList.add(new AndroidBundleTypeAdapterFactory());
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                boolean z = jb4.f22154a;
                HashMap map2 = new HashMap(map);
                new ArrayList(arrayList);
                new ArrayList(arrayList2);
                return new ou1(qb1Var, 1, map2, false, gn1Var, arrayList3, i, i2, new ArrayList(arrayDeque));
            case 2:
                return new mm5();
            case 3:
                x12 x12VarM12458s = x12.m12458s(new zm3("CIeNhw6+7t3ApArY3mRpxKnbe5id7tLfig7cBpoEl52N7bm9/1zpcehGlPH8fqVD", "mLeLYksDw4uDDeBXlMQHrQmn8B3Jyg/LHOObp+CcYTY=", Context.class), new zm3("hMkj0t0+w7SKOMnFkwdvDNF1Ms+QhRHWbJ+FGIkiQLoang7SxPclmuWT6+c07JSj", "mVJ2OPDHvgIM1F9BWpIkt0HPBMbd+LmU9gtT7anAEa0=", new Class[0]), new zm3("Gwq7+0iolT2lO/IDrZeOLl9S23NftYM5DoPpZ/YhrTH0FMGsmmqdHMntjov9P5+I", "SFWbzBEYTkbgMNCDWPlcr5JpS++sGmV09RRzPJsqDXs=", NetworkCapabilities.class, Long.class, Long.class), new zm3("XExKoplhiFoQ6D+FyQcvlHzgS0jUpNviENaLPG0KW1TR1MrayWqJh0DMQ6sXoXgw", "2kQXgYJBdBqp5gITuiT3acKgg6NbD9vCXWHeCLBHO2Y=", String.class), new zm3("Adcdzrv48l/TkF8sLVxmg9j/G3lOIQT8EWqZgd0EuyNmW0QNqKHZlXVwIJd7f4Tj", "0gEJqNNqKytHRW0GBgnSoA6h1kry2KdnM8fx3ivlHV8=", View.class, Activity.class), new zm3("IxOeGt3RzLN/nmn71CinACaKXl5YN9OL8yhH4nbd/0qkMz44t+9X3HJ7kBC7MMnD", "8dLGV4YB8prY5NPzgI74YL3Sp26MZYQFrLRKWjdhACU=", DisplayMetrics.class, View.class), new zm3("bqx+oqOAI5mSrPkjjmg6XfcA/t6MZ9wl8Wd5Krx19fEy7sFJbWm9uYNjohihwl5F", "Q1uuhF44d6LJg9VRUP9NgL8/35MpSd5kJlexgvXHx3g=", Long[].class, Integer.class), new zm3("Gt/zlZD+fuiro3D5eYSJpMJ43zgVXhW0YO0klwSL9tryoeln6LTnq9zxDInW+wii", "xjzvi0yiVfVP2AbdeLUw4+yFuZH/f3opD5HsHWHSc6U=", new Class[0]), new zm3("2I9VpGbZ3aVnkktvi0wKv/jfcpL3Tw0ZSPUvkDQpYNuOEUKpK+eq+nlrs37ns9lz", "75+R290mmmpcR/G9IrawPof+cWQNpJdzVcDXvMmNSyk=", Context.class, Integer.class), new zm3("cDTRnLGiqlTcZwpDje4VLsyAutBWTxiPKb2Eeoq3U2+R1IGkY5xzZ3EmGnVJz02P", "WicHLQ1C4oN73qRwwIKy9WGLAhPbeE/BDIR70wIxbKE=", Integer.class, Context.class, Boolean.class), new zm3("ladMtfjZrK9AtkfclyUNbtLJU69l1RlVU7lIFe3hJ4B9OuA94D0KVKYrORiHfxo3", "8KlRMTIoHn9x9q4VLk9R6415CfQH4AajcFNAlfDx1NI=", Context.class), new zm3("AfTPRHmiiVXsSkbLUSJnuM+mE9dpV/pj71pIZ+8hoxM4iOr+Upv93NlszdDkScbQ", "q2NmicCrz2jeofdRvOMlpJaSWD0wkb2hIJ4ib0hvpTc=", Context.class), new zm3("JnRQoMUdKwZ1gNCRuvAhgu8y4x6EZWJ+4cC+q/6mlrj526qBMoSP0oc1Q031sjgW", "FA/I71grpzqal981PrDCqiE88nW4VH/YYaZBEZQZCCE=", MotionEvent.class, DisplayMetrics.class), new zm3("jebY3TUbo8AAN2Z8quvlwWKSWWq/7qGxVCvk7X+IdPRwmnGjbWC3doK99cPeSjET", "hezPkyPWhAFumFvJg5ABJFM278OcSGkYiGIoP+z+VHQ=", MotionEvent.class, DisplayMetrics.class), new zm3("Qhaf24ZGN+HCKb11O/jpBM9PDLT8EPGyP+Ddm5KbZ51LO2wHND6n8pIFh3eiyL6E", "9Ruye5gbm14hA32JAEZTUMU/XyyQ6fBkMKK/f5cwShw=", List.class), new zm3("QaUH6aaptCg0WA7YKdg57Dywom2JYCek9kByPOrDtQs10UpJxEomCO3TBaWkGjZL", "3Bh40Hjfo6HQlDFMujTVmWO8q+D1u1Pw8utMIhL1Qwo=", InputEvent.class, Context.class));
                y70.m13030j(x12VarM12458s);
                return x12VarM12458s;
            case 4:
                return new n55();
            case 5:
                c73 c73Var = new c73();
                eo3 eo3Var = eo3.f18333a;
                fo3 fo3Var = fo3.f19180a;
                co3 co3Var = co3.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                ArrayList arrayListM7730r = kx5.m7730r("B3EEABB8EE11C2BE770B684D95219ECB");
                do3 do3Var = do3.f17237b;
                go3 go3Var = new go3();
                go3Var.f19991a = co3Var;
                go3Var.f19992b = arrayListM7730r;
                go3Var.f19993c = do3Var;
                VarHandle.storeStoreFence();
                c73Var.f1837a = new C0200km((yp1) null, go3Var);
                VarHandle.storeStoreFence();
                return c73Var;
            case 6:
                return 1;
            case 7:
                en0 en0Var = new en0();
                en0Var.f3119a = new C0200km((yp1) null, (Object) null);
                VarHandle.storeStoreFence();
                return en0Var;
            case 8:
                return new e44();
            case 9:
                C0047bd c0047bd = new C0047bd();
                c0047bd.f1106a = new Object();
                c0047bd.f1107b = new ConcurrentHashMap();
                c0047bd.f1108c = new ConcurrentHashMap();
                c0047bd.f1109d = new ConcurrentHashMap();
                VarHandle.storeStoreFence();
                return c0047bd;
            case 10:
                return new k85();
            case 11:
                int[] iArr = {530498338, 909437126, 1273894288, 894494823, 1232015929, -100152071, 858712529, 970925433, 309198987};
                int i3 = iArr[7] % iArr[8];
                n94 n94Var = new n94();
                int[] iArr2 = {1516266761, 1142957872, 446044582, 1147282962, 861635011, -1643766350, 500618996, 1941690360, 410409117};
                int i4 = iArr2[7] % iArr2[8];
                qa4 qa4Var = new qa4();
                qa4Var.f8915a = new ArrayList();
                qa4Var.f8916b = 0;
                VarHandle.storeStoreFence();
                r50 r50Var = new r50((byte) 29);
                C1253ve c1253ve = new C1253ve(da4.f2450b, 0, new f70((byte) 28));
                c1253ve.f32551d = r50Var;
                VarHandle.storeStoreFence();
                int[] iArr3 = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
                int i5 = iArr3[7] % iArr3[8];
                ua4 ua4Var = new ua4();
                ua4Var.f12240a = qa4Var;
                ua4Var.f12242c = c1253ve;
                int[] iArr4 = {114723506, 151129280, 1368781114, 134385090, 816173334, -1981646764, 34563124, 1737518944, 282828202};
                int i6 = iArr4[7] % iArr4[8];
                C0310ra c0310ra = new C0310ra((byte) 18);
                c0310ra.f10609a = new ArrayDeque();
                VarHandle.storeStoreFence();
                ua4Var.f12241b = c0310ra;
                VarHandle.storeStoreFence();
                n94Var.f7594a = ua4Var;
                n94Var.f7595b = false;
                VarHandle.storeStoreFence();
                return n94Var;
            case 12:
                gf1 gf1Var = new gf1();
                gf1Var.f3928a = new ArrayDeque();
                gf1Var.f3931d = new ef1();
                VarHandle.storeStoreFence();
                return gf1Var;
            case 13:
                return new y85();
            case 14:
                gy2 gy2Var = new gy2();
                gy2Var.f4177a = new AtomicBoolean(false);
                gy2Var.f4178b = null;
                gy2Var.f4179c = null;
                VarHandle.storeStoreFence();
                return gy2Var;
            case 15:
                return new e95();
            case 16:
                return new x95();
            case 17:
                return p04.f8432a;
            case 18:
                return new za5();
            case 19:
                k83 k83Var = new k83();
                k83Var.f6122a = new gx2(false);
                k83Var.f6123b = new HashMap();
                VarHandle.storeStoreFence();
                return k83Var;
            case 20:
                return new kc1();
            case 21:
                return p04.a$2;
            case 22:
                return new kp3();
            case 23:
                return UUID.randomUUID().toString();
            case 24:
                return new mc5();
            case 25:
                return new rc5();
            case 26:
                return new gd5();
            case 27:
                C0244n c0244n = new C0244n();
                c0244n.f7448a = 1;
                k43.f22864D = c0244n.f7448a;
                return c0244n;
            case 28:
                EnumC0263nu enumC0263nu = AbstractC0241mu.f7403a;
                return 300000000;
            default:
                EnumC0263nu enumC0263nu2 = AbstractC0241mu.f7403a;
                return "1.6.0";
        }
    }
}
