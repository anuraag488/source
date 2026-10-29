package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class a64 {

    /* JADX INFO: renamed from: a */
    public static final nc4 f143a = new nc4(new nu3((byte) 10));

    /* JADX INFO: renamed from: a */
    public static final void m104a(wp1 wp1Var, d64 d64Var, boolean z, mq1 mq1Var, pg0 pg0Var, mi0 mi0Var, int i) {
        byte b;
        wp1 wp1Var2;
        d64 d64VarM11751b;
        mq1 mq1Var2;
        int i2;
        mq1 n14Var;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1780116179);
        int i3 = (i & 6) == 0 ? i | 2 : i;
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= ir1Var.m6892h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ir1Var.m6894i(pg0Var) ? 16384 : 8192;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 9363) != 9362)) {
            ir1Var.m6876Y();
            int i4 = i & 1;
            nc4 nc4Var = f143a;
            i50 i50Var = ki0.f23136a;
            if (i4 == 0 || ir1Var.m6856B()) {
                wz2 wz2Var = (wz2) ir1Var.m6898k(nc4Var);
                boolean zM6890g = ir1Var.m6890g(wz2Var);
                Object objM6869O = ir1Var.m6869O();
                Object obj2 = objM6869O;
                if (zM6890g || objM6869O == i50Var) {
                    g32 g32Var = new g32((byte) 26);
                    g32Var.f19558b = wz2Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(g32Var);
                    obj2 = g32Var;
                }
                d64VarM11751b = v54.m11751b(AbstractC0990oo.m9216k0(new e64[]{e64.f17842a, e64.f17843b}), ir1Var, 54, 4);
                i2 = i3 & (-7295);
                wp1Var2 = (wp1) obj2;
                n14Var = new n14((byte) 4);
            } else {
                ir1Var.m6874W();
                d64VarM11751b = d64Var;
                n14Var = mq1Var;
                i2 = i3 & (-7295);
                wp1Var2 = wp1Var;
            }
            ir1Var.m6913s();
            wz2 wz2Var2 = (wz2) ir1Var.m6898k(nc4Var);
            if (wz2Var2 != null) {
                ir1Var.m6885d0(-1479315188);
                boolean zM6890g2 = ir1Var.m6890g(wz2Var2) | ir1Var.m6890g(d64VarM11751b);
                Object objM6869O2 = ir1Var.m6869O();
                if (zM6890g2 || objM6869O2 == i50Var) {
                    obj = objM6869O2;
                    jp1 jp1Var = new jp1((byte) 21);
                    jp1Var.f22485b = wz2Var2;
                    jp1Var.f22486c = d64VarM11751b;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(jp1Var);
                    obj = jp1Var;
                }
                lb5.m7933n(wz2Var2, d64VarM11751b, (wp1) obj, ir1Var);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-1479245035);
                ir1Var.m6912r(false);
            }
            Object objM6869O3 = ir1Var.m6869O();
            if (objM6869O3 == i50Var) {
                objM6869O3 = k43.m7398w(Boolean.FALSE);
                ir1Var.m6905n0(objM6869O3);
            }
            sw2 sw2Var = (sw2) objM6869O3;
            dc0 dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
            Object objM6869O4 = ir1Var.m6869O();
            if (objM6869O4 == i50Var) {
                objM6869O4 = lb5.m7942w(r71.f29063a, ir1Var);
                ir1Var.m6905n0(objM6869O4);
            }
            zo0 zo0Var = (zo0) objM6869O4;
            ir1Var.m6885d0(-1294626604);
            vf1 vf1Var = n74.f25506c;
            boolean zM6890g3 = ir1Var.m6890g(dc0Var) | ir1Var.m6890g(d64VarM11751b);
            Object objM6869O5 = ir1Var.m6869O();
            Object obj3 = objM6869O5;
            if (zM6890g3 || objM6869O5 == i50Var) {
                cz3 cz3Var = new cz3((byte) 2);
                cz3Var.f16638b = dc0Var;
                cz3Var.f16639c = d64VarM11751b;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(cz3Var);
                obj3 = cz3Var;
            }
            nt2 nt2VarM5542m = C0638f5.m5542m(vf1Var, (yp1) obj3);
            if (!((Boolean) sw2Var.getValue()).booleanValue() || ((e64) ((wy0) d64VarM11751b.f16820d.f25611h).getValue()) != e64.f17842a || !d64VarM11751b.f16820d.m8672j()) {
                boolean zM6890g4 = ((i2 & 896) == 256) | ir1Var.m6890g(zo0Var) | ir1Var.m6890g(d64VarM11751b) | ir1Var.m6890g(wp1Var2);
                Object objM6869O6 = ir1Var.m6869O();
                Object obj4 = objM6869O6;
                if (zM6890g4 || objM6869O6 == i50Var) {
                    y54 y54Var = new y54();
                    y54Var.f34914a = z;
                    y54Var.f34915b = zo0Var;
                    y54Var.f34916c = d64VarM11751b;
                    y54Var.f34917d = wp1Var2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(y54Var);
                    obj4 = y54Var;
                }
                nt2VarM5542m = nt2VarM5542m.mo7630d(rf4.m10327a(kt2.f23428a, wp1Var2, (PointerInputEventHandler) obj4));
            }
            ir1Var.m6912r(false);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21379c, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM5542m);
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
            lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
            n14 n14Var2 = new n14((byte) 3);
            w54 w54Var = new w54();
            w54Var.f33110a = z;
            w54Var.f33111b = lv1Var;
            w54Var.f33112c = d64VarM11751b;
            w54Var.f33113d = n14Var;
            w54Var.f33114e = pg0Var;
            VarHandle.storeStoreFence();
            mq1 mq1Var3 = n14Var;
            sj3.m10805a(null, d64VarM11751b, wp1Var2, 0.0f, z, false, null, n14Var2, null, 0L, 0L, 0.0f, vd6.m11834R(-573674040, w54Var, ir1Var), ir1Var, 1572864 | ((i2 << 6) & 57344));
            b = 1;
            ir1Var.m6912r(true);
            boolean zM6890g5 = ir1Var.m6890g(d64VarM11751b);
            Object objM6869O7 = ir1Var.m6869O();
            if (zM6890g5 || objM6869O7 == i50Var) {
                objM6869O7 = new it1((Object) d64VarM11751b, (Object) sw2Var, (wm0) null, (byte) 27);
                ir1Var.m6905n0(objM6869O7);
            }
            lb5.m7926g(ir1Var, (mq1) objM6869O7, ju4.f22634a);
            mq1Var2 = mq1Var3;
        } else {
            b = 1;
            ir1Var.m6874W();
            wp1Var2 = wp1Var;
            d64VarM11751b = d64Var;
            mq1Var2 = mq1Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            e02 e02Var = new e02(b);
            e02Var.f17559d = wp1Var2;
            e02Var.f17560e = d64VarM11751b;
            e02Var.f17557b = z;
            e02Var.f17561f = mq1Var2;
            e02Var.f17562g = pg0Var;
            e02Var.f17558c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = e02Var;
        }
    }
}
