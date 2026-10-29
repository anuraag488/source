package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.accessibility.AccessibilityEvent;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o04 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26270a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f26271b;

    public /* synthetic */ o04(byte b) {
        this.f26270a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        uj2 uj2Var;
        byte b = this.f26270a;
        boolean z = true;
        byte b2 = 0;
        Object obj2 = this.f26271b;
        switch (b) {
            case 0:
                rd6 rd6Var = (rd6) obj2;
                lc3 lc3Var = (lc3) obj;
                long j = lc3Var.f23937c;
                pk4 pk4Var = (pk4) rd6Var.f29198d;
                if (!pk4Var.m9547i() || pk4Var.m9550l().f34341a.f24092b.length() == 0 || (uj2Var = pk4Var.f27696d) == null || uj2Var.m11577d() == null) {
                    z = false;
                } else {
                    rd6Var.m10305d(pk4Var.m9550l(), j, false, wv1.f33773p);
                }
                if (z) {
                    lc3Var.m7952a();
                }
                return ju4.f22634a;
            case 1:
                o14.m8923d((q14) obj, ((lq3) obj2).f24281a);
                return ju4.f22634a;
            case 2:
                ((List) obj).add((Float) ((bi2) obj2).invoke());
                return true;
            case 3:
                n44 n44Var = (n44) obj2;
                jp3 jp3Var = (jp3) obj;
                jp3Var.m7259m(jp3Var.f22505q.mo3580c() * n44Var.f25444a);
                jp3Var.m7260n(n44Var.f25445b);
                jp3Var.m7255h(n44Var.f25446c);
                jp3Var.m7254e(n44Var.f25447d);
                jp3Var.m7261s(n44Var.f25448e);
                return ju4.f22634a;
            case 4:
                y64 y64Var = (y64) obj2;
                jp3 jp3Var2 = (jp3) obj;
                jp3Var2.m7257k(y64Var.f34952o);
                jp3Var2.m7258l(y64Var.f34953p);
                jp3Var2.m7253b(y64Var.f34954q);
                jp3Var2.m7263v(0.0f);
                jp3Var2.m7264w(0.0f);
                jp3Var2.m7259m(y64Var.f34955r);
                jp3Var2.m7256j(y64Var.f34956s);
                float f = y64Var.f34957t;
                if (jp3Var2.f22499k != f) {
                    jp3Var2.f22489a |= 2048;
                    jp3Var2.f22499k = f;
                }
                jp3Var2.m7262u(y64Var.f34958u);
                jp3Var2.m7260n(y64Var.f34959v);
                jp3Var2.m7255h(y64Var.f34960w);
                jp3Var2.m7254e(y64Var.f34961x);
                jp3Var2.m7261s(y64Var.f34962y);
                byte b3 = y64Var.f34963z;
                if (jp3Var2.f22507s != b3) {
                    jp3Var2.f22489a |= 524288;
                    jp3Var2.f22507s = b3;
                }
                ye2 ye2Var = y64Var.f34950A;
                if (!z62.m13387o(jp3Var2.f22504p, ye2Var)) {
                    jp3Var2.f22489a |= 1048576;
                    jp3Var2.f22504p = ye2Var;
                }
                return ju4.f22634a;
            case 5:
                d74 d74Var = (d74) obj2;
                Object obj3 = d74Var.f16827j;
                if (!obj3.equals(obj3)) {
                    kd3.m7503b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                mw2 mw2Var = d74Var.f16826i;
                Object obj4 = d74Var.f16824g;
                if (mw2Var != null) {
                    if (obj4 != null) {
                        kd3.m7503b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    mw2Var.m8409a(obj);
                } else if (obj4 == null) {
                    d74Var.f16824g = obj;
                } else {
                    mw2 mw2Var2 = uv3.f32207a;
                    mw2 mw2Var3 = new mw2();
                    mw2Var3.m8409a(obj4);
                    mw2Var3.m8409a(obj);
                    d74Var.f16826i = mw2Var3;
                    d74Var.f16824g = null;
                }
                return ju4.f22634a;
            case 6:
                k84 k84Var = (k84) obj2;
                w52 w52Var = (w52) obj;
                k84Var.f22995j.m133i((int) (w52Var.f33109a >> 32));
                k84Var.f22996k.m133i((int) (w52Var.f33109a & 4294967295L));
                return ju4.f22634a;
            case 7:
                return Integer.valueOf(((m84) obj2).m8227a(AbstractC1356y5.m12917k(((uu2) obj).f32183e)));
            case 8:
                aa4 aa4Var = (aa4) obj2;
                synchronized (aa4Var.f216g) {
                    z94 z94Var = aa4Var.f218i;
                    Object obj5 = z94Var.f35889b;
                    int i = z94Var.f35891d;
                    yv2 yv2Var = z94Var.f35890c;
                    if (yv2Var == null) {
                        yv2Var = new yv2();
                        z94Var.f35890c = yv2Var;
                        z94Var.f35893f.m8138m(obj5, yv2Var);
                    }
                    z94Var.m13459b(obj, i, obj5, yv2Var);
                }
                return ju4.f22634a;
            case 9:
                xg4 xg4Var = new xg4(b2);
                xg4Var.f34274b = (nh4) obj2;
                VarHandle.storeStoreFence();
                return xg4Var;
            case 10:
                lh4 lh4Var = (lh4) obj2;
                if ((((AccessibilityEvent) obj).getWindowChanges() & 11) != 0 && !lh4Var.f24038c) {
                    lh4Var.f24038c = true;
                    Choreographer.getInstance().postFrameCallback(lh4Var);
                }
                return ju4.f22634a;
            case 11:
                mh4 mh4Var = (mh4) obj2;
                mh4Var.setBackgroundColor(zy5.m13858V(pb0.m9464c(pb0.f27498e, 0.2f, 0.0f, 0.0f, 0.0f, 14)));
                C1032pf c1032pf = new C1032pf((byte) 14);
                c1032pf.f27570b = mh4Var;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 12:
                Drawable drawable = (Drawable) obj2;
                u31 u31Var = (u31) obj;
                h70 h70VarM7248w = u31Var.mo7035J().m7248w();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)), (int) Float.intBitsToFloat((int) (4294967295L & u31Var.mo11227d())));
                Canvas canvas = AbstractC1362yb.f35080a;
                drawable.draw(((C1325xb) h70VarM7248w).f34122a);
                return ju4.f22634a;
            case 13:
                ((yp1) obj).invoke((bj4) obj2);
                return ju4.f22634a;
            case 14:
                o04 o04Var = (o04) obj2;
                pp4 pp4Var = (pp4) obj;
                if (pp4Var instanceof C1282w6) {
                    o04Var.invoke(((C1282w6) pp4Var).f33117o);
                    return Boolean.TRUE;
                }
                C1077qn.m9989o("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            default:
                hk4 hk4Var = (hk4) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                z73 z73Var = hk4Var.f20659a;
                float fM13399h = z73Var.m13399h() + fFloatValue;
                z73 z73Var2 = hk4Var.f20660b;
                if (fM13399h > z73Var2.m13399h()) {
                    fFloatValue = z73Var2.m13399h() - z73Var.m13399h();
                } else if (fM13399h < 0.0f) {
                    fFloatValue = -z73Var.m13399h();
                }
                z73Var.m13400i(z73Var.m13399h() + fFloatValue);
                return Float.valueOf(fFloatValue);
        }
    }
}
