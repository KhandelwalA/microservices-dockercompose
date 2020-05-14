package com.khandewal.asset.investment.repository;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.khandewal.asset.investment.domainmodel.InvestmentAsset;

/**
 * This interface extends MongoRepository of Springframework, implementation of
 * which is provided by Spring with basic CRUD operations and developer neither
 * need to make connection with db nor to write basic CRUD operations
 * 
 * @author Abhishek Khandelwal
 *
 */
public interface InvestmentAssetRepository extends MongoRepository<InvestmentAsset, String> {

	public Collection<InvestmentAsset> findByAssetName(String assetName);

	public Collection<InvestmentAsset> findByAssetType(String assetType);

	public Collection<InvestmentAsset> findByAssetNameAndAssetType(String assetName, String assetType);

}