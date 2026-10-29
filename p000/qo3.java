package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qo3 extends jf1 {

    /* JADX INFO: renamed from: b */
    public static final p83 f28643b;

    static {
        String str = p83.f27431b;
        f28643b = h50.m6221B("/");
    }

    /* JADX INFO: renamed from: v */
    public static String m9994v(p83 p83Var) {
        p83 p83Var2 = f28643b;
        p83Var2.getClass();
        return AbstractC0593e.m4820a(p83Var2, p83Var, true).m9385c(p83Var2).f27432a.m10524o();
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: a */
    public final f74 mo3774a(p83 p83Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: b */
    public final void mo3775b(p83 p83Var, p83 p83Var2) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: g */
    public final void mo3777g(p83 p83Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: k */
    public final List mo3778k(p83 p83Var) {
        m9994v(p83Var);
        new LinkedHashSet();
        throw null;
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: q */
    public final xe1 mo3779q(p83 p83Var) {
        if (!z62.m13354M(p83Var)) {
            return null;
        }
        m9994v(p83Var);
        throw null;
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: t */
    public final f74 mo3780t(p83 p83Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: u */
    public final ja4 mo3781u(p83 p83Var) throws FileNotFoundException {
        if (!z62.m13354M(p83Var)) {
            throw new FileNotFoundException("file not found: " + p83Var);
        }
        p83 p83Var2 = f28643b;
        p83Var2.getClass();
        AbstractC0593e.m4820a(p83Var2, p83Var, false).m9385c(p83Var2).f27432a.m10524o();
        throw null;
    }
}
