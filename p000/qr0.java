package p000;

import java.util.Date;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qr0 extends RequestFinishedInfo.Metrics {

    /* JADX INFO: renamed from: a */
    public long f28707a;

    /* JADX INFO: renamed from: b */
    public long f28708b;

    /* JADX INFO: renamed from: c */
    public long f28709c;

    /* JADX INFO: renamed from: d */
    public long f28710d;

    /* JADX INFO: renamed from: e */
    public long f28711e;

    /* JADX INFO: renamed from: f */
    public long f28712f;

    /* JADX INFO: renamed from: g */
    public long f28713g;

    /* JADX INFO: renamed from: h */
    public long f28714h;

    /* JADX INFO: renamed from: i */
    public long f28715i;

    /* JADX INFO: renamed from: j */
    public long f28716j;

    /* JADX INFO: renamed from: k */
    public long f28717k;

    /* JADX INFO: renamed from: l */
    public long f28718l;

    /* JADX INFO: renamed from: m */
    public long f28719m;

    /* JADX INFO: renamed from: n */
    public Long f28720n;

    /* JADX INFO: renamed from: o */
    public Long f28721o;

    /* JADX INFO: renamed from: p */
    public Long f28722p;

    /* JADX INFO: renamed from: q */
    public Long f28723q;

    /* JADX INFO: renamed from: a */
    public static Date m10043a(long j) {
        if (j != -1) {
            return new Date(j / 1000);
        }
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectEnd() {
        return m10043a(this.f28711e);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectStart() {
        return m10043a(this.f28710d);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsEnd() {
        return m10043a(this.f28709c);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsStart() {
        return m10043a(this.f28708b);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushEnd() {
        return m10043a(this.f28717k);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushStart() {
        return m10043a(this.f28716j);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getReceivedByteCount() {
        return this.f28723q;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestEnd() {
        return m10043a(this.f28719m);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestStart() {
        return m10043a(this.f28707a);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getResponseStart() {
        return m10043a(this.f28718l);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingEnd() {
        return m10043a(this.f28715i);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingStart() {
        return m10043a(this.f28714h);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getSentByteCount() {
        return this.f28722p;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final boolean getSocketReused() {
        return false;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslEnd() {
        return m10043a(this.f28713g);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslStart() {
        return m10043a(this.f28712f);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTotalTimeMs() {
        Long l = this.f28721o;
        if (l == null) {
            return null;
        }
        return Long.valueOf(l.longValue() / 1000);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTtfbMs() {
        Long l = this.f28720n;
        if (l == null) {
            return null;
        }
        return Long.valueOf(l.longValue() / 1000);
    }
}
