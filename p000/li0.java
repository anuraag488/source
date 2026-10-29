package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class li0 implements xi3, p56, j16 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24042a;

    /* JADX INFO: renamed from: b */
    public boolean f24043b;

    /* JADX INFO: renamed from: c */
    public Object f24044c;

    public li0(Uri uri, boolean z, boolean z2) {
        this.f24042a = (byte) 8;
        this.f24044c = uri;
        this.f24043b = z;
    }

    @Override // p000.xi3
    /* JADX INFO: renamed from: a */
    public void mo7973a(wi3 wi3Var, int i) {
        StringBuilder sb = (StringBuilder) this.f24044c;
        if (this.f24043b) {
            this.f24043b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    /* JADX INFO: renamed from: b */
    public void m7974b() {
        this.f24043b = false;
    }

    /* JADX INFO: renamed from: c */
    public void mo7975c(byte b) {
        ((m62) this.f24044c).writeLong(b);
    }

    /* JADX INFO: renamed from: d */
    public void m7976d(char c) {
        ((m62) this.f24044c).mo6370a(c);
    }

    /* JADX INFO: renamed from: e */
    public void mo7977e(int i) {
        ((m62) this.f24044c).writeLong(i);
    }

    @Override // p000.j16
    /* JADX INFO: renamed from: f */
    public void mo3680f() throws IOException {
        byte b = 4;
        switch (this.f24042a) {
            case 5:
                u06 u06Var = (u06) this.f24044c;
                boolean z = this.f24043b;
                cr5 cr5Var = u06Var.f36452d;
                long length = ((UploadDataProvider) cr5Var.f16400b).getLength();
                u06Var.f36454f = length;
                if (length != 0) {
                    if (length <= 0 || length >= 8192) {
                        u06Var.f36453e = ByteBuffer.allocateDirect(8192);
                    } else {
                        u06Var.f36453e = ByteBuffer.allocateDirect(((int) length) + 1);
                    }
                    long j = u06Var.f36454f;
                    HttpURLConnection httpURLConnection = u06Var.f31582i;
                    if (j > 0) {
                        httpURLConnection.setFixedLengthStreamingMode(j);
                    } else {
                        httpURLConnection.setChunkedStreamingMode(8192);
                    }
                    if (!z) {
                        u06Var.f36449a.set(1);
                        cr5Var.rewind(u06Var);
                    } else {
                        bt5 bt5Var = new bt5((byte) 2);
                        bt5Var.f15596b = u06Var;
                        VarHandle.storeStoreFence();
                        u06Var.m13835b(new oz5(u06Var.f31586m, bt5Var), "startRead");
                    }
                } else {
                    if (u06Var.f31584k != null && u06Var.f31583j.compareAndSet(false, true)) {
                        u06Var.f31584k.close();
                    }
                    i16 i16Var = u06Var.f31586m;
                    i16Var.f21028l = 13;
                    bt5 bt5Var2 = new bt5(b);
                    bt5Var2.f15596b = i16Var;
                    VarHandle.storeStoreFence();
                    i16Var.m6558c(new oz5(i16Var, bt5Var2), "fireGetHeaders");
                }
                break;
            default:
                zx5 zx5Var = (zx5) this.f24044c;
                boolean z2 = this.f24043b;
                long j2 = zx5Var.f36454f;
                if (j2 != -1 && j2 - zx5Var.f36455g < zx5Var.f36453e.remaining()) {
                    zx5Var.mo11198a(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(zx5Var.f36455g + ((long) zx5Var.f36453e.remaining())), Long.valueOf(zx5Var.f36454f))));
                } else if (zx5Var.f36453e.remaining() == 0 && !z2) {
                    zx5Var.mo11198a(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                } else {
                    long j3 = zx5Var.f36455g;
                    ByteBuffer byteBuffer = zx5Var.f36453e;
                    u06 u06Var2 = (u06) zx5Var;
                    int iWrite = 0;
                    while (byteBuffer.hasRemaining()) {
                        iWrite += u06Var2.f31584k.write(byteBuffer);
                    }
                    u06Var2.f31585l.flush();
                    long j4 = j3 + ((long) iWrite);
                    zx5Var.f36455g = j4;
                    long j5 = zx5Var.f36454f;
                    if (j4 >= j5) {
                        if (j5 == -1) {
                            if (z2) {
                                j5 = -1;
                            }
                        }
                        if (j5 == -1) {
                            if (u06Var2.f31584k != null && u06Var2.f31583j.compareAndSet(false, true)) {
                                u06Var2.f31584k.close();
                            }
                            i16 i16Var2 = u06Var2.f31586m;
                            i16Var2.f21028l = 13;
                            bt5 bt5Var3 = new bt5(b);
                            bt5Var3.f15596b = i16Var2;
                            VarHandle.storeStoreFence();
                            i16Var2.m6558c(new oz5(i16Var2, bt5Var3), "fireGetHeaders");
                        } else if (j5 != j4) {
                            zx5Var.mo11198a(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(zx5Var.f36455g), Long.valueOf(zx5Var.f36454f))));
                        } else {
                            if (u06Var2.f31584k != null && u06Var2.f31583j.compareAndSet(false, true)) {
                                u06Var2.f31584k.close();
                            }
                            i16 i16Var3 = u06Var2.f31586m;
                            i16Var3.f21028l = 13;
                            bt5 bt5Var4 = new bt5(b);
                            bt5Var4.f15596b = i16Var3;
                            VarHandle.storeStoreFence();
                            i16Var3.m6558c(new oz5(i16Var3, bt5Var4), "fireGetHeaders");
                        }
                    }
                    zx5Var.f36449a.set(0);
                    rr5 rr5Var = new rr5(b);
                    rr5Var.f29555b = zx5Var;
                    VarHandle.storeStoreFence();
                    zx5Var.m13836c(rr5Var, "readFromProvider");
                }
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo7978g(long j) {
        ((m62) this.f24044c).writeLong(j);
    }

    /* JADX INFO: renamed from: h */
    public void m7979h(String str) {
        ((m62) this.f24044c).mo6372d(str);
    }

    /* JADX INFO: renamed from: i */
    public void mo7980i(short s) {
        ((m62) this.f24044c).writeLong(s);
    }

    /* JADX INFO: renamed from: j */
    public void mo7981j(String str) {
        ((m62) this.f24044c).mo6371c(str);
    }

    /* JADX INFO: renamed from: m */
    public void m7984m(nf6 nf6Var) {
        if (this.f24043b) {
            qv5.m10140h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((C1122rv) this.f24044c).m10464w(new C1417zt(nf6Var, ag3.f14485a), new ds3((byte) 22));
        } catch (Throwable unused) {
            qv5.m10140h("BillingLogger", "logging failed.");
        }
    }

    /* JADX INFO: renamed from: n */
    public le6 m7985n(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        Object obj = le6.f23979g;
        return new le6(this, str, lValueOf, (byte) 0);
    }

    /* JADX INFO: renamed from: o */
    public le6 m7986o(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = le6.f23979g;
        return new le6(this, str, boolValueOf, (byte) 1);
    }

    /* JADX INFO: renamed from: p */
    public le6 m7987p(String str, String str2) {
        Object obj = le6.f23979g;
        return new le6(this, str, str2, (byte) 3);
    }

    public /* synthetic */ li0(byte b) {
        this.f24042a = b;
    }

    public li0(m62 m62Var) {
        this.f24042a = (byte) 0;
        this.f24044c = m62Var;
        this.f24043b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public li0(zp4 zp4Var, int i) {
        this.f24042a = (byte) 3;
        this.f24044c = zp4Var;
        this.f24043b = i;
    }

    @Override // p000.p56
    /* JADX INFO: renamed from: f */
    public Object mo4490f() {
        return HsdpDeepLinkServiceFactory.lambda$createInternal$0((Context) this.f24044c, this.f24043b);
    }

    /* JADX INFO: renamed from: k */
    public void m7982k() {
    }

    /* JADX INFO: renamed from: l */
    public void m7983l() {
    }
}
