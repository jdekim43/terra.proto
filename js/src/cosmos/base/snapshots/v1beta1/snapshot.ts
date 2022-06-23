/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";

export const protobufPackage = "cosmos.base.snapshots.v1beta1";

/** Snapshot contains Tendermint state sync snapshot info. */
export interface Snapshot {
  height: Long;
  format: number;
  chunks: number;
  hash: Uint8Array;
  metadata?: Metadata;
}

/** Metadata contains SDK-specific snapshot metadata. */
export interface Metadata {
  /** SHA-256 chunk hashes */
  chunkHashes: Uint8Array[];
}

/** SnapshotItem is an item contained in a rootmulti.Store snapshot. */
export interface SnapshotItem {
  store?: SnapshotStoreItem | undefined;
  iavl?: SnapshotIAVLItem | undefined;
  extension?: SnapshotExtensionMeta | undefined;
  extensionPayload?: SnapshotExtensionPayload | undefined;
}

/** SnapshotStoreItem contains metadata about a snapshotted store. */
export interface SnapshotStoreItem {
  name: string;
}

/** SnapshotIAVLItem is an exported IAVL node. */
export interface SnapshotIAVLItem {
  key: Uint8Array;
  value: Uint8Array;
  /** version is block height */
  version: Long;
  /** height is depth of the tree. */
  height: number;
}

/** SnapshotExtensionMeta contains metadata about an external snapshotter. */
export interface SnapshotExtensionMeta {
  name: string;
  format: number;
}

/** SnapshotExtensionPayload contains payloads of an external snapshotter. */
export interface SnapshotExtensionPayload {
  payload: Uint8Array;
}

const baseSnapshot: object = { height: Long.UZERO, format: 0, chunks: 0 };

