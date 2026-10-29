package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class sn5 extends BidirectionalStream.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fo5 f30417a;

    public /* synthetic */ sn5(fo5 fo5Var) {
        this.f30417a = fo5Var;
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        fo5 fo5Var = this.f30417a;
        fo5.m5764a(fo5Var, bidirectionalStream);
        er0 er0Var = fo5Var.f19190b;
        C1283w7 c1283w7 = fo5Var.f19200l;
        ir0 ir0Var = ir0.f21662e;
        if (bidirectionalStream == er0Var) {
            ((AtomicReference) c1283w7.f33127c).set(ir0Var);
        } else {
            ((AtomicReference) c1283w7.f33128d).set(ir0Var);
        }
        if (fo5Var.f19194f.get() == bidirectionalStream || fo5Var.f19191c.getAndSet(true)) {
            fo5Var.f19196h.onCanceled(fo5Var, urlResponseInfo);
            fo5Var.f19198j.mo4107G(c1283w7);
            if (fo5Var.f19197i.f18369k.remove(fo5Var)) {
                return;
            }
            C1077qn.m9985k("Stream is not registered as active.");
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        fo5 fo5Var = this.f30417a;
        fo5.m5764a(fo5Var, bidirectionalStream);
        er0 er0Var = fo5Var.f19190b;
        C1283w7 c1283w7 = fo5Var.f19200l;
        ir0 ir0Var = ir0.f21661d;
        if (bidirectionalStream == er0Var) {
            ((AtomicReference) c1283w7.f33127c).set(ir0Var);
        } else {
            ((AtomicReference) c1283w7.f33128d).set(ir0Var);
        }
        if (fo5Var.f19194f.get() == bidirectionalStream || fo5Var.f19191c.getAndSet(true)) {
            fo5Var.f19196h.onFailed(fo5Var, urlResponseInfo, cronetException);
            fo5Var.f19198j.mo4107G(c1283w7);
            if (fo5Var.f19197i.f18369k.remove(fo5Var)) {
                return;
            }
            C1077qn.m9985k("Stream is not registered as active.");
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        fo5 fo5Var = this.f30417a;
        fo5.m5764a(fo5Var, bidirectionalStream);
        if (fo5Var.f19194f.get() == bidirectionalStream) {
            fo5Var.f19196h.onReadCompleted(fo5Var, urlResponseInfo, byteBuffer, z);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        fo5 fo5Var = this.f30417a;
        fo5.m5764a(fo5Var, bidirectionalStream);
        if (fo5Var.f19194f.get() == bidirectionalStream) {
            fo5Var.f19196h.onResponseHeadersReceived(fo5Var, urlResponseInfo);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        fo5 fo5Var = this.f30417a;
        fo5.m5764a(fo5Var, bidirectionalStream);
        if (fo5Var.f19194f.get() == bidirectionalStream) {
            fo5Var.f19196h.onResponseTrailersReceived(fo5Var, urlResponseInfo, headerBlock);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public void onStreamReady(BidirectionalStream bidirectionalStream) {
        fo5 fo5Var = this.f30417a;
        fo5.m5764a(fo5Var, bidirectionalStream);
        AtomicReference atomicReference = fo5Var.f19194f;
        while (!atomicReference.compareAndSet(null, bidirectionalStream)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        fo5.m5765b(fo5Var, bidirectionalStream);
        fo5Var.f19196h.onStreamReady(fo5Var);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        fo5 fo5Var = this.f30417a;
        fo5.m5764a(fo5Var, bidirectionalStream);
        er0 er0Var = fo5Var.f19190b;
        C1283w7 c1283w7 = fo5Var.f19200l;
        ir0 ir0Var = ir0.f21660c;
        if (bidirectionalStream == er0Var) {
            ((AtomicReference) c1283w7.f33127c).set(ir0Var);
        } else {
            ((AtomicReference) c1283w7.f33128d).set(ir0Var);
        }
        if (fo5Var.f19194f.get() == bidirectionalStream) {
            fo5Var.f19196h.onSucceeded(fo5Var, urlResponseInfo);
            fo5Var.f19198j.mo4107G(c1283w7);
            if (fo5Var.f19197i.f18369k.remove(fo5Var)) {
                return;
            }
            C1077qn.m9985k("Stream is not registered as active.");
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        fo5 fo5Var = this.f30417a;
        fo5.m5764a(fo5Var, bidirectionalStream);
        if (fo5Var.f19194f.get() == bidirectionalStream) {
            fo5Var.f19196h.onWriteCompleted(fo5Var, urlResponseInfo, byteBuffer, z);
        }
    }
}
