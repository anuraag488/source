package p000;

import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u16 extends NetworkException {

    /* JADX INFO: renamed from: a */
    public byte f31606a;

    /* JADX INFO: renamed from: b */
    public int f31607b;

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.f31607b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.f31606a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append((int) this.f31606a);
        int i = this.f31607b;
        if (i != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(i);
        }
        sb.append(", Retryable=");
        sb.append(immediatelyRetryable());
        return sb.toString();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        byte b = this.f31606a;
        return b == 3 || b == 4 || b == 5 || b == 6 || b == 8;
    }
}
