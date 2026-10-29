package p000;

import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy2 implements pq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f32253a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ lu2 f32254b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, ry2] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r5v2, types: [ir1, mi0] */
    @Override // p000.pq1
    /* JADX INFO: renamed from: d */
    public final Object mo6994d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        List list = this.f32253a;
        lu2 lu2Var = this.f32254b;
        zo2 zo2Var = (zo2) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        mq1 mq1Var = (mq1) obj3;
        mi0 mi0Var = (mi0) obj4;
        int iIntValue = ((Integer) obj5).intValue();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? ((ir1) mi0Var).m6890g(zo2Var) : ((ir1) mi0Var).m6894i(zo2Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((ir1) mi0Var).m6892h(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((ir1) mi0Var).m6894i(mq1Var) ? 256 : 128;
        }
        ?? r5 = (ir1) mi0Var;
        if (r5.m6871T(i & 1, (i & 1171) != 1170)) {
            ListIterator listIterator = y62.m12960b0(zBooleanValue ? hb0.m6312X0(list) : list, null, r5, 0, 6).listIterator();
            while (true) {
                ow1 ow1Var = (ow1) listIterator;
                if (!ow1Var.hasNext()) {
                    break;
                }
                C0800jj c0800jj = (C0800jj) ow1Var.next();
                r5.m6879a0(646045357, c0800jj.f22322a);
                Float fValueOf = Float.valueOf(((Boolean) c0800jj.f22324c.f31487g.getValue()).booleanValue() ? 1.0f : 1.0E-4f);
                kt2 kt2Var = kt2.f23428a;
                nt2 nt2Var = (nt2) mq1Var.invoke(kt2Var, fValueOf);
                boolean zM6890g = r5.m6890g(lu2Var);
                ?? M6869O = r5.m6869O();
                if (zM6890g || M6869O == ki0.f23136a) {
                    M6869O = new ry2();
                    M6869O.f29731a = lu2Var;
                    VarHandle.storeStoreFence();
                    r5.m6905n0(M6869O);
                }
                ry2 ry2Var = (ry2) M6869O;
                nt2 nt2VarMo7630d = nt2Var.mo7630d(new k20(zo2Var, ry2Var, C0984oi.f26753j)).mo7630d(kt2Var).mo7630d(new k20(zo2Var, ry2Var, C0984oi.f26754k));
                p91 p91VarM9439a = k91.m7438c(lu2Var.mo7286c(), 2).m9439a(k91.m7440e(lu2Var.mo7289f(), 0.0f, 6));
                mc1 mc1VarM8273a = k91.m7439d(lu2Var.mo7286c(), 2).m8273a(k91.m7441f(lu2Var.mo7289f(), 0.0f, 6));
                up4 up4Var = new up4((byte) 6);
                up4Var.f32065b = list;
                up4Var.f32066c = c0800jj;
                VarHandle.storeStoreFence();
                y62.m12967f(c0800jj, nt2VarMo7630d, p91VarM9439a, mc1VarM8273a, vd6.m11834R(-861226636, up4Var, r5), r5, 24576);
                r5.m6912r(false);
            }
        } else {
            r5.m6874W();
        }
        return ju4.f22634a;
    }
}
