package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c01 extends jf1 {

    /* JADX INFO: renamed from: b */
    public jf1 f15731b;

    @Override // p000.jf1
    /* JADX INFO: renamed from: a */
    public final f74 mo3774a(p83 p83Var) {
        return this.f15731b.mo3774a(p83Var);
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: b */
    public final void mo3775b(p83 p83Var, p83 p83Var2) throws IOException {
        this.f15731b.mo3775b(p83Var, p83Var2);
    }

    @Override // p000.jf1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15731b.close();
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: e */
    public final void mo3776e(p83 p83Var) throws IOException {
        this.f15731b.mo3776e(p83Var);
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: g */
    public final void mo3777g(p83 p83Var) {
        this.f15731b.mo3777g(p83Var);
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: k */
    public final List mo3778k(p83 p83Var) throws IOException {
        List listMo3778k = this.f15731b.mo3778k(p83Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = listMo3778k.iterator();
        while (it.hasNext()) {
            arrayList.add((p83) it.next());
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: q */
    public final xe1 mo3779q(p83 p83Var) {
        xe1 xe1VarMo3779q = this.f15731b.mo3779q(p83Var);
        if (xe1VarMo3779q == null) {
            return null;
        }
        p83 p83Var2 = xe1VarMo3779q.f34192c;
        return p83Var2 == null ? xe1VarMo3779q : new xe1(xe1VarMo3779q.f34190a, xe1VarMo3779q.f34191b, p83Var2, xe1VarMo3779q.f34193d, xe1VarMo3779q.f34194e, xe1VarMo3779q.f34195f, xe1VarMo3779q.f34196g, xe1VarMo3779q.f34197h);
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: t */
    public final f74 mo3780t(p83 p83Var) throws IOException {
        p83 p83VarM9384b = p83Var.m9384b();
        if (p83VarM9384b != null) {
            C0461ao c0461ao = new C0461ao();
            while (p83VarM9384b != null && !m7089j(p83VarM9384b)) {
                c0461ao.addFirst(p83VarM9384b);
                p83VarM9384b = p83VarM9384b.m9384b();
            }
            Iterator<E> it = c0461ao.iterator();
            while (it.hasNext()) {
                mo3776e((p83) it.next());
            }
        }
        return this.f15731b.mo3780t(p83Var);
    }

    public final String toString() {
        return rl3.m10361a(c01.class).m10249b() + '(' + this.f15731b + ')';
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: u */
    public final ja4 mo3781u(p83 p83Var) {
        return this.f15731b.mo3781u(p83Var);
    }
}
