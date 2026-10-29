package p000;

import android.view.accessibility.AccessibilityEvent;
import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ii */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0762ii implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21429a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21430b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21431c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f21432d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f21433e;

    public /* synthetic */ C0762ii(byte b) {
        this.f21429a = b;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005d  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        long j;
        byte b = this.f21429a;
        byte b2 = 2;
        wm0 wm0Var = null;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                C0910mi c0910mi = (C0910mi) this.f21430b;
                C0457ak c0457ak = (C0457ak) this.f21431c;
                yp1 yp1Var = (yp1) this.f21432d;
                ml3 ml3Var = (ml3) this.f21433e;
                C1370yj c1370yj = (C1370yj) obj;
                qs5.m10094S(c1370yj, c0910mi.f24929c);
                d83 d83Var = c1370yj.f35255e;
                Object objM8326b = c0910mi.m8326b(d83Var.getValue());
                if (!z62.m13387o(objM8326b, d83Var.getValue())) {
                    c0910mi.f24929c.f14572b.setValue(objM8326b);
                    c0457ak.f14572b.setValue(objM8326b);
                    if (yp1Var != null) {
                        yp1Var.invoke(c0910mi);
                    }
                    c1370yj.m13145a();
                    ml3Var.f25002a = true;
                } else if (yp1Var != null) {
                    yp1Var.invoke(c0910mi);
                }
                return ju4Var;
            case 1:
                uj2 uj2Var = (uj2) this.f21430b;
                bl4 bl4Var = (bl4) this.f21431c;
                xk4 xk4Var = (xk4) this.f21432d;
                l12 l12Var = (l12) this.f21433e;
                if (uj2Var.m11575b()) {
                    nh3 nh3Var = uj2Var.f31915d;
                    zn0 zn0Var = uj2Var.f31933v;
                    zn0 zn0Var2 = uj2Var.f31934w;
                    ql3 ql3Var = new ql3();
                    bh4 bh4Var = new bh4(b2);
                    bh4Var.f15274b = nh3Var;
                    bh4Var.f15275c = zn0Var;
                    bh4Var.f15276d = ql3Var;
                    VarHandle.storeStoreFence();
                    yb3 yb3Var = bl4Var.f15404a;
                    yb3Var.mo4545a(xk4Var, l12Var, bh4Var, zn0Var2);
                    el4 el4Var = new el4(bl4Var, yb3Var);
                    bl4Var.f15405b.set(el4Var);
                    ql3Var.f28555a = el4Var;
                    uj2Var.f31916e = el4Var;
                }
                return new C1069qf((byte) 1);
            case 2:
                zo0 zo0Var = (zo0) this.f21430b;
                sw2 sw2Var = (sw2) this.f21431c;
                C1354y3 c1354y3 = (C1354y3) this.f21432d;
                sw2 sw2Var2 = (sw2) this.f21433e;
                if (!z62.m13387o(((AccessibilityEvent) obj).getPackageName(), "com.android.systemui")) {
                    t82 t82Var = (t82) sw2Var.getValue();
                    if (t82Var != null) {
                        t82Var.mo4993a(null);
                    }
                    sw2Var.setValue(lb5.m7910S(zo0Var, null, null, new C0594e0((Object) c1354y3, (Object) sw2Var2, wm0Var, (byte) 22), 3));
                }
                return ju4Var;
            case 3:
                Set set = (Set) this.f21430b;
                Object obj2 = this.f21431c;
                Set set2 = (Set) this.f21432d;
                sw2 sw2Var3 = (sw2) this.f21433e;
                set.add(obj2);
                lv0 lv0Var = new lv0(0 == true ? 1 : 0);
                lv0Var.f24385c = set;
                lv0Var.f24387e = obj2;
                lv0Var.f24386d = set2;
                lv0Var.f24384b = sw2Var3;
                VarHandle.storeStoreFence();
                return lv0Var;
            case 4:
                nl3 nl3Var = (nl3) this.f21430b;
                tx3 tx3Var = (tx3) this.f21431c;
                nl3 nl3Var2 = (nl3) this.f21432d;
                aw0 aw0Var = (aw0) this.f21433e;
                C1370yj c1370yj2 = (C1370yj) obj;
                float fFloatValue = ((Number) c1370yj2.f35255e.getValue()).floatValue() - nl3Var.f25933a;
                float fMo3369a = tx3Var.mo3369a(fFloatValue);
                nl3Var.f25933a = ((Number) c1370yj2.f35255e.getValue()).floatValue();
                nl3Var2.f25933a = ((Number) c1370yj2.m13146b()).floatValue();
                if (Math.abs(fFloatValue - fMo3369a) > 0.5f) {
                    c1370yj2.m13145a();
                }
                aw0Var.getClass();
                return ju4Var;
            case 5:
                String str = (String) this.f21430b;
                String str2 = (String) this.f21431c;
                sw2 sw2Var4 = (sw2) this.f21433e;
                yp1 yp1Var2 = (yp1) this.f21432d;
                q14 q14Var = (q14) obj;
                boolean zBooleanValue = ((Boolean) sw2Var4.getValue()).booleanValue();
                yy0 yy0Var = new yy0((byte) 2);
                yy0Var.f35613b = yp1Var2;
                VarHandle.storeStoreFence();
                yy0 yy0Var2 = new yy0((byte) 1);
                yy0Var2.f35613b = yp1Var2;
                VarHandle.storeStoreFence();
                List listSingletonList = Collections.singletonList(zBooleanValue ? new fs0(str2, yy0Var2) : new fs0(str, yy0Var));
                ic2[] ic2VarArr = o14.f26289a;
                p14 p14Var = d14.f16727x;
                ic2 ic2Var = o14.f26289a[31];
                p14Var.getClass();
                q14Var.mo4898a(p14Var, listSingletonList);
                return ju4Var;
            case 6:
                zv1 zv1Var = (zv1) this.f21430b;
                String str3 = (String) this.f21431c;
                String str4 = (String) this.f21432d;
                xd3 xd3Var = (xd3) this.f21433e;
                hw2 hw2Var = (hw2) obj;
                zv1Var.getClass();
                Object obj3 = 0L;
                xd3 xd3Var2 = zv1.f36409d;
                Object objM6525c = hw2Var.m6525c(xd3Var2);
                String str5 = "";
                if (objM6525c == null) {
                    objM6525c = "";
                }
                if (((String) objM6525c).equals(str3)) {
                    xd3 xd3VarM13803c = zv1.m13803c(hw2Var, str3);
                    if (xd3VarM13803c != null && !xd3VarM13803c.f34170a.equals(str4)) {
                        xd3 xd3VarM13803c2 = zv1.m13803c(hw2Var, str3);
                        if (xd3VarM13803c2 != null) {
                            Object hashSet = new HashSet();
                            Object objM6525c2 = hw2Var.m6525c(xd3VarM13803c2);
                            if (objM6525c2 != null) {
                                hashSet = objM6525c2;
                            }
                            HashSet hashSet2 = new HashSet((Collection) hashSet);
                            hashSet2.remove(str3);
                            if (hashSet2.isEmpty()) {
                                hw2Var.m6526d(xd3VarM13803c2);
                            } else {
                                hw2Var.m6527e(xd3VarM13803c2, hashSet2);
                            }
                        }
                        Object hashSet3 = new HashSet();
                        Object objM6525c3 = hw2Var.m6525c(xd3Var);
                        if (objM6525c3 != null) {
                            hashSet3 = objM6525c3;
                        }
                        HashSet hashSet4 = new HashSet((Collection) hashSet3);
                        hashSet4.add(str3);
                        hw2Var.m6527e(xd3Var, hashSet4);
                    }
                } else {
                    xd3 xd3Var3 = zv1.f36408c;
                    Object objM6525c4 = hw2Var.m6525c(xd3Var3);
                    if (objM6525c4 == null) {
                        objM6525c4 = obj3;
                    }
                    long jLongValue = ((Long) objM6525c4).longValue();
                    long j2 = 1;
                    if (jLongValue + 1 == 30) {
                        Object objM6525c5 = hw2Var.m6525c(xd3Var3);
                        long jLongValue2 = ((Long) (objM6525c5 != null ? objM6525c5 : 0L)).longValue();
                        Set hashSet5 = new HashSet();
                        String str6 = null;
                        for (Map.Entry entry : hw2Var.m6523a().entrySet()) {
                            if (entry.getValue() instanceof Set) {
                                Set<String> set3 = (Set) entry.getValue();
                                for (String str7 : set3) {
                                    long j3 = j2;
                                    if (str6 == null || str6.compareTo(str7) > 0) {
                                        str5 = ((xd3) entry.getKey()).f34170a;
                                        str6 = str7;
                                        hashSet5 = set3;
                                    }
                                    j2 = j3;
                                }
                            }
                            j2 = j2;
                        }
                        j = j2;
                        HashSet hashSet6 = new HashSet(hashSet5);
                        hashSet6.remove(str6);
                        hw2Var.m6527e(new xd3(str5), hashSet6);
                        jLongValue = jLongValue2 - j;
                        hw2Var.m6527e(xd3Var3, Long.valueOf(jLongValue));
                    } else {
                        j = 1;
                    }
                    Object hashSet7 = new HashSet();
                    Object objM6525c6 = hw2Var.m6525c(xd3Var);
                    if (objM6525c6 != null) {
                        hashSet7 = objM6525c6;
                    }
                    HashSet hashSet8 = new HashSet((Collection) hashSet7);
                    hashSet8.add(str3);
                    hw2Var.m6527e(xd3Var, hashSet8);
                    hw2Var.m6527e(xd3Var3, Long.valueOf(jLongValue + j));
                    hw2Var.m6527e(xd3Var2, str3);
                }
                return null;
            case 7:
                sw2 sw2Var5 = (sw2) this.f21430b;
                i32 i32Var = (i32) this.f21431c;
                nl3 nl3Var3 = (nl3) this.f21432d;
                zo0 zo0Var2 = (zo0) this.f21433e;
                long jLongValue3 = ((Long) obj).longValue();
                xb4 xb4Var = (xb4) sw2Var5.getValue();
                long jLongValue4 = xb4Var != null ? ((Number) xb4Var.getValue()).longValue() : jLongValue3;
                long j4 = i32Var.f21096c;
                uw2 uw2Var = i32Var.f21094a;
                if (j4 == Long.MIN_VALUE || nl3Var3.f25933a != qs5.m10076A(zo0Var2.mo6367f())) {
                    i32Var.f21096c = jLongValue3;
                    Object[] objArr = uw2Var.f32211a;
                    int i = uw2Var.f32213c;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((f32) objArr[i2]).f18711g = true;
                    }
                    nl3Var3.f25933a = qs5.m10076A(zo0Var2.mo6367f());
                }
                float f = nl3Var3.f25933a;
                if (f == 0.0f) {
                    Object[] objArr2 = uw2Var.f32211a;
                    int i3 = uw2Var.f32213c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        f32 f32Var = (f32) objArr2[i4];
                        f32Var.f18708d.setValue(f32Var.f18709e.f20605c);
                        f32Var.f18711g = true;
                    }
                } else {
                    long j5 = (long) ((jLongValue4 - i32Var.f21096c) / f);
                    Object[] objArr3 = uw2Var.f32211a;
                    int i5 = uw2Var.f32213c;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        f32 f32Var2 = (f32) objArr3[i6];
                        boolean zM11569g = f32Var2.f18710f;
                        if (!zM11569g) {
                            f32Var2.f18713i.f21095b.setValue(Boolean.FALSE);
                            if (f32Var2.f18711g) {
                                f32Var2.f18711g = false;
                                f32Var2.f18712h = j5;
                            }
                            long j6 = j5 - f32Var2.f18712h;
                            f32Var2.f18708d.setValue(f32Var2.f18709e.mo5813b(j6));
                            zM11569g = f32Var2.f18709e.m11569g(j6);
                            f32Var2.f18710f = zM11569g;
                        }
                        if (!zM11569g) {
                            z = false;
                        }
                    }
                    i32Var.f21097d.setValue(Boolean.valueOf(!z));
                }
                return ju4Var;
            case 8:
                vh2 vh2Var = (vh2) this.f21430b;
                lh2 lh2Var = (lh2) this.f21431c;
                ee4 ee4Var = (ee4) this.f21432d;
                ke3 ke3Var = (ke3) this.f21433e;
                C1126rz c1126rz = new C1126rz();
                c1126rz.f29738b = lh2Var;
                c1126rz.f29739c = ee4Var;
                c1126rz.f29740d = ke3Var;
                c1126rz.f29737a = true;
                VarHandle.storeStoreFence();
                vh2Var.f32616c = c1126rz;
                C1032pf c1032pf = new C1032pf((byte) 10);
                c1032pf.f27570b = vh2Var;
                VarHandle.storeStoreFence();
                return c1032pf;
            default:
                nl3 nl3Var4 = (nl3) this.f21430b;
                ru2 ru2Var = (ru2) this.f21431c;
                ty3 ty3Var = (ty3) this.f21432d;
                C0869le c0869le = (C0869le) this.f21433e;
                C1370yj c1370yj3 = (C1370yj) obj;
                float fFloatValue2 = ((Number) c1370yj3.f35255e.getValue()).floatValue() - nl3Var4.f25933a;
                if (y70.m13007H(fFloatValue2)) {
                    if (((Boolean) c0869le.invoke(Float.valueOf(nl3Var4.f25933a))).booleanValue()) {
                        c1370yj3.m13145a();
                    }
                } else if (y70.m13007H(fFloatValue2 - ru2Var.m10440c(ty3Var, fFloatValue2))) {
                    nl3Var4.f25933a += fFloatValue2;
                    if (((Boolean) c0869le.invoke(Float.valueOf(nl3Var4.f25933a))).booleanValue()) {
                        c1370yj3.m13145a();
                    }
                } else {
                    c1370yj3.m13145a();
                }
                return ju4Var;
        }
    }
}
