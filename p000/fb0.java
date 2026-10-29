package p000;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fb0 extends uq4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18887a;

    /* JADX INFO: renamed from: b */
    public Object f18888b;

    /* JADX INFO: renamed from: c */
    public Object f18889c;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        switch (this.f18887a) {
            case 0:
                if (kb2Var.mo7481R() == 9) {
                    kb2Var.mo7477N();
                    return null;
                }
                Collection collection = (Collection) ((l23) this.f18889c).mo7823g();
                kb2Var.mo7490a();
                while (kb2Var.mo7501v()) {
                    collection.add(((bq2) this.f18888b).f15505c.mo166b(kb2Var));
                }
                kb2Var.mo7495j();
                return collection;
            default:
                Class cls = (Class) this.f18888b;
                Object objMo166b = ((pr4) this.f18889c).f27922c.mo166b(kb2Var);
                if (objMo166b == null || cls.isInstance(objMo166b)) {
                    return objMo166b;
                }
                throw new lb2("Expected a " + cls.getName() + " but was " + objMo166b.getClass().getName() + "; at path " + kb2Var.mo7500u());
        }
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        switch (this.f18887a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    yb2Var.mo12206b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((bq2) this.f18888b).mo167c(yb2Var, it.next());
                    }
                    yb2Var.mo12208j();
                } else {
                    yb2Var.mo12211t();
                }
                break;
            default:
                ((pr4) this.f18889c).f27922c.mo167c(yb2Var, obj);
                break;
        }
    }
}
