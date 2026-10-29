package org.chromium.net;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    @Deprecated
    public static abstract class Builder extends BidirectionalStream.Builder {
        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder addHeader(String str, String str2);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract ExperimentalBidirectionalStream build();

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setHttpMethod(String str);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setPriority(int i);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder setTrafficStatsUid(int i) {
            return this;
        }
    }
}
