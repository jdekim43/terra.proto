// source: terra/oracle/v1beta1/genesis.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
goog.object.extend(proto, gogoproto_gogo_pb);
var terra_oracle_v1beta1_oracle_pb = require('../../../terra/oracle/v1beta1/oracle_pb.js');
goog.object.extend(proto, terra_oracle_v1beta1_oracle_pb);
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
goog.object.extend(proto, cosmos_base_v1beta1_coin_pb);
goog.exportSymbol('proto.terra.oracle.v1beta1.FeederDelegation', null, global);
goog.exportSymbol('proto.terra.oracle.v1beta1.GenesisState', null, global);
goog.exportSymbol('proto.terra.oracle.v1beta1.MissCounter', null, global);
goog.exportSymbol('proto.terra.oracle.v1beta1.TobinTax', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.terra.oracle.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.terra.oracle.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.terra.oracle.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.terra.oracle.v1beta1.GenesisState.displayName = 'proto.terra.oracle.v1beta1.GenesisState';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.terra.oracle.v1beta1.FeederDelegation = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.terra.oracle.v1beta1.FeederDelegation, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.terra.oracle.v1beta1.FeederDelegation.displayName = 'proto.terra.oracle.v1beta1.FeederDelegation';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.terra.oracle.v1beta1.MissCounter = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.terra.oracle.v1beta1.MissCounter, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.terra.oracle.v1beta1.MissCounter.displayName = 'proto.terra.oracle.v1beta1.MissCounter';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.terra.oracle.v1beta1.TobinTax = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.terra.oracle.v1beta1.TobinTax, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.terra.oracle.v1beta1.TobinTax.displayName = 'proto.terra.oracle.v1beta1.TobinTax';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.terra.oracle.v1beta1.GenesisState.repeatedFields_ = [2,3,4,5,6,7];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.terra.oracle.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.terra.oracle.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.terra.oracle.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && terra_oracle_v1beta1_oracle_pb.Params.toObject(includeInstance, f),
    feederDelegationsList: jspb.Message.toObjectList(msg.getFeederDelegationsList(),
    proto.terra.oracle.v1beta1.FeederDelegation.toObject, includeInstance),
    exchangeRatesList: jspb.Message.toObjectList(msg.getExchangeRatesList(),
    terra_oracle_v1beta1_oracle_pb.ExchangeRateTuple.toObject, includeInstance),
    missCountersList: jspb.Message.toObjectList(msg.getMissCountersList(),
    proto.terra.oracle.v1beta1.MissCounter.toObject, includeInstance),
    aggregateExchangeRatePrevotesList: jspb.Message.toObjectList(msg.getAggregateExchangeRatePrevotesList(),
    terra_oracle_v1beta1_oracle_pb.AggregateExchangeRatePrevote.toObject, includeInstance),
    aggregateExchangeRateVotesList: jspb.Message.toObjectList(msg.getAggregateExchangeRateVotesList(),
    terra_oracle_v1beta1_oracle_pb.AggregateExchangeRateVote.toObject, includeInstance),
    tobinTaxesList: jspb.Message.toObjectList(msg.getTobinTaxesList(),
    proto.terra.oracle.v1beta1.TobinTax.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.terra.oracle.v1beta1.GenesisState}
 */
proto.terra.oracle.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.terra.oracle.v1beta1.GenesisState;
  return proto.terra.oracle.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.terra.oracle.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.terra.oracle.v1beta1.GenesisState}
 */
