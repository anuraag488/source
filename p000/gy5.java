package p000;

import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gy5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20200a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ i16 f20201b;

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 5;
        switch (this.f20200a) {
            case 0:
                i16 i16Var = this.f20201b;
                u06 u06Var = i16Var.f21034r;
                if (u06Var != null) {
                    try {
                        if (u06Var.f31584k != null && u06Var.f31583j.compareAndSet(false, true)) {
                            u06Var.f31584k.close();
                        }
                    } catch (IOException e) {
                        Log.e("cn_".concat("i16"), "Exception when closing OutputChannel", e);
                    }
                }
                HttpURLConnection httpURLConnection = i16Var.f21033q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    i16Var.f21033q = null;
                }
                break;
            case 1:
                i16 i16Var2 = this.f20201b;
                i16Var2.f21021e.add(i16Var2.f21029m);
                rr5 rr5Var = new rr5(b);
                rr5Var.f29555b = i16Var2;
                VarHandle.storeStoreFence();
                i16Var2.m6558c(new oz5(i16Var2, rr5Var), "fireOpenConnection");
                break;
            case 2:
                i16 i16Var3 = this.f20201b;
                ReadableByteChannel readableByteChannel = i16Var3.f21030n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    i16Var3.f21030n = null;
                }
                break;
            case 3:
                this.f20201b.f21040x++;
                break;
            default:
                i16 i16Var4 = this.f20201b;
                i16Var4.f21029m = i16Var4.f21032p;
                i16Var4.f21032p = null;
                rr5 rr5Var2 = new rr5(b);
                rr5Var2.f29555b = i16Var4;
                VarHandle.storeStoreFence();
                i16Var4.m6558c(new oz5(i16Var4, rr5Var2), "fireOpenConnection");
                break;
        }
    }
}
