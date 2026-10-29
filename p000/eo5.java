package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eo5 implements e43, y33, v33 {

    /* JADX INFO: renamed from: a */
    public Object f18336a;

    /* JADX INFO: renamed from: b */
    public int f18337b;

    /* JADX INFO: renamed from: c */
    public nr6 f18338c;

    /* JADX INFO: renamed from: d */
    public int f18339d;

    /* JADX INFO: renamed from: e */
    public int f18340e;

    /* JADX INFO: renamed from: f */
    public int f18341f;

    /* JADX INFO: renamed from: g */
    public Exception f18342g;

    /* JADX INFO: renamed from: h */
    public boolean f18343h;

    /* JADX INFO: renamed from: a */
    public final void m5268a() {
        nr6 nr6Var = this.f18338c;
        int i = this.f18339d;
        int i2 = this.f18340e;
        int i3 = i + i2 + this.f18341f;
        int i4 = this.f18337b;
        if (i3 == i4) {
            if (this.f18342g == null) {
                if (this.f18343h) {
                    nr6Var.m8831o();
                    return;
                } else {
                    nr6Var.m8828l(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            nr6Var.m8830n(new ExecutionException(sb.toString(), this.f18342g));
        }
    }

    @Override // p000.v33
    /* JADX INFO: renamed from: e */
    public final void mo140e() {
        synchronized (this.f18336a) {
            this.f18341f++;
            this.f18343h = true;
            m5268a();
        }
    }

    @Override // p000.y33
    /* JADX INFO: renamed from: g */
    public final void mo141g(Exception exc) {
        synchronized (this.f18336a) {
            this.f18340e++;
            this.f18342g = exc;
            m5268a();
        }
    }

    @Override // p000.e43
    public final void onSuccess(Object obj) {
        synchronized (this.f18336a) {
            this.f18339d++;
            m5268a();
        }
    }
}