proto.terra.oracle.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new terra_oracle_v1beta1_oracle_pb.Params;
      reader.readMessage(value,terra_oracle_v1beta1_oracle_pb.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.terra.oracle.v1beta1.FeederDelegation;
      reader.readMessage(value,proto.terra.oracle.v1beta1.FeederDelegation.deserializeBinaryFromReader);
      msg.addFeederDelegations(value);
      break;
    case 3:
      var value = new terra_oracle_v1beta1_oracle_pb.ExchangeRateTuple;
      reader.readMessage(value,terra_oracle_v1beta1_oracle_pb.ExchangeRateTuple.deserializeBinaryFromReader);
      msg.addExchangeRates(value);
      break;
    case 4:
      var value = new proto.terra.oracle.v1beta1.MissCounter;
      reader.readMessage(value,proto.terra.oracle.v1beta1.MissCounter.deserializeBinaryFromReader);
      msg.addMissCounters(value);
      break;
    case 5:
      var value = new terra_oracle_v1beta1_oracle_pb.AggregateExchangeRatePrevote;
      reader.readMessage(value,terra_oracle_v1beta1_oracle_pb.AggregateExchangeRatePrevote.deserializeBinaryFromReader);
      msg.addAggregateExchangeRatePrevotes(value);
      break;
    case 6:
      var value = new terra_oracle_v1beta1_oracle_pb.AggregateExchangeRateVote;
      reader.readMessage(value,terra_oracle_v1beta1_oracle_pb.AggregateExchangeRateVote.deserializeBinaryFromReader);
      msg.addAggregateExchangeRateVotes(value);
      break;
    case 7:
      var value = new proto.terra.oracle.v1beta1.TobinTax;
      reader.readMessage(value,proto.terra.oracle.v1beta1.TobinTax.deserializeBinaryFromReader);
      msg.addTobinTaxes(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.terra.oracle.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.terra.oracle.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.terra.oracle.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      terra_oracle_v1beta1_oracle_pb.Params.serializeBinaryToWriter
    );
  }
  f = message.getFeederDelegationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.terra.oracle.v1beta1.FeederDelegation.serializeBinaryToWriter
    );
  }
  f = message.getExchangeRatesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      terra_oracle_v1beta1_oracle_pb.ExchangeRateTuple.serializeBinaryToWriter
    );
  }
  f = message.getMissCountersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.terra.oracle.v1beta1.MissCounter.serializeBinaryToWriter
    );
  }
  f = message.getAggregateExchangeRatePrevotesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      terra_oracle_v1beta1_oracle_pb.AggregateExchangeRatePrevote.serializeBinaryToWriter
    );
  }
  f = message.getAggregateExchangeRateVotesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      terra_oracle_v1beta1_oracle_pb.AggregateExchangeRateVote.serializeBinaryToWriter
    );
  }
  f = message.getTobinTaxesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.terra.oracle.v1beta1.TobinTax.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.terra.oracle.v1beta1.Params}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.terra.oracle.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, terra_oracle_v1beta1_oracle_pb.Params, 1));
};


/**
 * @param {?proto.terra.oracle.v1beta1.Params|undefined} value
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
*/
proto.terra.oracle.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated FeederDelegation feeder_delegations = 2;
 * @return {!Array<!proto.terra.oracle.v1beta1.FeederDelegation>}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.getFeederDelegationsList = function() {
  return /** @type{!Array<!proto.terra.oracle.v1beta1.FeederDelegation>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.terra.oracle.v1beta1.FeederDelegation, 2));
};


/**
 * @param {!Array<!proto.terra.oracle.v1beta1.FeederDelegation>} value
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
*/
proto.terra.oracle.v1beta1.GenesisState.prototype.setFeederDelegationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.terra.oracle.v1beta1.FeederDelegation=} opt_value
 * @param {number=} opt_index
 * @return {!proto.terra.oracle.v1beta1.FeederDelegation}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.addFeederDelegations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.terra.oracle.v1beta1.FeederDelegation, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.clearFeederDelegationsList = function() {
  return this.setFeederDelegationsList([]);
};


/**
 * repeated ExchangeRateTuple exchange_rates = 3;
 * @return {!Array<!proto.terra.oracle.v1beta1.ExchangeRateTuple>}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.getExchangeRatesList = function() {
  return /** @type{!Array<!proto.terra.oracle.v1beta1.ExchangeRateTuple>} */ (
    jspb.Message.getRepeatedWrapperField(this, terra_oracle_v1beta1_oracle_pb.ExchangeRateTuple, 3));
};


/**
 * @param {!Array<!proto.terra.oracle.v1beta1.ExchangeRateTuple>} value
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
*/
proto.terra.oracle.v1beta1.GenesisState.prototype.setExchangeRatesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.terra.oracle.v1beta1.ExchangeRateTuple=} opt_value
 * @param {number=} opt_index
 * @return {!proto.terra.oracle.v1beta1.ExchangeRateTuple}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.addExchangeRates = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.terra.oracle.v1beta1.ExchangeRateTuple, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.clearExchangeRatesList = function() {
  return this.setExchangeRatesList([]);
};


