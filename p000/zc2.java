package p000;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zc2 {

    /* JADX INFO: renamed from: c */
    public static final Logger f35976c = Logger.getLogger(zc2.class.getName());

    /* JADX INFO: renamed from: d */
    public static final zc2 f35977d;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap f35978a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f35979b;

    static {
        zc2 zc2Var = new zc2();
        zc2Var.f35978a = new ConcurrentHashMap();
        zc2Var.f35979b = new ConcurrentHashMap();
        f35977d = zc2Var;
    }

    /* JADX INFO: renamed from: a */
    public final hj2 m13501a(Class cls, String str) throws GeneralSecurityException {
        hj2 hj2Var;
        synchronized (this) {
            if (!this.f35978a.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
            }
            hj2Var = (hj2) this.f35978a.get(str);
        }
        if (hj2Var.f20626b.equals(cls)) {
            return hj2Var;
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(hj2Var.getClass());
        Class cls2 = hj2Var.f20626b;
        sb.append(", which only supports: ");
        sb.append(cls2);
        throw new GeneralSecurityException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m13502b(hj2 hj2Var, boolean z) {
        try {
            String str = hj2Var.f20625a;
            if (z && this.f35979b.containsKey(str) && !((Boolean) this.f35979b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            hj2 hj2Var2 = (hj2) this.f35978a.get(str);
            if (hj2Var2 != null && !hj2Var2.getClass().equals(hj2Var.getClass())) {
                f35976c.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + hj2Var2.getClass().getName() + ", cannot be re-registered with " + hj2Var.getClass().getName());
            }
            this.f35978a.putIfAbsent(str, hj2Var);
            this.f35979b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m13503c(hj2 hj2Var, boolean z) {
        m13504d(hj2Var, 1, z);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m13504d(hj2 hj2Var, int i, boolean z) {
        if (!zi4.m13601a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        m13502b(hj2Var, z);
    }
}
