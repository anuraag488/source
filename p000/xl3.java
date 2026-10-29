package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xl3 extends uq4 {

    /* JADX INFO: renamed from: a */
    public final zl3 f34387a;

    public xl3(zl3 zl3Var) {
        this.f34387a = zl3Var;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        Object objMo3045d = mo3045d();
        Map map = this.f34387a.f36168a;
        try {
            kb2Var.mo7492b();
            while (kb2Var.mo7501v()) {
                wl3 wl3Var = (wl3) map.get(kb2Var.mo7475L());
                if (wl3Var == null) {
                    kb2Var.mo7488Y();
                } else {
                    mo3047f(objMo3045d, kb2Var, wl3Var);
                }
            }
            kb2Var.mo7496k();
            return mo3046e(objMo3045d);
        } catch (IllegalAccessException e) {
            c20 c20Var = vl3.f32723a;
            xy4.m12785n("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new lb2(e2);
        }
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        if (obj == null) {
            yb2Var.mo12211t();
            return;
        }
        yb2Var.mo12207e();
        try {
            Iterator it = this.f34387a.f36169b.iterator();
            while (it.hasNext()) {
                ((wl3) it.next()).m12324a(yb2Var, obj);
            }
            yb2Var.mo12209k();
        } catch (IllegalAccessException e) {
            c20 c20Var = vl3.f32723a;
            xy4.m12785n("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo3045d();

    /* JADX INFO: renamed from: f */
    public void mo3047f(Object obj, kb2 kb2Var, wl3 wl3Var) throws IllegalAccessException {
        Field field = wl3Var.f33463b;
        Object objMo166b = wl3Var.f33467f.mo166b(kb2Var);
        if (objMo166b == null && wl3Var.f33468g) {
            return;
        }
        if (wl3Var.f33469h) {
            throw new ia2("Cannot set value of 'static final' ".concat(vl3.m11928d(field, false)));
        }
        field.set(obj, objMo166b);
    }

    /* JADX INFO: renamed from: e */
    public Object mo3046e(Object obj) {
        return obj;
    }
}