/**
 * repeated MissCounter miss_counters = 4;
 * @return {!Array<!proto.terra.oracle.v1beta1.MissCounter>}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.getMissCountersList = function() {
  return /** @type{!Array<!proto.terra.oracle.v1beta1.MissCounter>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.terra.oracle.v1beta1.MissCounter, 4));
};


/**
 * @param {!Array<!proto.terra.oracle.v1beta1.MissCounter>} value
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
*/
proto.terra.oracle.v1beta1.GenesisState.prototype.setMissCountersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.terra.oracle.v1beta1.MissCounter=} opt_value
 * @param {number=} opt_index
 * @return {!proto.terra.oracle.v1beta1.MissCounter}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.addMissCounters = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.terra.oracle.v1beta1.MissCounter, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.clearMissCountersList = function() {
  return this.setMissCountersList([]);
};


/**
 * repeated AggregateExchangeRatePrevote aggregate_exchange_rate_prevotes = 5;
 * @return {!Array<!proto.terra.oracle.v1beta1.AggregateExchangeRatePrevote>}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.getAggregateExchangeRatePrevotesList = function() {
  return /** @type{!Array<!proto.terra.oracle.v1beta1.AggregateExchangeRatePrevote>} */ (
    jspb.Message.getRepeatedWrapperField(this, terra_oracle_v1beta1_oracle_pb.AggregateExchangeRatePrevote, 5));
};


/**
 * @param {!Array<!proto.terra.oracle.v1beta1.AggregateExchangeRatePrevote>} value
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
*/
proto.terra.oracle.v1beta1.GenesisState.prototype.setAggregateExchangeRatePrevotesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.terra.oracle.v1beta1.AggregateExchangeRatePrevote=} opt_value
 * @param {number=} opt_index
 * @return {!proto.terra.oracle.v1beta1.AggregateExchangeRatePrevote}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.addAggregateExchangeRatePrevotes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.terra.oracle.v1beta1.AggregateExchangeRatePrevote, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.clearAggregateExchangeRatePrevotesList = function() {
  return this.setAggregateExchangeRatePrevotesList([]);
};


/**
 * repeated AggregateExchangeRateVote aggregate_exchange_rate_votes = 6;
 * @return {!Array<!proto.terra.oracle.v1beta1.AggregateExchangeRateVote>}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.getAggregateExchangeRateVotesList = function() {
  return /** @type{!Array<!proto.terra.oracle.v1beta1.AggregateExchangeRateVote>} */ (
    jspb.Message.getRepeatedWrapperField(this, terra_oracle_v1beta1_oracle_pb.AggregateExchangeRateVote, 6));
};


/**
 * @param {!Array<!proto.terra.oracle.v1beta1.AggregateExchangeRateVote>} value
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
*/
proto.terra.oracle.v1beta1.GenesisState.prototype.setAggregateExchangeRateVotesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.terra.oracle.v1beta1.AggregateExchangeRateVote=} opt_value
 * @param {number=} opt_index
 * @return {!proto.terra.oracle.v1beta1.AggregateExchangeRateVote}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.addAggregateExchangeRateVotes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.terra.oracle.v1beta1.AggregateExchangeRateVote, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.clearAggregateExchangeRateVotesList = function() {
  return this.setAggregateExchangeRateVotesList([]);
};


/**
 * repeated TobinTax tobin_taxes = 7;
 * @return {!Array<!proto.terra.oracle.v1beta1.TobinTax>}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.getTobinTaxesList = function() {
  return /** @type{!Array<!proto.terra.oracle.v1beta1.TobinTax>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.terra.oracle.v1beta1.TobinTax, 7));
};


/**
 * @param {!Array<!proto.terra.oracle.v1beta1.TobinTax>} value
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
*/
proto.terra.oracle.v1beta1.GenesisState.prototype.setTobinTaxesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.terra.oracle.v1beta1.TobinTax=} opt_value
 * @param {number=} opt_index
 * @return {!proto.terra.oracle.v1beta1.TobinTax}
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.addTobinTaxes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.terra.oracle.v1beta1.TobinTax, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.terra.oracle.v1beta1.GenesisState} returns this
 */
