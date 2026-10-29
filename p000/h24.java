package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h24 implements g24, f60 {

    /* JADX INFO: renamed from: a */
    public g24 f20283a;

    /* JADX INFO: renamed from: b */
    public String f20284b;

    /* JADX INFO: renamed from: c */
    public Set f20285c;

    @Override // p000.g24
    /* JADX INFO: renamed from: a */
    public final int mo4430a(String str) {
        return this.f20283a.mo4430a(str);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: b */
    public final String mo3641b() {
        return this.f20284b;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: c */
    public final zc6 mo4431c() {
        return this.f20283a.mo4431c();
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: d */
    public final int mo4432d() {
        return this.f20283a.mo4432d();
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: e */
    public final String mo4433e(int i) {
        return this.f20283a.mo4433e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h24) && this.f20283a.equals(((h24) obj).f20283a);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: f */
    public final boolean mo5886f() {
        return this.f20283a.mo5886f();
    }

    @Override // p000.f60
    /* JADX INFO: renamed from: g */
    public final Set mo4434g() {
        return this.f20285c;
    }

    @Override // p000.g24
    public final List getAnnotations() {
        return this.f20283a.getAnnotations();
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: h */
    public final boolean mo5887h() {
        return true;
    }

    public final int hashCode() {
        return this.f20283a.hashCode() * 31;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: i */
    public final List mo4435i(int i) {
        return this.f20283a.mo4435i(i);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: j */
    public final g24 mo4436j(int i) {
        return this.f20283a.mo4436j(i);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: k */
    public final boolean mo4437k(int i) {
        return this.f20283a.mo4437k(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20283a);
        sb.append('?');
        return sb.toString();
    }
}
