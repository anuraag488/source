package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.ConnectivityManager;
import android.provider.Settings;
import android.view.AttachedSurfaceControl;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jp1 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22484a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22485b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22486c;

    public /* synthetic */ jp1(byte b) {
        this.f22484a = b;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d7 A[LOOP:1: B:107:0x02a4->B:117:0x02d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x02da A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [mt2] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [mt2] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [uw2] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [uw2] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v12 */
    @Override // p000.wp1
    public final Object invoke() throws PendingIntent.CanceledException {
        String[] strArrNames;
        HashSet hashSet;
        long j;
        kl4 kl4VarM11577d;
        uj2 uj2Var;
        C0875lk c0875lk;
        Region region = null;
        boolean z = false;
        boolean z2 = true;
        switch (this.f22484a) {
            case 0:
                xn2 xn2Var = (xn2) this.f22485b;
                pp1 pp1Var = (pp1) this.f22486c;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "reward earned", null);
                    }
                }
                pp1Var.f27883e = true;
                return ju4.f22634a;
            case 1:
                ir1 ir1Var = (ir1) this.f22485b;
                uu2 uu2Var = (uu2) this.f22486c;
                ir1Var.m6860F(uu2Var.f32179a, uu2Var.f32185g, uu2Var.f32180b, true);
                return ju4.f22634a;
            case 2:
                ((nw1) this.f22485b).m8870d((mt2) this.f22486c);
                return ju4.f22634a;
            case 3:
                g24 g24Var = (g24) this.f22485b;
                i92 i92Var = (i92) this.f22486c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                s92 s92Var = i92Var.f21188a;
                qa2.m9807d(i92Var, g24Var);
                int iMo4432d = g24Var.mo4432d();
                for (int i = 0; i < iMo4432d; i++) {
                    List listMo4435i = g24Var.mo4435i(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listMo4435i) {
                        if (obj instanceof pa2) {
                            arrayList.add(obj);
                        }
                    }
                    pa2 pa2Var = (pa2) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (pa2Var != null && (strArrNames = pa2Var.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = z62.m13387o(g24Var.mo4431c(), l24.f23749j) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new y92(kx5.m7687R(-1, "The suggested name '" + str + "' for " + str2 + ' ' + g24Var.mo4433e(i) + " is already one of the names for " + str2 + ' ' + g24Var.mo4433e(((Number) eq2.m5273L(str, linkedHashMap)).intValue()) + " in " + g24Var, null, null, null), null);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? w71.f33134a : linkedHashMap;
            case 4:
                wf2 wf2Var = (wf2) this.f22485b;
                ql3 ql3Var = (ql3) this.f22486c;
                C0940nb c0940nb = wf2Var.f33299G;
                if ((((mt2) c0940nb.f25610g).f25198d & 8) != 0) {
                    for (mt2 mt2Var = (vh4) c0940nb.f25609f; mt2Var != null; mt2Var = mt2Var.f25199e) {
                        if ((mt2Var.f25197c & 8) != 0) {
                            ?? M10644P = mt2Var;
                            ?? uw2Var = 0;
                            while (M10644P != 0) {
                                if (M10644P instanceof g14) {
                                    g14 g14Var = (g14) M10644P;
                                    if (g14Var.mo5882k0()) {
                                        e14 e14Var = new e14();
                                        ql3Var.f28555a = e14Var;
                                        e14Var.f17634d = true;
                                    }
                                    if (g14Var.mo5883n0()) {
                                        ((e14) ql3Var.f28555a).f17633c = true;
                                    }
                                    g14Var.mo4513i0((q14) ql3Var.f28555a);
                                } else if ((M10644P.f25197c & 8) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                                    int i2 = 0;
                                    while (mt2Var2 != null) {
                                        if ((mt2Var2.f25197c & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                M10644P = M10644P;
                                                uw2Var = uw2Var;
                                                uw2Var = uw2Var;
                                                M10644P = mt2Var2;
                                            } else {
                                                if (uw2Var == 0) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var.m11663b(mt2Var2);
                                            }
                                        } else {
                                            M10644P = M10644P;
                                            uw2Var = uw2Var;
                                        }
                                        mt2Var2 = mt2Var2.f25200f;
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    if (i2 == 1) {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    } else {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var);
                            }
                        }
                    }
                }
                return ju4.f22634a;
            case 5:
                return new vi2((lu3) this.f22485b, w71.f33134a, (iu3) this.f22486c);
            case 6:
                return Boolean.valueOf(((wf4) ((sw2) this.f22486c).getValue()) == ((wf4) this.f22485b));
            case 7:
                C0910mi c0910mi = (C0910mi) this.f22485b;
                C0910mi c0910mi2 = (C0910mi) this.f22486c;
                if (!c0910mi.m8329e() && !c0910mi2.m8329e()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 8:
                C0910mi c0910mi3 = (C0910mi) this.f22485b;
                sw2 sw2Var = (sw2) this.f22486c;
                if (((Number) c0910mi3.m8328d()).floatValue() >= 1.0f) {
                    fs1 fs1Var = (fs1) sw2Var.getValue();
                    if ((fs1Var instanceof es1) && ((es1) fs1Var).f18430a <= 0.0f) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 9:
                aw3 aw3Var = (aw3) this.f22485b;
                wp1 wp1Var = (wp1) this.f22486c;
                int size = aw3Var.f14916a.size() - aw3Var.f14918c.mo12427b().size();
                for (int i3 = 0; i3 < size; i3++) {
                    wp1Var.invoke();
                }
                return ju4.f22634a;
            case 10:
                tt2 tt2Var = (tt2) this.f22485b;
                al3 al3Var = (al3) this.f22486c;
                if (((C1339xp) tt2Var.f31428b).get() == 0) {
                    al3Var.invoke();
                }
                return ju4.f22634a;
            case 11:
                Context context = (Context) this.f22485b;
                C0950nl c0950nl = (C0950nl) this.f22486c;
                Object obj2 = a23.f66a;
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
                synchronized (a23.f66a) {
                    if (string != null) {
                        try {
                            if (!string.equals(a23.f67b)) {
                                String[] strArrSplit = string.split(":", -1);
                                HashSet hashSet2 = new HashSet(strArrSplit.length);
                                for (String str3 : strArrSplit) {
                                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str3);
                                    if (componentNameUnflattenFromString != null) {
                                        hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                    }
                                }
                                a23.f68c = hashSet2;
                                a23.f67b = string;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hashSet = a23.f68c;
                    break;
                }
                if (hashSet == null || !hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        if (z62.m13387o((String) it.next(), c0950nl.f25922c)) {
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 12:
                ((th0) this.f22485b).f31161p = (mq1) this.f22486c;
                return ju4.f22634a;
            case 13:
                return C0638f5.m5541l((Context) this.f22485b, ((vd3) this.f22486c).f32533a.concat(".preferences_pb"));
            case 14:
                mw2 mw2Var = (mw2) this.f22485b;
                zi0 zi0Var = (zi0) this.f22486c;
                Object[] objArr = mw2Var.f25258b;
                long[] jArr = mw2Var.f25257a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j2 = jArr[i4];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j2) < 128) {
                                    zi0Var.m13572A(objArr[(i4 << 3) + i6]);
                                }
                                j2 >>= 8;
                            }
                            if (i5 == 8) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        } else if (i4 != length) {
                            i4++;
                        }
                    }
                }
                return ju4.f22634a;
            case 15:
                ((ql3) this.f22485b).f28555a = ((C1366yf) this.f22486c).f35178p.invoke();
                return ju4.f22634a;
            case 16:
                ro0 ro0Var = (ro0) this.f22485b;
                wp1 wp1Var2 = (wp1) this.f22486c;
                pw3 pw3Var = new pw3();
                pw3Var.f28050a = zp0.m13670b(ro0Var.plus(new v82((t82) ro0Var.get(o85.f26448h))).plus((ro0) wp1Var2.invoke()));
                VarHandle.storeStoreFence();
                return pw3Var;
            case 17:
                jl1 jl1Var = (jl1) this.f22485b;
                ea4 ea4Var = (ea4) this.f22486c;
                jl1.m7164a(jl1Var);
                if (ea4Var != null) {
                    ((ay0) ea4Var).m3366b();
                }
                return ju4.f22634a;
            case 18:
                na1 na1Var = (na1) this.f22485b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f22486c;
                synchronized (c54.f15813b) {
                    LinkedHashMap linkedHashMap2 = c54.f15814c;
                    linkedHashMap2.remove(na1Var);
                    if (linkedHashMap2.isEmpty()) {
                        wn2.m12326e().m12328b(w15.f33035a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(c54.f15812a);
                        c54.f15817f = null;
                        c54.f15815d = null;
                        c54.f15816e = false;
                    }
                    break;
                }
                return ju4.f22634a;
            case 19:
                return ((Context) this.f22485b).getSharedPreferences((String) this.f22486c, 0);
            case 20:
                ((mw3) this.f22485b).f25263a.remove((String) this.f22486c);
                return ju4.f22634a;
            case 21:
                ((wz2) this.f22485b).f33873a.f34740e = (d64) this.f22486c;
                return ju4.f22634a;
            case 22:
                ((View) this.f22485b).setVisibility(((Boolean) ((zg4) this.f22486c).f36071e.getValue()).booleanValue() ? 0 : 8);
                return ju4.f22634a;
            case 23:
                mh4 mh4Var = (mh4) this.f22485b;
                List list = (List) this.f22486c;
                AttachedSurfaceControl rootSurfaceControl = mh4Var.getRootSurfaceControl();
                if (rootSurfaceControl != null) {
                    if (!list.isEmpty()) {
                        region = new Region();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            region.union((Rect) it2.next());
                        }
                    }
                    rootSurfaceControl.setTouchableRegion(region);
                }
                return ju4.f22634a;
            case 24:
                Context context2 = (Context) this.f22485b;
                TextClassification textClassification = (TextClassification) this.f22486c;
                String text = textClassification.getText();
                qq2.m10012G(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                return ju4.f22634a;
            case 25:
                lb5.m7910S((zo0) this.f22485b, null, cp0.f16328d, new C0821k3((yp1) this.f22486c, (wm0) (z ? 1 : 0), (byte) 5), 1);
                return ju4.f22634a;
            case 26:
                pk4 pk4Var = (pk4) this.f22485b;
                long j3 = ((w52) ((sw2) this.f22486c).getValue()).f33109a;
                b33 b33VarM9545g = pk4Var.m9545g();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (b33VarM9545g != null) {
                    long j4 = b33VarM9545g.f15059a;
                    C0875lk c0875lkM9549k = pk4Var.m9549k();
                    if (c0875lkM9549k != null && c0875lkM9549k.f24092b.length() != 0) {
                        uu1 uu1Var = (uu1) pk4Var.f27709q.getValue();
                        int i7 = uu1Var == null ? -1 : rk4.f29378a[uu1Var.ordinal()];
                        if (i7 != -1) {
                            if (i7 == 1 || i7 == 2) {
                                long j5 = pk4Var.m9550l().f34342b;
                                int i8 = ql4.f28557c;
                                j = j5 >> 32;
                            } else {
                                if (i7 != 3) {
                                    C0670g.m5864c();
                                    return null;
                                }
                                long j6 = pk4Var.m9550l().f34342b;
                                int i9 = ql4.f28557c;
                                j = j6 & 4294967295L;
                            }
                            int i10 = (int) j;
                            uj2 uj2Var2 = pk4Var.f27696d;
                            if (uj2Var2 != null && (kl4VarM11577d = uj2Var2.m11577d()) != null && (uj2Var = pk4Var.f27696d) != null && (c0875lk = uj2Var.f31912a.f33431a) != null) {
                                pk4Var.f27694b.m11898a(i10);
                                int iM10675p = sc6.m10675p(i10, 0, c0875lk.f24092b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (kl4VarM11577d.m7546d(j4) >> 32));
                                jl4 jl4Var = kl4VarM11577d.f23216a;
                                yu2 yu2Var = jl4Var.f22401b;
                                int iM13245d = yu2Var.m13245d(iM10675p);
                                float fM7178d = jl4Var.m7178d(iM13245d);
                                float fM7179e = jl4Var.m7179e(iM13245d);
                                float fM10674o = sc6.m10674o(fIntBitsToFloat, Math.min(fM7178d, fM7179e), Math.max(fM7178d, fM7179e));
                                if (w52.m12108c(j3, 0L) || Math.abs(fIntBitsToFloat - fM10674o) <= ((int) (j3 >> 32)) / 2) {
                                    float fM13247f = yu2Var.m13247f(iM13245d);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM10674o)) << 32) | (((long) Float.floatToRawIntBits(((yu2Var.m13243b(iM13245d) - fM13247f) / 2.0f) + fM13247f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return b33.m3423a(jFloatToRawIntBits);
            case 27:
                xn2 xn2Var2 = (xn2) this.f22485b;
                hn4 hn4Var = (hn4) this.f22486c;
                String strM12721a2 = xn2Var2.m12721a();
                k44 k44Var2 = k44.f22883b;
                if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                    xn2Var2.m12722b(k44Var2, strM12721a2, "changed " + ((oh4) hn4Var.f20725a.getValue()), null);
                }
                return ju4.f22634a;
            case 28:
                ((AbstractC1091r0) this.f22485b).removeOnAttachStateChangeListener((dy4) this.f22486c);
                return ju4.f22634a;
            default:
                ((gk2) this.f22485b).mo6017c((C0749i4) this.f22486c);
                return ju4.f22634a;
        }
    }
}