proto.terra.oracle.v1beta1.GenesisState.prototype.clearTobinTaxesList = function() {
  return this.setTobinTaxesList([]);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.terra.oracle.v1beta1.FeederDelegation.prototype.toObject = function(opt_includeInstance) {
  return proto.terra.oracle.v1beta1.FeederDelegation.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.terra.oracle.v1beta1.FeederDelegation} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.terra.oracle.v1beta1.FeederDelegation.toObject = function(includeInstance, msg) {
  var f, obj = {
    feederAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    validatorAddress: jspb.Message.getFieldWithDefault(msg, 2, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.terra.oracle.v1beta1.FeederDelegation}
 */
proto.terra.oracle.v1beta1.FeederDelegation.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.terra.oracle.v1beta1.FeederDelegation;
  return proto.terra.oracle.v1beta1.FeederDelegation.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.terra.oracle.v1beta1.FeederDelegation} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.terra.oracle.v1beta1.FeederDelegation}
 */
proto.terra.oracle.v1beta1.FeederDelegation.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeederAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidatorAddress(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.terra.oracle.v1beta1.FeederDelegation.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.terra.oracle.v1beta1.FeederDelegation.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.terra.oracle.v1beta1.FeederDelegation} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.terra.oracle.v1beta1.FeederDelegation.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeederAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getValidatorAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string feeder_address = 1;
 * @return {string}
 */
proto.terra.oracle.v1beta1.FeederDelegation.prototype.getFeederAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.terra.oracle.v1beta1.FeederDelegation} returns this
 */
proto.terra.oracle.v1beta1.FeederDelegation.prototype.setFeederAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string validator_address = 2;
 * @return {string}
 */
proto.terra.oracle.v1beta1.FeederDelegation.prototype.getValidatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.terra.oracle.v1beta1.FeederDelegation} returns this
 */
proto.terra.oracle.v1beta1.FeederDelegation.prototype.setValidatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.terra.oracle.v1beta1.MissCounter.prototype.toObject = function(opt_includeInstance) {
  return proto.terra.oracle.v1beta1.MissCounter.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.terra.oracle.v1beta1.MissCounter} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.terra.oracle.v1beta1.MissCounter.toObject = function(includeInstance, msg) {
  var f, obj = {
    validatorAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    missCounter: jspb.Message.getFieldWithDefault(msg, 2, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.terra.oracle.v1beta1.MissCounter}
 */
proto.terra.oracle.v1beta1.MissCounter.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.terra.oracle.v1beta1.MissCounter;
  return proto.terra.oracle.v1beta1.MissCounter.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.terra.oracle.v1beta1.MissCounter} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.terra.oracle.v1beta1.MissCounter}
 */
proto.terra.oracle.v1beta1.MissCounter.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidatorAddress(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMissCounter(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.terra.oracle.v1beta1.MissCounter.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.terra.oracle.v1beta1.MissCounter.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.terra.oracle.v1beta1.MissCounter} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.terra.oracle.v1beta1.MissCounter.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getValidatorAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMissCounter();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
};


/**
 * optional string validator_address = 1;
 * @return {string}
 */
proto.terra.oracle.v1beta1.MissCounter.prototype.getValidatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.terra.oracle.v1beta1.MissCounter} returns this
 */
proto.terra.oracle.v1beta1.MissCounter.prototype.setValidatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 miss_counter = 2;
 * @return {number}
 */
proto.terra.oracle.v1beta1.MissCounter.prototype.getMissCounter = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.terra.oracle.v1beta1.MissCounter} returns this
 */
proto.terra.oracle.v1beta1.MissCounter.prototype.setMissCounter = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.terra.oracle.v1beta1.TobinTax.prototype.toObject = function(opt_includeInstance) {
  return proto.terra.oracle.v1beta1.TobinTax.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.terra.oracle.v1beta1.TobinTax} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.terra.oracle.v1beta1.TobinTax.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    tobinTax: jspb.Message.getFieldWithDefault(msg, 2, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.terra.oracle.v1beta1.TobinTax}
 */
proto.terra.oracle.v1beta1.TobinTax.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.terra.oracle.v1beta1.TobinTax;
  return proto.terra.oracle.v1beta1.TobinTax.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.terra.oracle.v1beta1.TobinTax} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.terra.oracle.v1beta1.TobinTax}
 */
proto.terra.oracle.v1beta1.TobinTax.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTobinTax(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.terra.oracle.v1beta1.TobinTax.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.terra.oracle.v1beta1.TobinTax.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.terra.oracle.v1beta1.TobinTax} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.terra.oracle.v1beta1.TobinTax.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTobinTax();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.terra.oracle.v1beta1.TobinTax.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.terra.oracle.v1beta1.TobinTax} returns this
 */
proto.terra.oracle.v1beta1.TobinTax.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string tobin_tax = 2;
 * @return {string}
 */
proto.terra.oracle.v1beta1.TobinTax.prototype.getTobinTax = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.terra.oracle.v1beta1.TobinTax} returns this
 */
proto.terra.oracle.v1beta1.TobinTax.prototype.setTobinTax = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


goog.object.extend(exports, proto.terra.oracle.v1beta1);
