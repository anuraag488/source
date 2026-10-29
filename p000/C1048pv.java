package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: pv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1048pv implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28015a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28016b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f28017c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f28018d;

    public /* synthetic */ C1048pv(byte b) {
        this.f28015a = b;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x034b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    @Override // p000.wp1
    public final Object invoke() {
        int i;
        jl3 jl3Var;
        int i2;
        Object hw0Var;
        jl3 jl3VarMo5906M;
        jl3 jl3VarMo5906M2;
        og3 og3Var;
        byte b = this.f28015a;
        byte b2 = 4;
        byte b3 = 0;
        int i3 = 1;
        ?? r6 = 0;
        str = null;
        String str = null;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                AbstractC1085qv abstractC1085qv = (AbstractC1085qv) this.f28016b;
                C1122rv c1122rv = (C1122rv) this.f28017c;
                ol3 ol3Var = (ol3) this.f28018d;
                abstractC1085qv.mo8485a();
                C1339xp c1339xp = (C1339xp) c1122rv.f29653d;
                int i4 = ol3Var.f26851a;
                do {
                    i = c1339xp.get();
                } while (!c1339xp.compareAndSet(i, ((i >>> 27) & 15) == i4 ? i - 1 : i));
                return ju4Var;
            case 1:
                co4 co4Var = (co4) this.f28016b;
                zo0 zo0Var = (zo0) this.f28017c;
                sw2 sw2Var = (sw2) this.f28018d;
                if (co4Var.m4054b()) {
                    lb5.m7910S(zo0Var, null, null, new C1088qy(co4Var, r6, b3), 3);
                    sw2Var.setValue(Boolean.FALSE);
                }
                return ju4Var;
            case 2:
                d64 d64Var = (d64) this.f28016b;
                ag1 ag1Var = (ag1) this.f28017c;
                ag1 ag1Var2 = (ag1) this.f28018d;
                d64Var.f16821e = ag1Var;
                d64Var.f16822f = ag1Var2;
                return ju4Var;
            case 3:
                d64 d64Var2 = (d64) this.f28016b;
                zo0 zo0Var2 = (zo0) this.f28017c;
                d64 d64Var3 = (d64) this.f28018d;
                if (((Boolean) d64Var2.f16819c.invoke(e64.f17843b)).booleanValue()) {
                    lb5.m7910S(zo0Var2, null, null, new t10(d64Var3, r6, b2), 3);
                }
                return Boolean.TRUE;
            case 4:
                h30 h30Var = (h30) this.f28016b;
                jl3 jl3VarM6206O0 = h30.m6206O0(h30Var, (e13) this.f28017c, (C0675g4) this.f28018d);
                if (jl3VarM6206O0 == null) {
                    return null;
                }
                fm0 fm0Var = h30Var.f20296o;
                if (w52.m12108c(fm0Var.f19115v, -1L)) {
                    t32.m10970c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return jl3VarM6206O0.m7174j(fm0Var.m5742S0(jl3VarM6206O0, fm0Var.m5740P0(), 0L) ^ (-9223372034707292160L));
            case 5:
                fm0 fm0Var2 = (fm0) this.f28016b;
                iv4 iv4Var = (iv4) this.f28017c;
                k30 k30Var = (k30) this.f28018d;
                b30 b30Var = fm0Var2.f19113t;
                while (true) {
                    uw2 uw2Var = b30Var.f15048a;
                    int i5 = uw2Var.f32213c;
                    if (i5 != 0) {
                        if (i5 == 0) {
                            ds3.m4667k("MutableVector is empty.");
                            return null;
                        }
                        jl3 jl3Var2 = (jl3) ((cm0) uw2Var.f32211a[i5 - 1]).f16119a.invoke();
                        if (jl3Var2 == null ? true : fm0.m5738Q0(fm0Var2, jl3Var2, 0L, 0L, 3)) {
                            uw2 uw2Var2 = b30Var.f15048a;
                            ((cm0) uw2Var2.m11672l(uw2Var2.f32213c - 1)).f16120b.resumeWith(ju4Var);
                        }
                    }
                }
                if (fm0Var2.f19114u && (jl3Var = (jl3) fm0Var2.f19112s.invoke()) != null && fm0.m5738Q0(fm0Var2, jl3Var, 0L, 0L, 3)) {
                    fm0Var2.f19114u = false;
                }
                iv4Var.f21829e = fm0Var2.m5739O0(k30Var, 0L);
                return ju4Var;
            case 6:
                od1 od1Var = (od1) this.f28016b;
                xn2 xn2Var = (xn2) this.f28017c;
                C1349xz c1349xz = (C1349xz) this.f28018d;
                od1Var.f26640e.setValue(Boolean.FALSE);
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "disable feature: permissions=" + od1Var.f26637b.mo11770a() + ", premium=" + od1Var.f26639d.mo9873f() + " billingAvailable=" + (c1349xz != null ? (Boolean) c1349xz.f34730d.getValue() : null), null);
                    }
                }
                return ju4Var;
            case 7:
                yp1 yp1Var = (yp1) this.f28016b;
                ie1 ie1Var = (ie1) this.f28017c;
                le1 le1Var = (le1) this.f28018d;
                yp1Var.invoke(ie1.m6771a(ie1Var, null, le1Var.f23975a, le1Var.f23976b, 1));
                return ju4Var;
            case 8:
                yp1 yp1Var2 = (yp1) this.f28016b;
                ie1 ie1Var2 = (ie1) this.f28017c;
                wp1 wp1Var = (wp1) this.f28018d;
                yp1Var2.invoke(ie1.m6771a(ie1Var2, null, null, null, 6));
                wp1Var.invoke();
                return ju4Var;
            case 9:
                wy0 wy0Var = (wy0) this.f28016b;
                si2 si2Var = (si2) this.f28017c;
                sg2 sg2Var = (sg2) this.f28018d;
                fi2 fi2Var = (fi2) wy0Var.getValue();
                r52 r52Var = (r52) ((ph2) si2Var.f30299e.f19665e).getValue();
                C0795je c0795je = new C0795je((byte) 4);
                C0795je c0795je2 = fi2Var.f19015a;
                int i6 = r52Var.f27382a;
                if (i6 < 0) {
                    t32.m10970c("negative nearestRange.first");
                }
                int iMin = Math.min(r52Var.f27383b, c0795je2.f22193b - 1);
                if (iMin < i6) {
                    c0795je.f22194c = p23.f27324a;
                    c0795je.f22195d = new Object[0];
                    c0795je.f22193b = 0;
                } else {
                    int i7 = (iMin - i6) + 1;
                    c0795je.f22195d = new Object[i7];
                    c0795je.f22193b = i6;
                    yv2 yv2Var = new yv2(i7);
                    uw2 uw2Var3 = (uw2) c0795je2.f22194c;
                    if (i6 < 0 || i6 >= c0795je2.f22193b) {
                        t32.m10972e("Index " + i6 + ", size " + c0795je2.f22193b);
                    }
                    if (iMin < 0 || iMin >= c0795je2.f22193b) {
                        t32.m10972e("Index " + iMin + ", size " + c0795je2.f22193b);
                    }
                    if (iMin < i6) {
                        t32.m10968a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i6 + ")");
                    }
                    int iM6616h = i25.m6616h(i6, uw2Var3);
                    int i8 = ((r62) uw2Var3.f32211a[iM6616h]).f29056a;
                    while (i8 <= iMin) {
                        r62 r62Var = (r62) uw2Var3.f32211a[iM6616h];
                        jp0 jp0Var = r62Var.f29058c;
                        int i9 = r62Var.f29057b;
                        yp1 yp1Var3 = (yp1) jp0Var.f22481b;
                        int i10 = r62Var.f29056a;
                        int iMax = Math.max(i6, i10);
                        int iMin2 = Math.min(iMin, (i10 + i9) - i3);
                        if (iMax <= iMin2) {
                            while (true) {
                                if (yp1Var3 == null) {
                                    hw0Var = new hw0(iMax);
                                } else {
                                    hw0Var = yp1Var3.invoke(Integer.valueOf(iMax - i10));
                                    if (hw0Var == null) {
                                        hw0Var = new hw0(iMax);
                                    }
                                }
                                yv2Var.m13263g(iMax, hw0Var);
                                i2 = iM6616h;
                                ((Object[]) c0795je.f22195d)[iMax - c0795je.f22193b] = hw0Var;
                                if (iMax != iMin2) {
                                    iMax++;
                                    iM6616h = i2;
                                }
                            }
                        } else {
                            i2 = iM6616h;
                        }
                        i8 += i9;
                        iM6616h = i2 + 1;
                        i3 = 1;
                    }
                    c0795je.f22194c = yv2Var;
                }
                VarHandle.storeStoreFence();
                hi2 hi2Var = new hi2();
                hi2Var.f20597a = si2Var;
                hi2Var.f20598b = fi2Var;
                hi2Var.f20599c = sg2Var;
                hi2Var.f20600d = c0795je;
                VarHandle.storeStoreFence();
                return hi2Var;
            case 10:
                mq1 mq1Var = (mq1) this.f28016b;
                ql3 ql3Var = (ql3) this.f28017c;
                gx1 gx1Var = (gx1) this.f28018d;
                so2 so2Var = (so2) ql3Var.f28555a;
                lw2 lw2Var = so2Var.f30439m;
                if (lw2Var == null) {
                    long[] jArr = tv3.f31472a;
                    lw2Var = new lw2();
                    so2Var.f30439m = lw2Var;
                }
                Object objM8132g = lw2Var.m8132g(gx1Var);
                if (objM8132g == null) {
                    objM8132g = new ro2(so2Var);
                    lw2Var.m8138m(gx1Var, objM8132g);
                }
                ro2 ro2Var = (ro2) objM8132g;
                ro2Var.f29473a = false;
                mq1Var.invoke(ro2Var, gx1Var);
                return ju4Var;
            case 11:
                yp1 yp1Var4 = (yp1) this.f28016b;
                e13 e13Var = (e13) this.f28017c;
                ml3 ml3Var = (ml3) this.f28018d;
                jp3 jp3Var = e13.f17597Z;
                yp1Var4.invoke(jp3Var);
                boolean zM13387o = z62.m13387o(e13Var.f17613L, jp3Var.f22501m);
                b3 = e13Var.f17616O != jp3Var.f22502n ? (byte) 1 : (byte) 0;
                lb5 lb5VarMo5797a = jp3Var.f22501m.mo5797a(jp3Var.f22503o, jp3Var.f22506r, jp3Var.f22505q);
                jp3Var.f22508t = lb5VarMo5797a;
                boolean zM13387o2 = z62.m13387o(e13Var.f17615N, lb5VarMo5797a != null ? lb5VarMo5797a.mo5906M() : 0);
                ml3Var.f25002a = !zM13387o2;
                if (!zM13387o || b3 != 0 || !zM13387o2) {
                    e13Var.f17613L = jp3Var.f22501m;
                    e13Var.f17616O = jp3Var.f22502n;
                    lb5 lb5Var = jp3Var.f22508t;
                    jl3 jl3Var3 = jl3.f22395e;
                    if (lb5Var == null || (jl3VarMo5906M = lb5Var.mo5906M()) == null) {
                        jl3VarMo5906M = jl3Var3;
                    }
                    e13Var.f17615N = jl3VarMo5906M;
                    lb5 lb5Var2 = jp3Var.f22508t;
                    if (lb5Var2 != null && (jl3VarMo5906M2 = lb5Var2.mo5906M()) != null) {
                        s52 s52VarM12964d0 = y62.m12964d0(jl3VarMo5906M2);
                        jl3Var3 = new jl3(s52VarM12964d0.f29916a, s52VarM12964d0.f29917b, s52VarM12964d0.f29918c, s52VarM12964d0.f29919d);
                    }
                    e13Var.f17614M = jl3Var3;
                    if (e13Var.f17617P && (b3 != 0 || (e13Var.f17616O && !zM13387o))) {
                        e13Var.f17625u.m12254H();
                    }
                }
                e13Var.f17617P = true;
                return ju4Var;
            case 12:
                cr1 cr1Var = (cr1) this.f28016b;
                p84 p84Var = (p84) this.f28017c;
                w53 w53Var = (w53) this.f28018d;
                if (cr1Var != null) {
                    p84Var.m9413a(p84Var.m9415c(cr1Var) - p84Var.f27452t);
                }
                List listM5341P = ev0.m5341P(p84Var, null, p84Var.f27452t, null);
                ai0 ai0Var = (ai0) hb0.m6307S0(listM5341P);
                Integer num = ai0Var != null ? ai0Var.f14519b : null;
                List listMo12110d = w53Var.mo12110d(num);
                if (num != null && !listMo12110d.isEmpty()) {
                    listMo12110d = hb0.m6310V0(Collections.singletonList(new ai0(((ai0) hb0.m6299K0(listMo12110d)).f14518a, null, num)), hb0.m6295G0(listMo12110d, 1));
                }
                return new yh0(hb0.m6310V0(listM5341P, listMo12110d), w53Var.mo12111i());
            case 13:
                String str2 = (String) this.f28016b;
                InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) this.f28017c;
                d00 d00Var = (d00) this.f28018d;
                if (str2 != null) {
                    interfaceC0755ia.mo6705a("premium", str2);
                    if (d00Var != null && (og3Var = d00Var.f16662f) != null) {
                        str = og3Var.f26681a;
                    }
                    interfaceC0755ia.mo6705a("premium_product", str);
                }
                return ju4Var;
            case 14:
                sl2 sl2Var = (sl2) this.f28016b;
                g44 g44Var = (g44) this.f28017c;
                sw2 sw2Var2 = (sw2) this.f28018d;
                nc4 nc4Var = ze3.f36022a;
                if (((Boolean) g44Var.getValue()).booleanValue() || z62.m13387o((Boolean) sw2Var2.getValue(), Boolean.TRUE)) {
                    return Boolean.TRUE;
                }
                if (sl2Var == null || !sl2Var.isEmpty()) {
                    Iterator it = sl2Var.iterator();
                    while (it.hasNext()) {
                        Boolean bool = (Boolean) ((d00) it.next()).f16657a.getValue();
                        Boolean bool2 = Boolean.TRUE;
                        if (z62.m13387o(bool, bool2)) {
                            return bool2;
                        }
                    }
                }
                if (sl2Var == null || !sl2Var.isEmpty()) {
                    Iterator it2 = sl2Var.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) ((d00) it2.next()).f16657a.getValue()) == null) {
                            return null;
                        }
                    }
                }
                return Boolean.FALSE;
            case 15:
                ((ow3) this.f28016b).m9319b(((ql3) this.f28017c).f28555a, (Object[]) this.f28018d);
                return ju4Var;
            case 16:
                d64 d64Var4 = (d64) this.f28016b;
                sw2 sw2Var3 = (sw2) this.f28017c;
                sw2 sw2Var4 = (sw2) this.f28018d;
                C0940nb c0940nb = d64Var4.f16820d;
                float fM11656f = c0940nb.m8670h().m11656f(e64.f17843b);
                float fM11656f2 = c0940nb.m8670h().m11656f(e64.f17842a);
                return Boolean.valueOf(sc6.m10674o(((z73) c0940nb.f25612i).m13399h(), Math.min(fM11656f, fM11656f2), Math.max(fM11656f, fM11656f2)) >= ((float) (((a05) sw2Var3.getValue()).mo10b((ky0) sw2Var4.getValue()) / 2)));
            default:
                AbstractC1091r0 abstractC1091r0 = (AbstractC1091r0) this.f28016b;
                ViewOnAttachStateChangeListenerC0685ge viewOnAttachStateChangeListenerC0685ge = (ViewOnAttachStateChangeListenerC0685ge) this.f28017c;
                ds3 ds3Var = (ds3) this.f28018d;
                abstractC1091r0.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0685ge);
                n40.m8507q(abstractC1091r0).f35980a.remove(ds3Var);
                return ju4Var;
        }
    }
}
