package p000;

import ads_mobile_sdk.jr2;
import ads_mobile_sdk.su1;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import com.jakewharton.processphoenix.PhoenixActivity;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.text.BreakIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class i25 {

    /* JADX INFO: renamed from: a */
    public static final C0499bp f21076a = new C0499bp(2);

    /* JADX INFO: renamed from: b */
    public static final pg0 f21077b = new pg0(-1962497635, false, new tg0(22));

    /* JADX INFO: renamed from: c */
    public static final pg0 f21078c = new pg0(-300846738, false, new tg0(23));

    /* JADX INFO: renamed from: d */
    public static final pg0 f21079d = new pg0(638407708, false, new xg0(4));

    /* JADX INFO: renamed from: e */
    public static final pg0 f21080e = new pg0(1813131231, false, new tg0(24));

    /* JADX INFO: renamed from: f */
    public static final Class[] f21081f = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: g */
    public static final fh2[] f21082g = new fh2[0];

    /* JADX INFO: renamed from: h */
    public static final z45 f21083h = new z45(6);

    /* JADX INFO: renamed from: i */
    public static final kh5 f21084i = new kh5(8);

    /* JADX INFO: renamed from: A */
    public static final long m6602A(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : pb0.m9464c(j, pb0.m9465d(j) * f, 0.0f, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: B */
    public static final Object m6603B(ga3 ga3Var, xh3 xh3Var) {
        Object objMo7524b = ga3Var.get(xh3Var);
        if (objMo7524b == null) {
            objMo7524b = xh3Var.mo7524b();
        }
        return ((nw4) objMo7524b).mo3607b(ga3Var);
    }

    /* JADX INFO: renamed from: C */
    public static final nt2 m6604C(nt2 nt2Var, si2 si2Var, d63 d63Var, C1289wd c1289wd, boolean z, xh1 xh1Var, nv2 nv2Var, pc4 pc4Var) {
        d63 d63Var2 = d63.f16814a;
        kt2 kt2Var = kt2.f23428a;
        return nt2Var.mo7630d(d63Var == d63Var2 ? m6619m(kt2Var, ix1.f21856c) : m6619m(kt2Var, ix1.f21855b)).mo7630d(new xx3(c1289wd, pc4Var, xh1Var, nv2Var, d63Var, si2Var, z, false));
    }

    /* JADX INFO: renamed from: D */
    public static void m6605D(Context context) {
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        Intent leanbackLaunchIntentForPackage = packageManager.hasSystemFeature("android.software.leanback") ? packageManager.getLeanbackLaunchIntentForPackage(packageName) : null;
        if (leanbackLaunchIntentForPackage == null) {
            leanbackLaunchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
        }
        if (leanbackLaunchIntentForPackage == null) {
            C1077qn.m9989o(zi4.m13621u("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
            return;
        }
        Intent[] intentArr = {leanbackLaunchIntentForPackage};
        intentArr[0].addFlags(268468224);
        Intent intent = new Intent(context, (Class<?>) PhoenixActivity.class);
        intent.addFlags(268435456);
        intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intentArr)));
        intent.putExtra("phoenix_main_process_pid", Process.myPid());
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: E */
    public static final double m6606E(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX INFO: renamed from: F */
    public static final ga3 m6607F(zh3[] zh3VarArr, ga3 ga3Var, ga3 ga3Var2) {
        ga3 ga3Var3 = ga3.f19690d;
        fa3 fa3Var = new fa3(ga3Var3);
        fa3Var.f18880g = ga3Var3;
        for (zh3 zh3Var : zh3VarArr) {
            xh3 xh3Var = zh3Var.f36091a;
            if (zh3Var.f36098h || !ga3Var.containsKey(xh3Var)) {
                fa3Var.put(xh3Var, xh3Var.m12696d(zh3Var, (nw4) ga3Var2.get(xh3Var)));
            }
        }
        return fa3Var.mo5624a();
    }

    /* JADX INFO: renamed from: G */
    public static final k04 m6608G(rd6 rd6Var, xa0 xa0Var, k04 k04Var) {
        vr0 vr0Var;
        int i = xa0Var.f34093c;
        int i2 = xa0Var.f34092b;
        boolean z = rd6Var.f29196b;
        int i3 = z ? i2 : i;
        jl4 jl4Var = (jl4) xa0Var.f34095e;
        int i4 = xa0Var.f34094d;
        aj2 aj2Var = aj2.f14537b;
        m04 m04Var = new m04();
        m04Var.f24519a = xa0Var;
        m04Var.f24520b = i3;
        VarHandle.storeStoreFence();
        pg2 pg2VarM6630z = m6630z(aj2Var, m04Var);
        int i5 = z ? i : i2;
        n04 n04Var = new n04();
        n04Var.f25366a = xa0Var;
        n04Var.f25367b = i3;
        n04Var.f25368c = i5;
        n04Var.f25369d = rd6Var;
        n04Var.f25370e = pg2VarM6630z;
        VarHandle.storeStoreFence();
        pg2 pg2VarM6630z2 = m6630z(aj2Var, n04Var);
        if (1 != k04Var.f22801c) {
            return (k04) pg2VarM6630z2.getValue();
        }
        if (i3 == i4) {
            return k04Var;
        }
        if (((Number) pg2VarM6630z.getValue()).intValue() != jl4Var.f22401b.m13245d(i4)) {
            return (k04) pg2VarM6630z2.getValue();
        }
        int i6 = k04Var.f22800b;
        long jM7183i = jl4Var.m7183i(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (i2 < i) {
                    vr0Var = vr0.f32806b;
                } else {
                    vr0Var = i2 > i ? vr0.f32805a : vr0.f32807c;
                }
                if (!((vr0Var == vr0.f32805a) ^ z)) {
                }
            }
            return xa0Var.m12595a(i3);
        }
        int i7 = ql4.f28557c;
        return (i6 == ((int) (jM7183i >> 32)) || i6 == ((int) (4294967295L & jM7183i))) ? (k04) pg2VarM6630z2.getValue() : xa0Var.m12595a(i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m6609a(nt2 nt2Var, InterfaceC0520ca interfaceC0520ca, boolean z, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        int i3;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(380139498);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= ir1Var.m6890g(interfaceC0520ca) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ir1Var.m6892h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ir1Var.m6894i(pg0Var) ? 2048 : 1024;
        }
        byte b = 0;
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                nt2Var = kt2.f23428a;
            }
            if (i5 != 0) {
                interfaceC0520ca = ig1.f21378b;
            }
            if (i6 != 0) {
                z = false;
            }
            xq2 xq2VarM9704c = q20.m9704c(interfaceC0520ca, z);
            boolean zM6890g = ir1Var.m6890g(xq2VarM9704c) | ((i3 & 7168) == 2048);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                ne0 ne0Var = new ne0((byte) 7);
                ne0Var.f25728b = xq2VarM9704c;
                ne0Var.f25729c = pg0Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ne0Var);
                obj = ne0Var;
            }
            obj = objM6869O;
            ae4.m2948a(nt2Var, (mq1) obj, ir1Var, i3 & 14, 0);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            u20 u20Var = new u20(b);
            u20Var.f31611b = nt2Var;
            u20Var.f31615f = interfaceC0520ca;
            u20Var.f31612c = z;
            u20Var.f31616g = pg0Var;
            u20Var.f31613d = i;
            u20Var.f31614e = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = u20Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6610b(mi0 mi0Var, nt2 nt2Var) {
        C1180tf c1180tf = C1180tf.f31107i;
        ir1 ir1Var = (ir1) mi0Var;
        int iHashCode = Long.hashCode(ir1Var.f21683T);
        nt2 nt2VarM10006A = qq2.m10006A(mi0Var, nt2Var);
        ga3 ga3VarM6902m = ir1Var.m6902m();
        bi0.f15310ap.getClass();
        ir1 ir1Var2 = (ir1) mi0Var;
        if (ir1Var2.f21685a == null) {
            dt0.m4682E();
            throw null;
        }
        ir1Var2.m6893h0();
        if (ir1Var2.f21682S) {
            ir1Var2.m6900l(wf2.f33290T);
        } else {
            ir1Var2.m6911q0();
        }
        C0006a5.m53I(mi0Var, ia5.f21216g, c1180tf);
        C0006a5.m53I(mi0Var, ia5.f21215f, ga3VarM6902m);
        C0006a5.m50F(mi0Var);
        C0006a5.m53I(mi0Var, ia5.f21214e, nt2VarM10006A);
        C0006a5.m53I(mi0Var, ia5.f21217h, Integer.valueOf(iHashCode));
        ir1Var2.m6912r(true);
    }

    /* JADX INFO: renamed from: c */
    public static jr2 m6611c(wa2 wa2Var) {
        Map linkedHashMap;
        try {
            wa2 wa2Var2 = (wa2) new ou1().m9270c(su1.m2258a(wa2Var, "extra_query_params", "{}"), new cs4(wa2.class));
            linkedHashMap = new LinkedHashMap();
            Iterator it = ((nl2) wa2Var2.f33192a.entrySet()).iterator();
            while (((ml2) it).hasNext()) {
                ol2 ol2VarM8344a = ((ml2) it).m8344a();
                linkedHashMap.put((String) ol2VarM8344a.getKey(), ((ba2) ol2VarM8344a.getValue()).mo3532s());
            }
        } catch (Exception e) {
            ArrayList arrayList = i20.m6589n(e).f5884s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = w71.f33134a;
        }
        boolean zM2267a = su1.m2267a(wa2Var, "enable_prewarming", false);
        String strM2258a = su1.m2258a(wa2Var, "prefetch_url", "");
        boolean zM2267a2 = su1.m2267a(wa2Var, "skip_offline_notification_flow", false);
        boolean zM2267a3 = su1.m2267a(wa2Var, "enable_hsdp_service", false);
        String strM2258a2 = su1.m2258a(wa2Var, "target_package", "");
        int iM2255a = su1.m2255a(wa2Var, "hsdp_invocation_callback_bitmask", 0);
        String strM2258a3 = su1.m2258a(wa2Var, "referrer", "");
        jr2 jr2Var = new jr2();
        jr2Var.f5975a = zM2267a;
        jr2Var.f5976b = strM2258a;
        jr2Var.f5977c = zM2267a2;
        jr2Var.f5978d = zM2267a3;
        jr2Var.f5979e = strM2258a2;
        jr2Var.f5980f = iM2255a;
        jr2Var.f5981g = strM2258a3;
        jr2Var.f5982h = linkedHashMap;
        VarHandle.storeStoreFence();
        return jr2Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m6612d(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final l04 m6613e(rd6 rd6Var, g20 g20Var) {
        vr0 vr0VarM10303b = rd6Var.m10303b();
        xa0 xa0Var = (xa0) rd6Var.f29198d;
        boolean z = vr0VarM10303b == vr0.f32805a;
        return new l04(m6614f(xa0Var, z, true, g20Var), m6614f(xa0Var, z, false, g20Var), z);
    }

    /* JADX INFO: renamed from: f */
    public static final k04 m6614f(xa0 xa0Var, boolean z, boolean z2, g20 g20Var) {
        long j;
        long jMo5885d = g20Var.mo5885d(xa0Var, z2 ? xa0Var.f34092b : xa0Var.f34093c);
        if (z ^ z2) {
            int i = ql4.f28557c;
            j = jMo5885d >> 32;
        } else {
            int i2 = ql4.f28557c;
            j = 4294967295L & jMo5885d;
        }
        return xa0Var.m12595a((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[LOOP:0: B:21:0x0053->B:25:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public static final java.lang.Object m6615g(p000.uf4 r7, p000.AbstractC0888lx r8) {
        /*
            boolean r0 = r8 instanceof p000.rp3
            if (r0 == 0) goto L13
            r0 = r8
            rp3 r0 = (p000.rp3) r0
            int r1 = r0.f29516v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29516v = r1
            goto L18
        L13:
            rp3 r0 = new rp3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29515u
            ap0 r1 = p000.ap0.f14763a
            int r2 = r0.f29516v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            uf4 r7 = r0.f29514t
            p000.k43.m7376J(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r7)
            r7 = 0
            return r7
        L30:
            p000.k43.m7376J(r8)
        L33:
            r0.f29514t = r7
            r0.f29516v = r3
            fc3 r8 = p000.fc3.f18904b
            java.lang.Object r8 = r7.m11538a(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            ec3 r8 = (p000.ec3) r8
            int r2 = r8.f18003d
            java.util.List r8 = r8.f18000a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
            r5 = r4
        L53:
            if (r5 >= r2) goto L65
            java.lang.Object r6 = r8.get(r5)
            lc3 r6 = (p000.lc3) r6
            boolean r6 = p000.AbstractC1356y5.m12920n(r6)
            if (r6 != 0) goto L62
            goto L33
        L62:
            int r5 = r5 + 1
            goto L53
        L65:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i25.m6615g(uf4, lx):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    public static final int m6616h(int i, uw2 uw2Var) {
        int i2 = uw2Var.f32213c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = uw2Var.f32211a;
            int i5 = ((r62) objArr[i4]).f29056a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((r62) objArr[i3]).f29056a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m6617k(Object obj) {
        if (obj instanceof p94) {
            p94 p94Var = (p94) obj;
            if (p94Var.mo131e() == o85.f26450j || p94Var.mo131e() == ia5.f21230u || p94Var.mo131e() == o85.f26454n) {
                Object value = p94Var.getValue();
                if (value == null) {
                    return true;
                }
                return m6617k(value);
            }
        } else if (!(obj instanceof iq1) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f21081f[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final k04 m6618l(k04 k04Var, xa0 xa0Var, int i) {
        return new k04(((jl4) xa0Var.f34095e).m7175a(i), i, k04Var.f22801c);
    }

    /* JADX INFO: renamed from: m */
    public static final nt2 m6619m(nt2 nt2Var, p44 p44Var) {
        return se0.m10694G(nt2Var, 0.0f, 0.0f, p44Var, true, 1042431);
    }

    /* JADX INFO: renamed from: n */
    public static final nt2 m6620n(nt2 nt2Var) {
        return se0.m10694G(nt2Var, 0.0f, 0.0f, null, true, 1044479);
    }

    /* JADX INFO: renamed from: p */
    public static final double m6621p(double d, m41 m41Var, m41 m41Var2) {
        TimeUnit timeUnit = m41Var2.f24636a;
        TimeUnit timeUnit2 = m41Var.f24636a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d * jConvert : d / timeUnit2.convert(1L, timeUnit);
    }

    /* JADX INFO: renamed from: q */
    public static final long m6622q(long j, m41 m41Var) {
        long j2;
        int iOrdinal = m41Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                nm0.m8798k(m41Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

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
    /* JADX INFO: renamed from: r */
    public static final g25 m6623r(Context context, ik0 ik0Var) {
        sq3 sq3Var;
        String name;
        vq3 vq3VarMo3062e;
        l73 l73Var;
        boolean zContainsKey;
        Executor executor = ik0Var.f21505b;
        j25 j25Var = new j25();
        j25Var.f21975d = new Handler(Looper.getMainLooper());
        bu3 bu3Var = new bu3((byte) 1);
        bu3Var.f15636b = j25Var;
        VarHandle.storeStoreFence();
        j25Var.f21976e = bu3Var;
        j24 j24Var = new j24(executor);
        j25Var.f21972a = j24Var;
        so0 so0VarM10119x = qs5.m10119x(j24Var);
        j25Var.f21973b = so0VarM10119x;
        qs5.m10119x(new j24(executor));
        j25Var.f21974c = zp0.m13670b(so0VarM10119x);
        VarHandle.storeStoreFence();
        Context applicationContext = context.getApplicationContext();
        i50 i50Var = ik0Var.f21506c;
        byte b = 22;
        if (context.getResources().getBoolean(C0995R.bool.workmanager_test_configuration)) {
            sq3Var = new sq3(applicationContext, null);
            sq3Var.f30497i = true;
        } else {
            if (hd4.m6345k0("androidx.work.workdb")) {
                C1077qn.m9987m("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            sq3 sq3Var2 = new sq3(applicationContext, "androidx.work.workdb");
            C1040pn c1040pn = new C1040pn(b);
            c1040pn.f27754b = applicationContext;
            VarHandle.storeStoreFence();
            sq3Var2.f30496h = c1040pn;
            sq3Var = sq3Var2;
        }
        ArrayList arrayList = sq3Var.f30492d;
        sq3Var.f30494f = j24Var;
        w90 w90Var = new w90((byte) 0);
        w90Var.f33167b = i50Var;
        VarHandle.storeStoreFence();
        arrayList.add(w90Var);
        sq3Var.m10901a(bt2.f15585h);
        sq3Var.m10901a(new ko3(applicationContext, 2, 3));
        sq3Var.m10901a(bt2.f15586i);
        sq3Var.m10901a(bt2.f15587j);
        sq3Var.m10901a(new ko3(applicationContext, 5, 6));
        sq3Var.m10901a(bt2.f15588k);
        sq3Var.m10901a(bt2.f15589l);
        sq3Var.m10901a(bt2.f15590m);
        byte b2 = 9;
        ko3 ko3Var = new ko3(b2, 10);
        ko3Var.f23289d = applicationContext;
        VarHandle.storeStoreFence();
        sq3Var.m10901a(ko3Var);
        sq3Var.m10901a(new ko3(applicationContext, 10, 11));
        sq3Var.m10901a(bt2.f15581d);
        sq3Var.m10901a(bt2.f15582e);
        sq3Var.m10901a(bt2.f15583f);
        sq3Var.m10901a(bt2.f15584g);
        sq3Var.m10901a(new ko3(applicationContext, 21, 22));
        sq3Var.f30504p = false;
        sq3Var.f30505q = true;
        sq3Var.f30506r = true;
        LinkedHashSet linkedHashSet = sq3Var.f30501m;
        Executor executor2 = sq3Var.f30494f;
        if (executor2 == null && sq3Var.f30495g == null) {
            ExecutorC0952nn executorC0952nn = C0989on.f26894t;
            sq3Var.f30495g = executorC0952nn;
            sq3Var.f30494f = executorC0952nn;
        } else if (executor2 != null && sq3Var.f30495g == null) {
            sq3Var.f30495g = executor2;
        } else if (executor2 == null) {
            sq3Var.f30494f = sq3Var.f30495g;
        }
        LinkedHashSet linkedHashSet2 = sq3Var.f30502n;
        if (!linkedHashSet2.isEmpty()) {
            Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    C1077qn.m9988n(c75.m3877i(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        ye4 q50Var = sq3Var.f30496h;
        if (q50Var == null) {
            q50Var = new q50(b2);
        }
        if (sq3Var.f30499k > 0) {
            if (sq3Var.f30491c != null) {
                C1077qn.m9987m("Required value was null.");
                return null;
            }
            C1077qn.m9987m("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        Context context2 = sq3Var.f30490b;
        String str = sq3Var.f30491c;
        cp2 cp2Var = sq3Var.f30500l;
        boolean z = sq3Var.f30497i;
        tq3 tq3Var = sq3Var.f30498j;
        tq3Var.getClass();
        if (tq3Var == tq3.f31335a) {
            Object systemService = context2.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            tq3Var = (activityManager == null || activityManager.isLowRamDevice()) ? tq3.f31336b : tq3.f31337c;
        }
        Executor executor3 = sq3Var.f30494f;
        if (executor3 == null) {
            C1077qn.m9987m("Required value was null.");
            return null;
        }
        Executor executor4 = sq3Var.f30495g;
        if (executor4 == null) {
            C1077qn.m9987m("Required value was null.");
            return null;
        }
        boolean z2 = sq3Var.f30504p;
        boolean z3 = sq3Var.f30505q;
        ArrayList arrayList2 = sq3Var.f30493e;
        ArrayList arrayList3 = sq3Var.f30503o;
        ye4 ye4Var = q50Var;
        boolean z4 = sq3Var.f30506r;
        wu0 wu0Var = new wu0();
        wu0Var.f33729a = cp2Var;
        wu0Var.f33730b = z;
        wu0Var.f33731c = tq3Var;
        wu0Var.f33732d = executor3;
        wu0Var.f33733e = executor4;
        wu0Var.f33734f = z2;
        wu0Var.f33735g = z3;
        wu0Var.f33736h = linkedHashSet;
        wu0Var.f33737i = arrayList2;
        wu0Var.f33738j = arrayList3;
        wu0Var.f33739k = z4;
        VarHandle.storeStoreFence();
        wu0Var.f33740l = sq3Var.f30507s;
        Class cls = sq3Var.f30489a.f29101a;
        Package r2 = cls.getPackage();
        if (r2 == null || (name = r2.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strConcat = canonicalName.replace('.', '_').concat("_Impl");
        try {
            wm0 wm0Var = null;
            WorkDatabase workDatabase = (WorkDatabase) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
            workDatabase.f14695j = wu0Var.f33740l;
            try {
                vq3VarMo3062e = workDatabase.mo3062e();
            } catch (t13 unused) {
                vq3VarMo3062e = null;
            }
            byte b3 = 8;
            if (vq3VarMo3062e == null) {
                C1122rv c1122rv = new C1122rv(b3, false);
                c1122rv.f29651b = wu0Var;
                c1122rv.f29652c = new rq3("", -1, "");
                c1122rv.f29653d = arrayList;
                b71 b71Var = new b71((byte) 26);
                b71Var.f15141b = c1122rv;
                VarHandle.storeStoreFence();
                w90 w90Var2 = new w90((byte) 1);
                w90Var2.f33167b = b71Var;
                VarHandle.storeStoreFence();
                hb0.m6311W0(arrayList, w90Var2);
                throw new t13();
            }
            C1122rv c1122rv2 = new C1122rv(b3, false);
            c1122rv2.f29651b = wu0Var;
            c1122rv2.f29652c = vq3VarMo3062e;
            c1122rv2.f29653d = arrayList;
            hf0 hf0Var = new hf0(c1122rv2, vq3VarMo3062e.f32800a);
            xe4 xe4Var = new xe4();
            xe4Var.f34206a = context2;
            xe4Var.f34207b = str;
            xe4Var.f34208c = hf0Var;
            xe4Var.f34209d = false;
            xe4Var.f34210e = false;
            VarHandle.storeStoreFence();
            ze4 ze4VarMo9571a = ye4Var.mo9571a(xe4Var);
            w42 w42Var = new w42((byte) 15, false);
            w42Var.f33090b = ze4VarMo9571a;
            VarHandle.storeStoreFence();
            we4 we4Var = new we4();
            we4Var.f33280a = w42Var;
            VarHandle.storeStoreFence();
            c1122rv2.f29654e = we4Var;
            boolean z5 = wu0Var.f33731c == tq3.f31337c;
            ze4 ze4VarM10458q = c1122rv2.m10458q();
            if (ze4VarM10458q != null) {
                ze4VarM10458q.setWriteAheadLoggingEnabled(z5);
            }
            VarHandle.storeStoreFence();
            workDatabase.f14689d = c1122rv2;
            workDatabase.f14690e = workDatabase.mo3061d();
            cp2 cp2Var2 = wu0Var.f33729a;
            List list = wu0Var.f33738j;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<r90> setMo3066i = workDatabase.mo3066i();
            int size = setMo3066i.size();
            boolean[] zArr = new boolean[size];
            for (r90 r90Var : setMo3066i) {
                int size2 = list.size() - 1;
                if (size2 < 0) {
                    size2 = -1;
                    break;
                }
                while (true) {
                    int i = size2 - 1;
                    if (r90Var.m10250c(list.get(size2))) {
                        zArr[size2] = true;
                        break;
                    }
                    if (i < 0) {
                        size2 = -1;
                        break;
                    }
                    size2 = i;
                }
                if (size2 < 0) {
                    xy4.m12783l("A required auto migration spec (", r90Var.m10248a(), ") is missing in the database configuration.");
                    return null;
                }
                linkedHashMap.put(r90Var, list.get(size2));
            }
            int size3 = list.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i2 = size3 - 1;
                    if (size3 >= size || !zArr[size3]) {
                        C1077qn.m9987m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        return null;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size3 = i2;
                }
            }
            for (at2 at2Var : workDatabase.mo3060c(linkedHashMap)) {
                byte b4 = at2Var.f14858a;
                byte b5 = at2Var.f14859b;
                cp2Var2.getClass();
                LinkedHashMap linkedHashMap2 = cp2Var2.f16332a;
                if (linkedHashMap2.containsKey(Integer.valueOf(b4))) {
                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(b4));
                    if (map == null) {
                        map = w71.f33134a;
                    }
                    zContainsKey = map.containsKey(Integer.valueOf(b5));
                } else {
                    zContainsKey = false;
                }
                if (!zContainsKey) {
                    cp2Var2.m4102a(at2Var);
                }
            }
            List list2 = wu0Var.f33737i;
            LinkedHashMap linkedHashMapMo3067j = workDatabase.mo3067j();
            boolean[] zArr2 = new boolean[linkedHashMapMo3067j.size()];
            for (Map.Entry entry : linkedHashMapMo3067j.entrySet()) {
                r90 r90Var2 = (r90) entry.getKey();
                for (r90 r90Var3 : (List) entry.getValue()) {
                    int size4 = list2.size() - 1;
                    if (size4 < 0) {
                        size4 = -1;
                        break;
                    }
                    while (true) {
                        int i3 = size4 - 1;
                        if (r90Var3.m10250c(list2.get(size4))) {
                            zArr2[size4] = true;
                            break;
                        }
                        if (i3 < 0) {
                            size4 = -1;
                            break;
                        }
                        size4 = i3;
                    }
                    if (size4 < 0) {
                        xy4.m12784m("A required type converter (", r90Var3.m10248a(), ") for ", r90Var2.m10248a(), " is missing in the database configuration.");
                        return null;
                    }
                    workDatabase.f14694i.put(r90Var3, list2.get(size4));
                }
            }
            int size5 = list2.size() - 1;
            if (size5 >= 0) {
                while (true) {
                    int i4 = size5 - 1;
                    if (!zArr2[size5]) {
                        xy4.m12789r("Unexpected type converter ", list2.get(size5), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        return null;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size5 = i4;
                }
            }
            workDatabase.f14687b = wu0Var.f33732d;
            Executor executor5 = wu0Var.f33733e;
            po4 po4Var = new po4();
            po4Var.f27864a = executor5;
            po4Var.f27865b = new ArrayDeque();
            po4Var.f27867d = new Object();
            VarHandle.storeStoreFence();
            workDatabase.f14688c = po4Var;
            Executor executor6 = workDatabase.f14687b;
            if (executor6 == null) {
                z62.m13366Y("internalQueryExecutor");
                throw null;
            }
            um0 um0VarM13670b = zp0.m13670b(qs5.m10089N(qs5.m10119x(executor6), AbstractC0647fd.m5675m()));
            workDatabase.f14686a = um0VarM13670b;
            ro0 ro0Var = um0VarM13670b.f31989a;
            po4 po4Var2 = workDatabase.f14688c;
            if (po4Var2 == null) {
                z62.m13366Y("internalTransactionExecutor");
                throw null;
            }
            ro0Var.plus(qs5.m10119x(po4Var2));
            workDatabase.f14692g = wu0Var.f33730b;
            C1122rv c1122rv3 = workDatabase.f14689d;
            if (c1122rv3 == null) {
                z62.m13366Y("connectionManager");
                throw null;
            }
            ze4 ze4VarM10458q2 = c1122rv3.m10458q();
            if (ze4VarM10458q2 == null) {
                ze4VarM10458q2 = null;
                break;
            }
            while (!(ze4VarM10458q2 instanceof fd3)) {
                if (!(ze4VarM10458q2 instanceof rx0)) {
                    ze4VarM10458q2 = null;
                    break;
                }
                ze4VarM10458q2 = ((rx0) ze4VarM10458q2).m10482a();
            }
            C1122rv c1122rv4 = workDatabase.f14689d;
            if (c1122rv4 == null) {
                z62.m13366Y("connectionManager");
                throw null;
            }
            ze4 ze4VarM10458q3 = c1122rv4.m10458q();
            if (ze4VarM10458q3 == null) {
                ze4VarM10458q3 = null;
                break;
            }
            while (!(ze4VarM10458q3 instanceof AbstractC0844kq)) {
                if (!(ze4VarM10458q3 instanceof rx0)) {
                    ze4VarM10458q3 = null;
                    break;
                }
                ze4VarM10458q3 = ((rx0) ze4VarM10458q3).m10482a();
            }
            Context applicationContext2 = context.getApplicationContext();
            C0556cz c0556cz = new C0556cz(applicationContext2.getApplicationContext(), j25Var, (byte) 0);
            C0556cz c0556cz2 = new C0556cz(applicationContext2.getApplicationContext(), j25Var, (byte) 1);
            C0556cz c0556cz3 = new C0556cz(applicationContext2.getApplicationContext(), j25Var, (byte) 2);
            ko4 ko4Var = new ko4();
            ko4Var.f23290a = applicationContext2;
            ko4Var.f23291b = c0556cz;
            ko4Var.f23292c = c0556cz2;
            ko4Var.f23293d = c0556cz3;
            VarHandle.storeStoreFence();
            Context applicationContext3 = context.getApplicationContext();
            jg3 jg3Var = new jg3();
            jg3Var.f22247a = applicationContext3;
            jg3Var.f22248b = ik0Var;
            jg3Var.f22249c = j25Var;
            jg3Var.f22250d = workDatabase;
            jg3Var.f22252f = new HashMap();
            jg3Var.f22251e = new HashMap();
            jg3Var.f22254h = new HashSet();
            jg3Var.f22255i = new ArrayList();
            jg3Var.f22256j = new Object();
            jg3Var.f22253g = new HashMap();
            VarHandle.storeStoreFence();
            List list3 = (List) h25.f20286b.mo6204c(context, ik0Var, j25Var, workDatabase, ko4Var, jg3Var);
            Context applicationContext4 = context.getApplicationContext();
            g25 g25Var = new g25();
            g25Var.f19519h = false;
            Context applicationContext5 = applicationContext4.getApplicationContext();
            if (applicationContext5.isDeviceProtectedStorage()) {
                C1077qn.m9989o("Cannot initialize WorkManager in direct boot mode");
                return null;
            }
            wn2 wn2Var = new wn2(ik0Var.f21510g);
            synchronized (wn2.f33516b) {
                try {
                    if (wn2.f33517c == null) {
                        wn2.f33517c = wn2Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            g25Var.f19512a = applicationContext5;
            g25Var.f19515d = j25Var;
            g25Var.f19514c = workDatabase;
            g25Var.f19517f = jg3Var;
            g25Var.f19521j = ko4Var;
            g25Var.f19513b = ik0Var;
            g25Var.f19516e = list3;
            um0 um0Var = j25Var.f21974c;
            wd3 wd3Var = new wd3((byte) 0);
            wd3Var.f33259b = workDatabase;
            VarHandle.storeStoreFence();
            g25Var.f19518g = wd3Var;
            j24 j24Var2 = j25Var.f21972a;
            String str2 = ew3.f18545a;
            dw3 dw3Var = new dw3();
            dw3Var.f17463a = j24Var2;
            dw3Var.f17464b = workDatabase;
            dw3Var.f17465c = list3;
            dw3Var.f17466d = ik0Var;
            VarHandle.storeStoreFence();
            jg3Var.m7104a(dw3Var);
            cn1 cn1Var = new cn1();
            cn1Var.f16138a = applicationContext5.getApplicationContext();
            cn1Var.f16139b = g25Var;
            cn1Var.f16140c = wd3Var;
            cn1Var.f16141d = 0;
            VarHandle.storeStoreFence();
            j25Var.f21972a.execute(cn1Var);
            String str3 = du4.f17414a;
            int i5 = ig3.f21407a;
            if (Application.getProcessName().equals(applicationContext5.getApplicationInfo().processName)) {
                WorkDatabase workDatabase2 = workDatabase.mo3080w().f31629a;
                ro4 ro4Var = new ro4((byte) 27);
                VarHandle.storeStoreFence();
                n72 n72VarM3064g = workDatabase2.m3064g();
                String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
                mq4 mq4Var = n72VarM3064g.f25491b;
                mq4Var.getClass();
                t34 t34Var = new t34();
                for (String str4 : strArr) {
                    Set set = (Set) ((LinkedHashMap) mq4Var.f25142c).get(str4.toLowerCase(Locale.ROOT));
                    if (set != null) {
                        t34Var.addAll(set);
                    } else {
                        t34Var.add(str4);
                    }
                }
                String[] strArr2 = (String[]) vd6.m11847f(t34Var).toArray(new String[0]);
                int length = strArr2.length;
                int[] iArr = new int[length];
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        l73Var = new l73(strArr2, iArr);
                        break;
                    }
                    String str5 = strArr2[i6];
                    Integer num = (Integer) ((LinkedHashMap) mq4Var.f25143d).get(str5.toLowerCase(Locale.ROOT));
                    if (num == null) {
                        C1077qn.m9987m("There is no table with name ".concat(str5));
                        l73Var = null;
                        break;
                    }
                    iArr[i6] = num.intValue();
                    i6++;
                }
                si1 si1VarM3260s = as4.m3260s(qq2.m10032p(new C1312wz((Object) mq4Var, l73Var.f23834b, l73Var.f23833a, wm0Var, (byte) 11)), -1);
                hk1 hk1Var = new hk1();
                hk1Var.f20635a = si1VarM3260s;
                hk1Var.f20636b = workDatabase2;
                hk1Var.f20637c = ro4Var;
                VarHandle.storeStoreFence();
                cu4 cu4Var = new cu4(4, null);
                aj1 aj1Var = new aj1((byte) 1);
                aj1Var.f14534b = hk1Var;
                aj1Var.f14535c = cu4Var;
                VarHandle.storeStoreFence();
                si1 si1VarM13840D = zy5.m13840D(as4.m3260s(aj1Var, -1));
                wp4 wp4Var = new wp4(applicationContext5, wm0Var, (byte) 2);
                aj1 aj1Var2 = new aj1((byte) 4);
                aj1Var2.f14535c = si1VarM13840D;
                aj1Var2.f14534b = wp4Var;
                VarHandle.storeStoreFence();
                lb5.m7910S(um0Var, null, null, new C0982og((Object) aj1Var2, wm0Var, (byte) 7), 3);
            }
            VarHandle.storeStoreFence();
            return g25Var;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName(), e3);
        }
    }

    /* JADX INFO: renamed from: s */
    public static byte[] m6624s(String str) {
        if (str.length() % 2 != 0) {
            C1077qn.m9987m("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                C1077qn.m9987m("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: t */
    public static final l04 m6625t(l04 l04Var, rd6 rd6Var) {
        int iFollowing;
        xa0 xa0Var = (xa0) rd6Var.f29198d;
        if (l04Var != null) {
            k04 k04Var = l04Var.f23668a;
            long j = k04Var.f22801c;
            k04 k04Var2 = l04Var.f23669b;
            if (j != k04Var2.f22801c) {
                boolean z = l04Var.f23670c;
                if ((z ? k04Var : k04Var2).f22800b != 0) {
                    return l04Var;
                }
                if (z) {
                    k04Var = k04Var2;
                }
                if (((jl4) xa0Var.f34095e).f22400a.f21533a.f24092b.length() != k04Var.f22800b) {
                    return l04Var;
                }
            } else if (k04Var.f22800b != k04Var2.f22800b) {
                return l04Var;
            }
        }
        l04 l04Var2 = (l04) rd6Var.f29197c;
        String str = ((jl4) xa0Var.f34095e).f22400a.f21533a.f24092b;
        if (l04Var2 == null || str.length() == 0) {
            return l04Var;
        }
        boolean z2 = rd6Var.f29196b;
        String str2 = ((jl4) xa0Var.f34095e).f22400a.f21533a.f24092b;
        int i = xa0Var.f34092b;
        int length = str2.length();
        if (i == 0) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str2);
            int iFollowing2 = characterInstance.following(0);
            return z2 ? l04.m7761a(l04Var, m6618l(l04Var.f23668a, xa0Var, iFollowing2), null, true, 2) : l04.m7761a(l04Var, null, m6618l(l04Var.f23669b, xa0Var, iFollowing2), false, 1);
        }
        if (i == length) {
            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
            characterInstance2.setText(str2);
            int iPreceding = characterInstance2.preceding(length);
            return z2 ? l04.m7761a(l04Var, m6618l(l04Var.f23668a, xa0Var, iPreceding), null, false, 2) : l04.m7761a(l04Var, null, m6618l(l04Var.f23669b, xa0Var, iPreceding), true, 1);
        }
        boolean z3 = l04Var2.f23670c;
        if (z2 ^ z3) {
            BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
            characterInstance3.setText(str2);
            iFollowing = characterInstance3.preceding(i);
        } else {
            BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
            characterInstance4.setText(str2);
            iFollowing = characterInstance4.following(i);
        }
        return z2 ? l04.m7761a(l04Var, m6618l(l04Var.f23668a, xa0Var, iFollowing), null, z3, 2) : l04.m7761a(l04Var, null, m6618l(l04Var.f23669b, xa0Var, iFollowing), z3, 1);
    }

    /* JADX INFO: renamed from: v */
    public static final Object m6626v(Optional optional, Object obj) {
        return optional.isPresent() ? optional.get() : obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public static final Object m6627w(om4 om4Var, nq1 nq1Var, Throwable th, ym0 ym0Var) throws IllegalAccessException, InvocationTargetException {
        wi1 wi1Var;
        if (ym0Var instanceof wi1) {
            wi1Var = (wi1) ym0Var;
            int i = wi1Var.f33406v;
            if ((i & Integer.MIN_VALUE) != 0) {
                wi1Var.f33406v = i - Integer.MIN_VALUE;
            } else {
                wi1Var = new wi1(ym0Var);
            }
        } else {
            wi1Var = new wi1(ym0Var);
        }
        Object obj = wi1Var.f33405u;
        Object obj2 = ap0.f14763a;
        int i2 = wi1Var.f33406v;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                wi1Var.f33404t = th;
                wi1Var.f33406v = 1;
                if (nq1Var.invoke(om4Var, th, wi1Var) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = wi1Var.f33404t;
                k43.m7376J(obj);
            }
            return ju4.f22634a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                se0.m10720f(th2, th);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m6628x(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m6629y(mi0 mi0Var) {
        return (((Configuration) ((ir1) mi0Var).m6898k(AndroidCompositionLocals_androidKt.f14650a)).uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: z */
    public static pg2 m6630z(aj2 aj2Var, wp1 wp1Var) {
        o85 o85Var = o85.f26458r;
        int iOrdinal = aj2Var.ordinal();
        if (iOrdinal == 0) {
            return new dg4(wp1Var);
        }
        if (iOrdinal == 1) {
            du3 du3Var = new du3();
            du3Var.f17412a = wp1Var;
            du3Var.f17413b = o85Var;
            return du3Var;
        }
        if (iOrdinal != 2) {
            C0670g.m5864c();
            return null;
        }
        yu4 yu4Var = new yu4();
        yu4Var.f35542a = wp1Var;
        yu4Var.f35543b = o85Var;
        return yu4Var;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC1074qk mo6631i(Context context, Looper looper, C0602e8 c0602e8, Object obj, rt1 rt1Var, st1 st1Var) {
        return mo6632j(context, looper, c0602e8, obj, (ol5) rt1Var, (ol5) st1Var);
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC1074qk mo6632j(Context context, Looper looper, C0602e8 c0602e8, Object obj, ol5 ol5Var, ol5 ol5Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    /* JADX INFO: renamed from: o */
    public boolean mo6633o(yh3 yh3Var) {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public Object mo6634u() {
        throw new IllegalStateException("");
    }
}
