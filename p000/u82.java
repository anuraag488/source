package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u82 extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient e92 f31729a;

    public u82(String str, Throwable th, e92 e92Var) {
        super(str);
        this.f31729a = e92Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u82)) {
            return false;
        }
        u82 u82Var = (u82) obj;
        if (!z62.m13387o(u82Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = u82Var.f31729a;
        if (obj2 == null) {
            obj2 = k13.f22815b;
        }
        Object obj3 = this.f31729a;
        if (obj3 == null) {
            obj3 = k13.f22815b;
        }
        return obj2.equals(obj3) && z62.m13387o(u82Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Object obj = this.f31729a;
        if (obj == null) {
            obj = k13.f22815b;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f31729a;
        if (obj == null) {
            obj = k13.f22815b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