export const Snapshot = {
  encode(message: Snapshot, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (!message.height.isZero()) {
      writer.uint32(8).uint64(message.height);
    }
    if (message.format !== 0) {
      writer.uint32(16).uint32(message.format);
    }
    if (message.chunks !== 0) {
      writer.uint32(24).uint32(message.chunks);
    }
    if (message.hash.length !== 0) {
      writer.uint32(34).bytes(message.hash);
    }
    if (message.metadata !== undefined) {
      Metadata.encode(message.metadata, writer.uint32(42).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Snapshot {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseSnapshot } as Snapshot;
    message.hash = new Uint8Array();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.height = reader.uint64() as Long;
          break;
        case 2:
          message.format = reader.uint32();
          break;
        case 3:
          message.chunks = reader.uint32();
          break;
        case 4:
          message.hash = reader.bytes();
          break;
        case 5:
          message.metadata = Metadata.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Snapshot {
    const message = { ...baseSnapshot } as Snapshot;
    message.hash = new Uint8Array();
    if (object.height !== undefined && object.height !== null) {
      message.height = Long.fromString(object.height);
    } else {
      message.height = Long.UZERO;
    }
    if (object.format !== undefined && object.format !== null) {
      message.format = Number(object.format);
    } else {
      message.format = 0;
    }
    if (object.chunks !== undefined && object.chunks !== null) {
      message.chunks = Number(object.chunks);
    } else {
      message.chunks = 0;
    }
    if (object.hash !== undefined && object.hash !== null) {
      message.hash = bytesFromBase64(object.hash);
    }
    if (object.metadata !== undefined && object.metadata !== null) {
      message.metadata = Metadata.fromJSON(object.metadata);
    } else {
      message.metadata = undefined;
    }
    return message;
  },

  toJSON(message: Snapshot): unknown {
    const obj: any = {};
    message.height !== undefined && (obj.height = (message.height || Long.UZERO).toString());
    message.format !== undefined && (obj.format = message.format);
    message.chunks !== undefined && (obj.chunks = message.chunks);
    message.hash !== undefined &&
      (obj.hash = base64FromBytes(message.hash !== undefined ? message.hash : new Uint8Array()));
    message.metadata !== undefined &&
      (obj.metadata = message.metadata ? Metadata.toJSON(message.metadata) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<Snapshot>): Snapshot {
    const message = { ...baseSnapshot } as Snapshot;
    if (object.height !== undefined && object.height !== null) {
      message.height = object.height as Long;
    } else {
      message.height = Long.UZERO;
    }
    if (object.format !== undefined && object.format !== null) {
      message.format = object.format;
    } else {
      message.format = 0;
    }
    if (object.chunks !== undefined && object.chunks !== null) {
      message.chunks = object.chunks;
    } else {
      message.chunks = 0;
    }
    if (object.hash !== undefined && object.hash !== null) {
      message.hash = object.hash;
    } else {
      message.hash = new Uint8Array();
    }
    if (object.metadata !== undefined && object.metadata !== null) {
      message.metadata = Metadata.fromPartial(object.metadata);
    } else {
      message.metadata = undefined;
    }
    return message;
  },
};

const baseMetadata: object = {};

export const Metadata = {
  encode(message: Metadata, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.chunkHashes) {
      writer.uint32(10).bytes(v!);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Metadata {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseMetadata } as Metadata;
    message.chunkHashes = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.chunkHashes.push(reader.bytes());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Metadata {
    const message = { ...baseMetadata } as Metadata;
    message.chunkHashes = [];
    if (object.chunkHashes !== undefined && object.chunkHashes !== null) {
      for (const e of object.chunkHashes) {
        message.chunkHashes.push(bytesFromBase64(e));
      }
    }
    return message;
  },

  toJSON(message: Metadata): unknown {
    const obj: any = {};
    if (message.chunkHashes) {
      obj.chunkHashes = message.chunkHashes.map((e) =>
        base64FromBytes(e !== undefined ? e : new Uint8Array()),
      );
    } else {
      obj.chunkHashes = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<Metadata>): Metadata {
    const message = { ...baseMetadata } as Metadata;
    message.chunkHashes = [];
    if (object.chunkHashes !== undefined && object.chunkHashes !== null) {
      for (const e of object.chunkHashes) {
        message.chunkHashes.push(e);
      }
    }
    return message;
  },
};

const baseSnapshotItem: object = {};

export const SnapshotItem = {
  encode(message: SnapshotItem, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.store !== undefined) {
      SnapshotStoreItem.encode(message.store, writer.uint32(10).fork()).ldelim();
    }
    if (message.iavl !== undefined) {
      SnapshotIAVLItem.encode(message.iavl, writer.uint32(18).fork()).ldelim();
    }
    if (message.extension !== undefined) {
      SnapshotExtensionMeta.encode(message.extension, writer.uint32(26).fork()).ldelim();
    }
    if (message.extensionPayload !== undefined) {
      SnapshotExtensionPayload.encode(message.extensionPayload, writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SnapshotItem {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseSnapshotItem } as SnapshotItem;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.store = SnapshotStoreItem.decode(reader, reader.uint32());
          break;
        case 2:
          message.iavl = SnapshotIAVLItem.decode(reader, reader.uint32());
          break;
        case 3:
          message.extension = SnapshotExtensionMeta.decode(reader, reader.uint32());
          break;
        case 4:
          message.extensionPayload = SnapshotExtensionPayload.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SnapshotItem {
    const message = { ...baseSnapshotItem } as SnapshotItem;
    if (object.store !== undefined && object.store !== null) {
      message.store = SnapshotStoreItem.fromJSON(object.store);
    } else {
      message.store = undefined;
    }
    if (object.iavl !== undefined && object.iavl !== null) {
      message.iavl = SnapshotIAVLItem.fromJSON(object.iavl);
    } else {
      message.iavl = undefined;
    }
    if (object.extension !== undefined && object.extension !== null) {
      message.extension = SnapshotExtensionMeta.fromJSON(object.extension);
    } else {
      message.extension = undefined;
    }
    if (object.extensionPayload !== undefined && object.extensionPayload !== null) {
      message.extensionPayload = SnapshotExtensionPayload.fromJSON(object.extensionPayload);
    } else {
      message.extensionPayload = undefined;
    }
    return message;
  },

  toJSON(message: SnapshotItem): unknown {
    const obj: any = {};
    message.store !== undefined &&
      (obj.store = message.store ? SnapshotStoreItem.toJSON(message.store) : undefined);
    message.iavl !== undefined &&
      (obj.iavl = message.iavl ? SnapshotIAVLItem.toJSON(message.iavl) : undefined);
    message.extension !== undefined &&
      (obj.extension = message.extension ? SnapshotExtensionMeta.toJSON(message.extension) : undefined);
    message.extensionPayload !== undefined &&
      (obj.extensionPayload = message.extensionPayload
        ? SnapshotExtensionPayload.toJSON(message.extensionPayload)
        : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<SnapshotItem>): SnapshotItem {
    const message = { ...baseSnapshotItem } as SnapshotItem;
    if (object.store !== undefined && object.store !== null) {
      message.store = SnapshotStoreItem.fromPartial(object.store);
    } else {
      message.store = undefined;
    }
    if (object.iavl !== undefined && object.iavl !== null) {
      message.iavl = SnapshotIAVLItem.fromPartial(object.iavl);
    } else {
      message.iavl = undefined;
    }
    if (object.extension !== undefined && object.extension !== null) {
      message.extension = SnapshotExtensionMeta.fromPartial(object.extension);
    } else {
      message.extension = undefined;
    }
    if (object.extensionPayload !== undefined && object.extensionPayload !== null) {
      message.extensionPayload = SnapshotExtensionPayload.fromPartial(object.extensionPayload);
    } else {
      message.extensionPayload = undefined;
    }
    return message;
  },
};

const baseSnapshotStoreItem: object = { name: "" };

export const SnapshotStoreItem = {
  encode(message: SnapshotStoreItem, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SnapshotStoreItem {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseSnapshotStoreItem } as SnapshotStoreItem;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SnapshotStoreItem {
    const message = { ...baseSnapshotStoreItem } as SnapshotStoreItem;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    return message;
  },

  toJSON(message: SnapshotStoreItem): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    return obj;
  },

  fromPartial(object: DeepPartial<SnapshotStoreItem>): SnapshotStoreItem {
    const message = { ...baseSnapshotStoreItem } as SnapshotStoreItem;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    return message;
  },
};

const baseSnapshotIAVLItem: object = { version: Long.ZERO, height: 0 };

export const SnapshotIAVLItem = {
  encode(message: SnapshotIAVLItem, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.key.length !== 0) {
      writer.uint32(10).bytes(message.key);
    }
    if (message.value.length !== 0) {
      writer.uint32(18).bytes(message.value);
    }
    if (!message.version.isZero()) {
      writer.uint32(24).int64(message.version);
    }
    if (message.height !== 0) {
      writer.uint32(32).int32(message.height);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SnapshotIAVLItem {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseSnapshotIAVLItem } as SnapshotIAVLItem;
    message.key = new Uint8Array();
    message.value = new Uint8Array();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.key = reader.bytes();
          break;
        case 2:
          message.value = reader.bytes();
          break;
        case 3:
          message.version = reader.int64() as Long;
          break;
        case 4:
          message.height = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SnapshotIAVLItem {
    const message = { ...baseSnapshotIAVLItem } as SnapshotIAVLItem;
    message.key = new Uint8Array();
    message.value = new Uint8Array();
    if (object.key !== undefined && object.key !== null) {
      message.key = bytesFromBase64(object.key);
    }
    if (object.value !== undefined && object.value !== null) {
      message.value = bytesFromBase64(object.value);
    }
    if (object.version !== undefined && object.version !== null) {
      message.version = Long.fromString(object.version);
    } else {
      message.version = Long.ZERO;
    }
    if (object.height !== undefined && object.height !== null) {
      message.height = Number(object.height);
    } else {
      message.height = 0;
    }
    return message;
  },

  toJSON(message: SnapshotIAVLItem): unknown {
    const obj: any = {};
    message.key !== undefined &&
      (obj.key = base64FromBytes(message.key !== undefined ? message.key : new Uint8Array()));
    message.value !== undefined &&
      (obj.value = base64FromBytes(message.value !== undefined ? message.value : new Uint8Array()));
    message.version !== undefined && (obj.version = (message.version || Long.ZERO).toString());
    message.height !== undefined && (obj.height = message.height);
    return obj;
  },

  fromPartial(object: DeepPartial<SnapshotIAVLItem>): SnapshotIAVLItem {
    const message = { ...baseSnapshotIAVLItem } as SnapshotIAVLItem;
    if (object.key !== undefined && object.key !== null) {
      message.key = object.key;
    } else {
      message.key = new Uint8Array();
    }
    if (object.value !== undefined && object.value !== null) {
      message.value = object.value;
    } else {
      message.value = new Uint8Array();
    }
    if (object.version !== undefined && object.version !== null) {
      message.version = object.version as Long;
    } else {
      message.version = Long.ZERO;
    }
    if (object.height !== undefined && object.height !== null) {
      message.height = object.height;
    } else {
      message.height = 0;
    }
    return message;
  },
};

const baseSnapshotExtensionMeta: object = { name: "", format: 0 };

export const SnapshotExtensionMeta = {
  encode(message: SnapshotExtensionMeta, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.format !== 0) {
      writer.uint32(16).uint32(message.format);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SnapshotExtensionMeta {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseSnapshotExtensionMeta } as SnapshotExtensionMeta;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.format = reader.uint32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SnapshotExtensionMeta {
    const message = { ...baseSnapshotExtensionMeta } as SnapshotExtensionMeta;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.format !== undefined && object.format !== null) {
      message.format = Number(object.format);
    } else {
      message.format = 0;
    }
    return message;
  },

  toJSON(message: SnapshotExtensionMeta): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.format !== undefined && (obj.format = message.format);
    return obj;
  },

  fromPartial(object: DeepPartial<SnapshotExtensionMeta>): SnapshotExtensionMeta {
    const message = { ...baseSnapshotExtensionMeta } as SnapshotExtensionMeta;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.format !== undefined && object.format !== null) {
      message.format = object.format;
    } else {
      message.format = 0;
    }
    return message;
  },
};

const baseSnapshotExtensionPayload: object = {};

export const SnapshotExtensionPayload = {
  encode(message: SnapshotExtensionPayload, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.payload.length !== 0) {
      writer.uint32(10).bytes(message.payload);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SnapshotExtensionPayload {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseSnapshotExtensionPayload } as SnapshotExtensionPayload;
    message.payload = new Uint8Array();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.payload = reader.bytes();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SnapshotExtensionPayload {
    const message = { ...baseSnapshotExtensionPayload } as SnapshotExtensionPayload;
    message.payload = new Uint8Array();
    if (object.payload !== undefined && object.payload !== null) {
      message.payload = bytesFromBase64(object.payload);
    }
    return message;
  },

  toJSON(message: SnapshotExtensionPayload): unknown {
    const obj: any = {};
    message.payload !== undefined &&
      (obj.payload = base64FromBytes(message.payload !== undefined ? message.payload : new Uint8Array()));
    return obj;
  },

  fromPartial(object: DeepPartial<SnapshotExtensionPayload>): SnapshotExtensionPayload {
    const message = { ...baseSnapshotExtensionPayload } as SnapshotExtensionPayload;
    if (object.payload !== undefined && object.payload !== null) {
      message.payload = object.payload;
    } else {
      message.payload = new Uint8Array();
    }
    return message;
  },
};

declare var self: any | undefined;
declare var window: any | undefined;
var globalThis: any = (() => {
  if (typeof globalThis !== "undefined") return globalThis;
  if (typeof self !== "undefined") return self;
  if (typeof window !== "undefined") return window;
  if (typeof global !== "undefined") return global;
  throw "Unable to locate global object";
})();

const atob: (b64: string) => string =
  globalThis.atob || ((b64) => globalThis.Buffer.from(b64, "base64").toString("binary"));
function bytesFromBase64(b64: string): Uint8Array {
  const bin = atob(b64);
  const arr = new Uint8Array(bin.length);
  for (let i = 0; i < bin.length; ++i) {
    arr[i] = bin.charCodeAt(i);
  }
  return arr;
}

const btoa: (bin: string) => string =
  globalThis.btoa || ((bin) => globalThis.Buffer.from(bin, "binary").toString("base64"));
function base64FromBytes(arr: Uint8Array): string {
  const bin: string[] = [];
  for (const byte of arr) {
    bin.push(String.fromCharCode(byte));
  }
  return btoa(bin.join(""));
}

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined | Long;
export type DeepPartial<T> = T extends Builtin
  ? T
  : T extends Array<infer U>
  ? Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U>
  ? ReadonlyArray<DeepPartial<U>>
  : T extends {}
  ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}
