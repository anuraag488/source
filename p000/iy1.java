package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iy1 extends ii4 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f21875e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f21876f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f21877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy1(String str, Object obj, Object obj2, byte b) {
        super(str, true);
        this.f21875e = b;
        this.f21876f = obj;
        this.f21877g = obj2;
    }

    @Override // p000.ii4
    /* JADX INFO: renamed from: a */
    public final long mo6810a() {
        int i;
        long jM3433a;
        vy1[] vy1VarArr = null;
        switch (this.f21875e) {
            case 0:
                hk3 hk3Var = ((oy1) this.f21876f).f27207a;
                b44 b44Var = (b44) ((ql3) this.f21877g).f28555a;
                synchronized (hk3Var) {
                    hk3Var.f20655w = (b44Var.f15078a & 16) != 0 ? b44Var.f15079b[4] : Integer.MAX_VALUE;
                }
                return -1L;
            case 1:
                try {
                    ((vy1) this.f21877g).m12021c(8, null);
                    break;
                } catch (IOException e) {
                    hb3 hb3Var = hb3.f20468a;
                    hb3 hb3Var2 = hb3.f20468a;
                    String str = "Http2Connection.Listener failure for " + ((oy1) this.f21876f).f27209c;
                    hb3Var2.getClass();
                    hb3.m6326f(4, str, e);
                    try {
                        ((vy1) this.f21877g).m12021c(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                C0839kl c0839kl = (C0839kl) this.f21876f;
                b44 b44Var2 = (b44) this.f21877g;
                ql3 ql3Var = new ql3();
                oy1 oy1Var = (oy1) c0839kl.f23209c;
                synchronized (oy1Var.f27229w) {
                    try {
                        synchronized (oy1Var) {
                            try {
                                b44 b44Var3 = oy1Var.f27223q;
                                b44 b44Var4 = new b44();
                                byte b = 0;
                                for (int i2 = 0; i2 < 10; i2++) {
                                    if (((1 << i2) & b44Var3.f15078a) != 0) {
                                        b44Var4.m3434b(i2, b44Var3.f15079b[i2]);
                                    }
                                }
                                for (int i3 = 0; i3 < 10; i3++) {
                                    if (((1 << i3) & b44Var2.f15078a) != 0) {
                                        b44Var4.m3434b(i3, b44Var2.f15079b[i3]);
                                    }
                                }
                                ql3Var.f28555a = b44Var4;
                                jM3433a = ((long) b44Var4.m3433a()) - ((long) b44Var3.m3433a());
                                if (jM3433a != 0 && !oy1Var.f27208b.isEmpty()) {
                                    vy1VarArr = (vy1[]) oy1Var.f27208b.values().toArray(new vy1[0]);
                                }
                                oy1Var.f27223q = (b44) ql3Var.f28555a;
                                oy1Var.f27216j.m9124c(new iy1(oy1Var.f27209c + " onSettings", oy1Var, ql3Var, b == true ? 1 : 0), 0L);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            oy1Var.f27229w.m12440a((b44) ql3Var.f28555a);
                        } catch (IOException e2) {
                            oy1Var.m9328a(2, 2, e2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (vy1VarArr != null) {
                    for (vy1 vy1Var : vy1VarArr) {
                        synchronized (vy1Var) {
                            vy1Var.f32937f += jM3433a;
                            if (jM3433a > 0) {
                                vy1Var.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return -1L;
        }
    }
}
