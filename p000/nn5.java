package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nn5 extends sn5 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fo5 f25972b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn5(fo5 fo5Var) {
        super(fo5Var);
        this.f25972b = fo5Var;
    }

    @Override // p000.sn5, org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        fo5 fo5Var = this.f25972b;
        fo5.m5764a(fo5Var, bidirectionalStream);
        AtomicReference atomicReference = fo5Var.f19194f;
        while (!atomicReference.compareAndSet(null, bidirectionalStream)) {
            if (atomicReference.get() != null) {
                super.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
            }
        }
        synchronized (fo5Var.f19189a) {
            fo5Var.f19206r.add(bidirectionalStream);
        }
        fo5.m5765b(this.f25972b, bidirectionalStream);
        super.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
    }

    @Override // p000.sn5, org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        fo5 fo5Var = this.f25972b;
        fo5.m5764a(fo5Var, bidirectionalStream);
        synchronized (fo5Var.f19189a) {
            try {
                fo5Var.f19206r.add(bidirectionalStream);
                ArrayList arrayList = fo5Var.f19202n;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    in5 in5Var = (in5) obj;
                    ByteBuffer byteBufferDuplicate = in5Var.f21593b.duplicate();
                    fo5Var.f19203o.put(byteBufferDuplicate, in5Var);
                    bidirectionalStream.write(byteBufferDuplicate, in5Var.f21594c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bidirectionalStream.flush();
        fo5 fo5Var2 = this.f25972b;
        if (fo5Var2.f19205q.compareAndSet(false, true)) {
            fo5Var2.f19196h.onStreamReady(fo5Var2);
        }
    }

    @Override // p000.sn5, org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        fo5 fo5Var = this.f25972b;
        fo5.m5764a(fo5Var, bidirectionalStream);
        synchronized (fo5Var.f19189a) {
            try {
                in5 in5Var = (in5) fo5Var.f19203o.remove(byteBuffer);
                if (in5Var != null) {
                    if (fo5Var.f19204p.contains(in5Var)) {
                        return;
                    }
                    fo5Var.f19204p.add(in5Var);
                    byteBuffer = in5Var.f21592a;
                }
                fo5Var.f19196h.onWriteCompleted(fo5Var, urlResponseInfo, byteBuffer, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
