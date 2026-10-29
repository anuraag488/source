package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fy2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f19415a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wv3 f19416b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f19417c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ mq1 f19418d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f19419e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ yp1 f19420f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ yp1 f19421g;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        km0 km0Var;
        Map map;
        km0 km0Var2;
        Map map2;
        km0 km0Var3;
        Map map3;
        boolean z = this.f19415a;
        wv3 wv3Var = this.f19416b;
        int i = this.f19417c;
        mq1 mq1Var = this.f19418d;
        boolean z2 = this.f19419e;
        yp1 yp1Var = this.f19420f;
        yp1 yp1Var2 = this.f19421g;
        InterfaceC0493bj interfaceC0493bj = (InterfaceC0493bj) obj;
        Map map4 = w71.f33134a;
        if (z) {
            ny2 ny2Var = (ny2) hb0.m6307S0(wv3Var.mo12426a());
            if (ny2Var != null && (map3 = ny2Var.f26196c) != null) {
                map4 = map3;
            }
            Object obj2 = map4.get(ig1.f21400x.toString());
            if (obj2 == null) {
                obj2 = null;
            }
            mq1 mq1Var2 = as4.m3228G(2, obj2) ? (mq1) obj2 : null;
            return (mq1Var2 == null || (km0Var3 = (km0) mq1Var2.invoke(interfaceC0493bj, Integer.valueOf(i))) == null) ? (km0) mq1Var.invoke(interfaceC0493bj, Integer.valueOf(i)) : km0Var3;
        }
        if (z2) {
            gb5 gb5Var = gb5.f19717h;
            ny2 ny2Var2 = (ny2) hb0.m6307S0(wv3Var.mo12426a());
            if (ny2Var2 != null && (map2 = ny2Var2.f26196c) != null) {
                map4 = map2;
            }
            Object obj3 = map4.get(gb5Var.toString());
            if (obj3 == null) {
                obj3 = null;
            }
            yp1 yp1Var3 = as4.m3228G(1, obj3) ? (yp1) obj3 : null;
            return (yp1Var3 == null || (km0Var2 = (km0) yp1Var3.invoke(interfaceC0493bj)) == null) ? (km0) yp1Var.invoke(interfaceC0493bj) : km0Var2;
        }
        wv1 wv1Var = wv1.f33768k;
        ny2 ny2Var3 = (ny2) hb0.m6307S0(wv3Var.mo12426a());
        if (ny2Var3 != null && (map = ny2Var3.f26196c) != null) {
            map4 = map;
        }
        Object obj4 = map4.get(wv1Var.toString());
        if (obj4 == null) {
            obj4 = null;
        }
        yp1 yp1Var4 = as4.m3228G(1, obj4) ? (yp1) obj4 : null;
        return (yp1Var4 == null || (km0Var = (km0) yp1Var4.invoke(interfaceC0493bj)) == null) ? (km0) yp1Var2.invoke(interfaceC0493bj) : km0Var;
    }
}
