package p000;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tr5 extends ExperimentalBidirectionalStream {

    /* JADX INFO: renamed from: a */
    public BidirectionalStream f31376a;

    /* JADX INFO: renamed from: b */
    public v76 f31377b;

    /* JADX INFO: renamed from: c */
    public String f31378c;

    /* JADX INFO: renamed from: d */
    public Collection f31379d;

    /* JADX INFO: renamed from: a */
    public final void m11120a(int i, ir6 ir6Var, CronetException cronetException) {
        sf6.m10746a(this.f31377b, this.f31378c, this.f31379d, null, i, ir6Var, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.f31376a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.f31376a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        return this.f31376a.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        this.f31376a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.f31376a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        this.f31376a.write(byteBuffer, z);
    }
}
