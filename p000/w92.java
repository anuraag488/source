package p000;

import java.lang.invoke.VarHandle;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w92 implements i81 {

    /* JADX INFO: renamed from: f */
    public static final u92 f33171f;

    /* JADX INFO: renamed from: g */
    public static final u92 f33172g;

    /* JADX INFO: renamed from: a */
    public final HashMap f33174a;

    /* JADX INFO: renamed from: b */
    public final HashMap f33175b;

    /* JADX INFO: renamed from: c */
    public final t92 f33176c;

    /* JADX INFO: renamed from: d */
    public boolean f33177d;

    /* JADX INFO: renamed from: e */
    public static final t92 f33170e = new t92((byte) 0);

    /* JADX INFO: renamed from: h */
    public static final v92 f33173h = new v92();

    /* JADX WARN: Type inference failed for: r0v1, types: [u92] */
    /* JADX WARN: Type inference failed for: r0v2, types: [u92] */
    static {
        final byte b = 0;
        f33171f = new lw4() { // from class: u92
            @Override // p000.h81
            /* JADX INFO: renamed from: a */
            public final void mo3114a(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((mw4) obj2).mo8422b((String) obj);
                        break;
                    default:
                        ((mw4) obj2).mo8423c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final byte b2 = 1;
        f33172g = new lw4() { // from class: u92
            @Override // p000.h81
            /* JADX INFO: renamed from: a */
            public final void mo3114a(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((mw4) obj2).mo8422b((String) obj);
                        break;
                    default:
                        ((mw4) obj2).mo8423c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public w92() {
        HashMap map = new HashMap();
        this.f33174a = map;
        HashMap map2 = new HashMap();
        this.f33175b = map2;
        this.f33176c = f33170e;
        this.f33177d = false;
        map2.put(String.class, f33171f);
        map.remove(String.class);
        map2.put(Boolean.class, f33172g);
        map.remove(Boolean.class);
        map2.put(Date.class, f33173h);
        map.remove(Date.class);
    }

    /* JADX INFO: renamed from: a */
    public final w42 m12168a() {
        w42 w42Var = new w42((byte) 1, false);
        w42Var.f33090b = this;
        VarHandle.storeStoreFence();
        return w42Var;
    }

    /* JADX INFO: renamed from: b */
    public final i81 m12169b(Class cls, m23 m23Var) {
        this.f33174a.put(cls, m23Var);
        this.f33175b.remove(cls);
        return this;
    }
}
