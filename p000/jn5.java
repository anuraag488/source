package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jn5 extends ur1 {
    private static final jn5 DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile yu5 PARSER;
    private wt5 flags_ = wt5.f33724b;

    static {
        jn5 jn5Var = new jn5();
        DEFAULT_INSTANCE = jn5Var;
        ur1.m11628e(jn5.class, jn5Var);
    }

    /* JADX INFO: renamed from: m */
    public static pr6 m7190m() {
        return (pr6) ((gq5) DEFAULT_INSTANCE.mo5307i(5));
    }

    /* JADX INFO: renamed from: n */
    public static jn5 m7191n(FileInputStream fileInputStream) throws ss5 {
        ur1 ur1Var;
        jn5 jn5Var = DEFAULT_INSTANCE;
        no5 no5VarM8806a = no5.m8806a();
        try {
            int i = fileInputStream.read();
            if (i == -1) {
                ur1Var = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = fileInputStream.read();
                            if (i3 == -1) {
                                throw new ss5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new ss5("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = fileInputStream.read();
                                if (i4 == -1) {
                                    throw new ss5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if ((i4 & 128) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                an5 an5Var = new an5(fileInputStream, i);
                yq6 yq6Var = new yq6();
                yq6Var.f35470k = Integer.MAX_VALUE;
                byte[] bArr = kr5.f23354a;
                yq6Var.f35463d = an5Var;
                yq6Var.f35464e = new byte[4096];
                yq6Var.f35465f = 0;
                yq6Var.f35467h = 0;
                yq6Var.f35469j = 0;
                VarHandle.storeStoreFence();
                ur1Var = (ur1) jn5Var.mo5307i(4);
                try {
                    zv5 zv5VarM11661a = uv5.f32208b.m11661a(ur1Var.getClass());
                    zv5VarM11661a.mo9292c(ur1Var, xa0.m12565z0(yq6Var), no5VarM8806a);
                    zv5VarM11661a.mo9290a(ur1Var);
                } catch (IOException e) {
                    if (e.getCause() instanceof ss5) {
                        throw ((ss5) e.getCause());
                    }
                    throw new ss5(e.getMessage(), e);
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof ss5) {
                        throw ((ss5) e2.getCause());
                    }
                    throw e2;
                } catch (ss5 e3) {
                    if (e3.f30547a) {
                        throw new ss5(e3.getMessage(), e3);
                    }
                    throw e3;
                } catch (uw5 e4) {
                    qm5.m9916g(e4.getMessage());
                    ur1Var = null;
                }
                yq6Var.mo4112A(0);
            }
            if (ur1Var == null || ur1.m11629h(ur1Var, true)) {
                return (jn5) ur1Var;
            }
            qm5.m9916g(new uw5().getMessage());
            return null;
        } catch (ss5 e5) {
            if (e5.f30547a) {
                throw new ss5(e5.getMessage(), e5);
            }
            throw e5;
        } catch (IOException e6) {
            throw new ss5(e6.getMessage(), e6);
        }
    }

    @Override // p000.ur1
    /* JADX INFO: renamed from: i */
    public final Object mo5307i(int i) {
        yu5 lq5Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return ur1.m11631k(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", xr6.f34568a});
        }
        if (i2 == 3) {
            return new jn5();
        }
        if (i2 == 4) {
            return new pr6(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (i2 != 6) {
            throw null;
        }
        yu5 yu5Var = PARSER;
        if (yu5Var != null) {
            return yu5Var;
        }
        synchronized (jn5.class) {
            try {
                lq5Var = PARSER;
                if (lq5Var == null) {
                    lq5Var = new lq5(DEFAULT_INSTANCE);
                    PARSER = lq5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lq5Var;
    }

    /* JADX INFO: renamed from: l */
    public final Map m7192l() {
        return Collections.unmodifiableMap(this.flags_);
    }
}
