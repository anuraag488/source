package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import org.chromium.net.NetError;
import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bc6 extends NetworkException {

    /* JADX INFO: renamed from: a */
    public final android.net.http.NetworkException f15210a;

    public bc6(android.net.http.NetworkException networkException, boolean z) {
        super(networkException.getMessage(), null);
        this.f15210a = networkException;
        m3548a(this, networkException);
        if (!z && u76.m11301z(networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3548a(NetworkException networkException, Throwable th) {
        networkException.addSuppressed(th);
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        while (th.getCause() != null && setNewSetFromMap.add(th.getCause())) {
            th = th.getCause();
        }
        networkException.setStackTrace(th.getStackTrace());
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return NetError.ERR_HTTPENGINE_PROVIDER_IN_USE;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.f15210a.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.f15210a.isImmediatelyRetryable();
    }
}
